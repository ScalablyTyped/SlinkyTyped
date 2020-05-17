package typingsSlinky.node.dnsMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Hostname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "lookupService")
@js.native
object lookupService extends js.Object {
  def apply(
    address: String,
    port: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(address: String, port: Double): js.Promise[Hostname] = js.native
}

