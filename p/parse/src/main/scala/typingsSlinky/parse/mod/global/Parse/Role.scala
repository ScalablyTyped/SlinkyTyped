package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Role on the Parse server. Roles represent groupings of
  * Users for the purposes of granting permissions (e.g. specifying an ACL
  * for an Object). Roles are specified by their sets of child users and
  * child roles, all of which are granted any permissions that the parent
  * role has.
  *
  * <p>Roles must have a name (which cannot be changed after creation of the
  * role), and must specify an ACL.</p>
  * A Parse.Role is a local representation of a role persisted to the Parse
  * cloud.
  */
@js.native
trait Role[T /* <: Attributes */] extends Object[T] {
  
  def getName(): String = js.native
  
  def getRoles(): Relation[
    typingsSlinky.parse.mod.global.Parse.Role[Attributes], 
    typingsSlinky.parse.mod.global.Parse.Role[Attributes]
  ] = js.native
  
  def getUsers[U /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](): Relation[typingsSlinky.parse.mod.global.Parse.Role[Attributes], U] = js.native
  
  def setName(name: String): js.Any = js.native
  def setName(name: String, options: SuccessFailureOptions): js.Any = js.native
}
