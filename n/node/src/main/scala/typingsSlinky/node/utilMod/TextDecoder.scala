package typingsSlinky.node.utilMod

import typingsSlinky.node.Anon_Fatal
import typingsSlinky.node.Anon_Stream
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(encoding: java.lang.String) = this()
  def this(encoding: java.lang.String, options: Anon_Fatal) = this()
  val encoding: java.lang.String = js.native
  val fatal: Boolean = js.native
  val ignoreBOM: Boolean = js.native
  def decode(): java.lang.String = js.native
  def decode(input: Null, options: Anon_Stream): java.lang.String = js.native
  def decode(input: ArrayBufferView): java.lang.String = js.native
  def decode(input: ArrayBufferView, options: Anon_Stream): java.lang.String = js.native
  def decode(input: ArrayBuffer): java.lang.String = js.native
  def decode(input: ArrayBuffer, options: Anon_Stream): java.lang.String = js.native
}

