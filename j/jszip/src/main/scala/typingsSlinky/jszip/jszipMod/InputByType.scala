package typingsSlinky.jszip.jszipMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputByType extends js.Object {
  var array: js.Array[Double]
  var arraybuffer: scala.scalajs.js.typedarray.ArrayBuffer
  var base64: String
  var binarystring: String
  var blob: Blob
  var stream: ReadableStream
  var string: String
  var text: String
  var uint8array: scala.scalajs.js.typedarray.Uint8Array
}

object InputByType {
  @scala.inline
  def apply(
    array: js.Array[Double],
    arraybuffer: scala.scalajs.js.typedarray.ArrayBuffer,
    base64: String,
    binarystring: String,
    blob: Blob,
    stream: ReadableStream,
    string: String,
    text: String,
    uint8array: scala.scalajs.js.typedarray.Uint8Array
  ): InputByType = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arraybuffer = arraybuffer.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binarystring = binarystring.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputByType]
  }
}

