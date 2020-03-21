package typingsSlinky.node.dnsMod

import typingsSlinky.node.AnonHostname
import typingsSlinky.node.NodeJS.ErrnoException
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
  def promisify(address: String, port: Double): js.Promise[AnonHostname] = js.native
}

