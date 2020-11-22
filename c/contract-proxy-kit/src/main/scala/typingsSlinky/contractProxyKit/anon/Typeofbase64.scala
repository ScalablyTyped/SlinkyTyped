package typingsSlinky.contractProxyKit.anon

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbase64 extends js.Object {
  
  def decode(textData: String): js.typedarray.Uint8Array = js.native
  
  def encode(data: BytesLike): String = js.native
}
object Typeofbase64 {
  
  @scala.inline
  def apply(decode: String => js.typedarray.Uint8Array, encode: BytesLike => String): Typeofbase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Typeofbase64]
  }
  
  @scala.inline
  implicit class Typeofbase64Ops[Self <: Typeofbase64] (val x: Self) extends AnyVal {
    
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
    def setEncode(value: BytesLike => String): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
