package typingsSlinky.nodeForge.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBufferView extends js.Object {
  var buffer: js.typedarray.ArrayBuffer
  var byteLength: Double
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: js.typedarray.ArrayBuffer, byteLength: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
}

