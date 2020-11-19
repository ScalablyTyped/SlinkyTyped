package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Cipher")
@js.native
class Cipher protected () extends Transform {
  
  def `final`(): Buffer = js.native
  def `final`(output_encoding: BufferEncoding): String = js.native
  
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  
  def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: HexBase64BinaryEncoding): String = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding): Buffer = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding, output_encoding: HexBase64BinaryEncoding): String = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: HexBase64BinaryEncoding
  ): String = js.native
  def update(data: BinaryLike): Buffer = js.native
}
