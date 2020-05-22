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
import scala.scalajs.js.annotation._

trait Break extends js.Object {
  /* The device detected a break condition. */
  var break: typingsSlinky.chrome.chromeStrings.break
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: typingsSlinky.chrome.chromeStrings.buffer_overflow
  /* The device was most likely disconnected from the host. */
  var device_lost: typingsSlinky.chrome.chromeStrings.device_lost
  /* The connection was disconnected. */
  var disconnected: typingsSlinky.chrome.chromeStrings.disconnected
  /* The device detected a framing error. */
  var frame_error: typingsSlinky.chrome.chromeStrings.frame_error
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: typingsSlinky.chrome.chromeStrings.overrun
  /* The device detected a parity error. */
  var parity_error: typingsSlinky.chrome.chromeStrings.parity_error
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: typingsSlinky.chrome.chromeStrings.system_error
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: typingsSlinky.chrome.chromeStrings.timeout
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
}

