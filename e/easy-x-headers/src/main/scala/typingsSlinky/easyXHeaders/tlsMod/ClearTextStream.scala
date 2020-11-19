package typingsSlinky.easyXHeaders.tlsMod

import typingsSlinky.easyXHeaders.anon.Address
import typingsSlinky.easyXHeaders.anon.Name
import typingsSlinky.easyXHeaders.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearTextStream extends Duplex {
  
  var address: Address = js.native
  
  var authorizationError: js.Error = js.native
  
  var authorized: Boolean = js.native
  
  var getCipher: Name = js.native
  
  def getPeerCertificate(): js.Any = js.native
  
  var remoteAddress: String = js.native
  
  var remotePort: Double = js.native
}
