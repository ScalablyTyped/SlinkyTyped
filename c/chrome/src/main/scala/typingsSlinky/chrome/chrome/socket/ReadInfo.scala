package typingsSlinky.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  var resultCode: Double
}

object ReadInfo {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer, resultCode: Double): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadInfo]
  }
}

