package typingsSlinky.multibase.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codec extends js.Object {
  
  def decode(hash: String): js.typedarray.Uint8Array = js.native
  
  def encode(buffer: js.typedarray.Uint8Array): String = js.native
}
object Codec {
  
  @scala.inline
  def apply(decode: String => js.typedarray.Uint8Array, encode: js.typedarray.Uint8Array => String): Codec = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Codec]
  }
  
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecode(value: String => js.typedarray.Uint8Array): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.typedarray.Uint8Array => String): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
