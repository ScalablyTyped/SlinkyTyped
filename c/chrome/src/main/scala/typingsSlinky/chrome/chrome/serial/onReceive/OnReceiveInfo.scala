package typingsSlinky.chrome.chrome.serial.onReceive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: Double
  /** The data received. */
  var data: scala.scalajs.js.typedarray.ArrayBuffer
}

object OnReceiveInfo {
  @scala.inline
  def apply(connectionId: Double, data: scala.scalajs.js.typedarray.ArrayBuffer): OnReceiveInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnReceiveInfo]
  }
}

