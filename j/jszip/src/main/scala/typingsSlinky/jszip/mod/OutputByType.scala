package typingsSlinky.jszip.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputByType extends js.Object {
  var array: js.Array[Double] = js.native
  var arraybuffer: js.typedarray.ArrayBuffer = js.native
  var base64: String = js.native
  var binarystring: String = js.native
  var blob: Blob = js.native
  var nodebuffer: Buffer = js.native
  var string: String = js.native
  var text: String = js.native
  var uint8array: js.typedarray.Uint8Array = js.native
}

object OutputByType {
  @scala.inline
  def apply(
    array: js.Array[Double],
    arraybuffer: js.typedarray.ArrayBuffer,
    base64: String,
    binarystring: String,
    blob: Blob,
    nodebuffer: Buffer,
    string: String,
    text: String,
    uint8array: js.typedarray.Uint8Array
  ): OutputByType = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arraybuffer = arraybuffer.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binarystring = binarystring.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputByType]
  }
  @scala.inline
  implicit class OutputByTypeOps[Self <: OutputByType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArraybuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arraybuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinarystring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodebuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodebuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUint8array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint8array")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

