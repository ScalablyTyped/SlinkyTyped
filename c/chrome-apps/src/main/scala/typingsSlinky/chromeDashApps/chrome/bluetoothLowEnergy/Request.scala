package typingsSlinky.chromeDashApps.chrome.bluetoothLowEnergy

import typingsSlinky.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /** Device that send this request. */
  var device: RequestDevice
  /** Unique ID for this request. Use this ID when responding to this request. */
  var requestId: integer
  /** Value to write (if this is a write request). */
  var value: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object Request {
  @scala.inline
  def apply(device: RequestDevice, requestId: integer, value: scala.scalajs.js.typedarray.ArrayBuffer = null): Request = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

