package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.objectMod.Object.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends typingsSlinky.nodegit.objectMod.Object
/* static members */
object Object {
  
  @JSImport("nodegit", "Object.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    `type`: TYPE
  ): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  
  @JSImport("nodegit", "Object.lookupPrefix")
  @js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double,
    `type`: TYPE
  ): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  
  @JSImport("nodegit", "Object.size")
  @js.native
  def size(`type`: TYPE): Double = js.native
  
  @JSImport("nodegit", "Object.string2Type")
  @js.native
  def string2Type(str: String): TYPE = js.native
  
  @JSImport("nodegit", "Object.type2String")
  @js.native
  def type2String(`type`: TYPE): String = js.native
  
  @JSImport("nodegit", "Object.typeisloose")
  @js.native
  def typeisloose(`type`: TYPE): Double = js.native
}
