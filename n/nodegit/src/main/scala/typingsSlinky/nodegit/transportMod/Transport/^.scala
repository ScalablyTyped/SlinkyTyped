package typingsSlinky.nodegit.transportMod.Transport

import typingsSlinky.nodegit.remoteMod.Remote
import typingsSlinky.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
object ^ extends js.Object {
  def sshWithPaths(owner: Remote, payload: String): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: Remote, payload: js.Array[String]): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: Remote, payload: Strarray): js.Promise[typingsSlinky.nodegit.transportMod.Transport] = js.native
  def unregister(prefix: String): Double = js.native
}

