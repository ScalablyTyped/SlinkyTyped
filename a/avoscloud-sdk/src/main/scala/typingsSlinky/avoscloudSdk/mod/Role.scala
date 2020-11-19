package typingsSlinky.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Role on the AV server. Roles represent groupings of
  * Users for the purposes of granting permissions (e.g. specifying an ACL
  * for an Object). Roles are specified by their sets of child users and
  * child roles, all of which are granted any permissions that the parent
  * role has.
  *
  * <p>Roles must have a name (which cannot be changed after creation of the
  * role), and must specify an ACL.</p>
  * @class
  * A AV.Role is a local representation of a role persisted to the AV
  * cloud.
  */
@JSImport("avoscloud-sdk", "Role")
@js.native
class Role protected () extends Object {
  def this(name: String, acl: ACL) = this()
  
  def getName(): String = js.native
  
  def getRoles(): Relation = js.native
  
  def getUsers(): Relation = js.native
  
  def setName(name: String): js.Any = js.native
  def setName(name: String, options: SuccessFailureOptions): js.Any = js.native
}
