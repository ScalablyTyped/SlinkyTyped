package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chromeStrings.break
import typingsSlinky.chrome.chromeStrings.buffer_overflow
import typingsSlinky.chrome.chromeStrings.device_lost
import typingsSlinky.chrome.chromeStrings.disconnected
import typingsSlinky.chrome.chromeStrings.frame_error
import typingsSlinky.chrome.chromeStrings.overrun
import typingsSlinky.chrome.chromeStrings.parity_error
import typingsSlinky.chrome.chromeStrings.system_error
import typingsSlinky.chrome.chromeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Break extends js.Object {
  
  /* The device detected a break condition. */
  var break: typingsSlinky.chrome.chromeStrings.break = js.native
  
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: typingsSlinky.chrome.chromeStrings.buffer_overflow = js.native
  
  /* The device was most likely disconnected from the host. */
  var device_lost: typingsSlinky.chrome.chromeStrings.device_lost = js.native
  
  /* The connection was disconnected. */
  var disconnected: typingsSlinky.chrome.chromeStrings.disconnected = js.native
  
  /* The device detected a framing error. */
  var frame_error: typingsSlinky.chrome.chromeStrings.frame_error = js.native
  
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: typingsSlinky.chrome.chromeStrings.overrun = js.native
  
  /* The device detected a parity error. */
  var parity_error: typingsSlinky.chrome.chromeStrings.parity_error = js.native
  
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: typingsSlinky.chrome.chromeStrings.system_error = js.native
  
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: typingsSlinky.chrome.chromeStrings.timeout = js.native
}
object Break {
  
  @scala.inline
  def apply(
    break: break,
    buffer_overflow: buffer_overflow,
    device_lost: device_lost,
    disconnected: disconnected,
    frame_error: frame_error,
    overrun: overrun,
    parity_error: parity_error,
    system_error: system_error,
    timeout: timeout
  ): Break = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], buffer_overflow = buffer_overflow.asInstanceOf[js.Any], device_lost = device_lost.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], frame_error = frame_error.asInstanceOf[js.Any], overrun = overrun.asInstanceOf[js.Any], parity_error = parity_error.asInstanceOf[js.Any], system_error = system_error.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  
  @scala.inline
  implicit class BreakOps[Self <: Break] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreak(value: break): Self = this.set("break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer_overflow(value: buffer_overflow): Self = this.set("buffer_overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_lost(value: device_lost): Self = this.set("device_lost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnected(value: disconnected): Self = this.set("disconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame_error(value: frame_error): Self = this.set("frame_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrun(value: overrun): Self = this.set("overrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParity_error(value: parity_error): Self = this.set("parity_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_error(value: system_error): Self = this.set("system_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: timeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
