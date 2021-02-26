package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Decipher")
@js.native
class Decipher protected () extends Transform {
  
  def `final`(): Buffer = js.native
  def `final`(output_encoding: BufferEncoding): String = js.native
  
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  
  def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: Utf8AsciiBinaryEncoding): String = js.native
  def update(data: String, input_encoding: HexBase64BinaryEncoding): Buffer = js.native
  def update(data: String, input_encoding: HexBase64BinaryEncoding, output_encoding: Utf8AsciiBinaryEncoding): String = js.native
  def update(data: ArrayBufferView): Buffer = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: Utf8AsciiBinaryEncoding
  ): String = js.native
  def update(
    data: ArrayBufferView,
    input_encoding: HexBase64BinaryEncoding,
    output_encoding: Utf8AsciiBinaryEncoding
  ): String = js.native
}
