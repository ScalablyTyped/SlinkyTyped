package typingsSlinky.freedom.freedom.RTCDataChannel

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var binary: js.UndefOr[Blob] = js.undefined
  var buffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  // Exactly one of the below must be specified.
  var text: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(binary: Blob = null, buffer: js.typedarray.ArrayBuffer = null, text: String = null): Message = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

