package typingsSlinky.freedom.freedom.TcpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: scala.scalajs.js.typedarray.ArrayBuffer
}

object ReadInfo {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadInfo]
  }
}

