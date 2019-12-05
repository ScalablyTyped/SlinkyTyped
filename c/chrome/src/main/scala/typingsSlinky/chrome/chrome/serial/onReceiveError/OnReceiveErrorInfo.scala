package typingsSlinky.chrome.chrome.serial.onReceiveError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveErrorInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: Double
  /** The data received. */
  var error: scala.scalajs.js.typedarray.ArrayBuffer
}

object OnReceiveErrorInfo {
  @scala.inline
  def apply(connectionId: Double, error: scala.scalajs.js.typedarray.ArrayBuffer): OnReceiveErrorInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnReceiveErrorInfo]
  }
}

