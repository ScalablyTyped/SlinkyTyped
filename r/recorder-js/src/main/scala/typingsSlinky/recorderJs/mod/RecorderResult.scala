package typingsSlinky.recorderJs.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderResult extends js.Object {
  var blob: Blob
  var buffer: js.Array[js.typedarray.Float32Array]
}

object RecorderResult {
  @scala.inline
  def apply(blob: Blob, buffer: js.Array[js.typedarray.Float32Array]): RecorderResult = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderResult]
  }
}

