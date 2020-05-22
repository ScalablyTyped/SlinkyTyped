package typingsSlinky.freedom.freedom.TcpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: js.typedarray.ArrayBuffer
}

object ReadInfo {
  @scala.inline
  def apply(data: js.typedarray.ArrayBuffer): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadInfo]
  }
}

