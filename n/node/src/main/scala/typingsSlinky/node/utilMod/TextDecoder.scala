package typingsSlinky.node.utilMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.Fatal
import typingsSlinky.node.anon.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("util", "TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(encoding: String) = this()
  def this(encoding: js.UndefOr[scala.Nothing], options: Fatal) = this()
  def this(encoding: String, options: Fatal) = this()
  
  def decode(): String = js.native
  def decode(input: js.UndefOr[ArrayBufferView], options: Stream): String = js.native
  def decode(input: Null, options: Stream): String = js.native
  def decode(input: ArrayBufferView): String = js.native
  def decode(input: js.typedarray.ArrayBuffer): String = js.native
  def decode(input: js.typedarray.ArrayBuffer, options: Stream): String = js.native
  
  val encoding: String = js.native
  
  val fatal: Boolean = js.native
  
  val ignoreBOM: Boolean = js.native
}
