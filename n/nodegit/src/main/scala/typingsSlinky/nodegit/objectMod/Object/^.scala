package typingsSlinky.nodegit.objectMod.Object

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/object", "Object")
@js.native
object ^ extends js.Object {
  
  def lookup(repo: Repository, id: Oid, `type`: TYPE): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  
  def lookupPrefix(repo: Repository, id: Oid, len: Double, `type`: TYPE): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  
  def size(`type`: TYPE): Double = js.native
  
  def string2Type(str: String): TYPE = js.native
  
  def type2String(`type`: TYPE): String = js.native
  
  def typeisloose(`type`: TYPE): Double = js.native
}
