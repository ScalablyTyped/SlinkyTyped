package typingsSlinky.fastDashTextDashEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextDecoder instance.
  */
@JSGlobal("fastTextEncoding.TextDecoderClass")
@js.native
class TextDecoderClass () extends js.Object {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: TextDecoderOptions) = this()
  var encoding: String = js.native
  var fatal: Boolean = js.native
  var ignoreBOM: Boolean = js.native
  def decode(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def decode(buffer: scala.scalajs.js.typedarray.Uint8Array, options: TextEncodingOptions): String = js.native
}

