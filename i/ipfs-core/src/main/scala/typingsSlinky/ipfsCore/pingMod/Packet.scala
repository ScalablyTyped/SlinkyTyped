package typingsSlinky.ipfsCore.pingMod

import typingsSlinky.ipfsCore.ipfsCoreBooleans.`false`
import typingsSlinky.ipfsCore.ipfsCoreBooleans.`true`
import typingsSlinky.ipfsCore.ipfsCoreNumbers.`0`
import typingsSlinky.ipfsCore.ipfsCoreStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCore.pingMod.Pong
  - typingsSlinky.ipfsCore.pingMod.PingFailure
  - typingsSlinky.ipfsCore.pingMod.StatusUpdate
*/
trait Packet extends js.Object
object Packet {
  
  @scala.inline
  def Pong(success: `true`, text: _empty, time: Double): Packet = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def PingFailure(success: `false`, text: String, time: Double): Packet = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def StatusUpdate(success: `true`, text: String, time: `0`): Packet = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}
