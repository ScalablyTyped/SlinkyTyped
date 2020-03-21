package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Transport")
@js.native
class Transport ()
  extends typingsSlinky.nodegit.transportMod.Transport

/* static members */
@JSImport("nodegit", "Transport")
@js.native
object Transport extends js.Object {
  def sshWithPaths(owner: typingsSlinky.nodegit.remoteMod.Remote, payload: String): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: typingsSlinky.nodegit.remoteMod.Remote, payload: js.Array[String]): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: typingsSlinky.nodegit.remoteMod.Remote, payload: typingsSlinky.nodegit.strArrayMod.Strarray): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def unregister(prefix: String): Double = js.native
}

