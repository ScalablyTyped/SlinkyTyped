package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress
  - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript
*/
trait PsbtOutputExtended extends js.Object
object PsbtOutputExtended {
  
  @scala.inline
  def PsbtOutputExtendedAddress(address: String, value: Double): PsbtOutputExtended = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtended]
  }
  
  @scala.inline
  def PsbtOutputExtendedScript(script: Buffer, value: Double): PsbtOutputExtended = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtended]
  }
}
