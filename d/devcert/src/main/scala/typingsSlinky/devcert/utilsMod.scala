package typingsSlinky.devcert

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def mktmp(): String = js.native
  def openssl(cmd: String): Buffer = js.native
  def reportableError(message: String): js.Error = js.native
  def run(cmd: String): Buffer = js.native
  def run(cmd: String, options: ExecSyncOptions): Buffer = js.native
  def sudo(cmd: String): js.Promise[String | Null] = js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}

