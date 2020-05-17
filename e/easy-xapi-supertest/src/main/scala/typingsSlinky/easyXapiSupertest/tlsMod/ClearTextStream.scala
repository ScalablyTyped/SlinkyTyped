package typingsSlinky.easyXapiSupertest.tlsMod

import typingsSlinky.easyXapiSupertest.anon.Address
import typingsSlinky.easyXapiSupertest.anon.Name
import typingsSlinky.easyXapiSupertest.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream extends Duplex {
  var address: Address = js.native
  var authorizationError: js.Error = js.native
  var authorized: Boolean = js.native
  var getCipher: Name = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

