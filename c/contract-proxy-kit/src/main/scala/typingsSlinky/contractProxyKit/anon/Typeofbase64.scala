package typingsSlinky.contractProxyKit.anon

import typingsSlinky.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbase64 extends js.Object {
  def decode(textData: String): js.typedarray.Uint8Array = js.native
  def encode(data: Arrayish): String = js.native
}

object Typeofbase64 {
  @scala.inline
  def apply(decode: String => js.typedarray.Uint8Array, encode: Arrayish => String): Typeofbase64 = {
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
    def withDecode(value: String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: Arrayish => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

