package typingsSlinky.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextEncoder instance.
  */
@JSGlobal("fastTextEncoding.TextEncoderClass")
@js.native
class TextEncoderClass () extends js.Object {
  def this(label: String) = this()
  var encoding: String = js.native
  def encode(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def encode(string: String, options: TextEncodingOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
}

