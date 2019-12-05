package typingsSlinky.nodegit.nodegitMod

import typingsSlinky.nodegit.objectMod.Object.TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends typingsSlinky.nodegit.objectMod.Object

/* static members */
@JSImport("nodegit", "Object")
@js.native
object Object extends js.Object {
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    `type`: TYPE
  ): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double,
    `type`: TYPE
  ): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
  def size(`type`: TYPE): Double = js.native
  def string2Type(str: String): TYPE = js.native
  def type2String(`type`: TYPE): String = js.native
  def typeisloose(`type`: TYPE): Double = js.native
}

