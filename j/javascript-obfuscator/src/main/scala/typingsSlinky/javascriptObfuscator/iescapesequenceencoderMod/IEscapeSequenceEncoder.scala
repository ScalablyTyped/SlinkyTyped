package typingsSlinky.javascriptObfuscator.iescapesequenceencoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEscapeSequenceEncoder extends js.Object {
  /**
    * @param {string} string
    * @param {boolean} encodeAllSymbols
    * @returns {string}
    */
  def encode(string: String, encodeAllSymbols: Boolean): String = js.native
}

object IEscapeSequenceEncoder {
  @scala.inline
  def apply(encode: (String, Boolean) => String): IEscapeSequenceEncoder = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode))
    __obj.asInstanceOf[IEscapeSequenceEncoder]
  }
  @scala.inline
  implicit class IEscapeSequenceEncoderOps[Self <: IEscapeSequenceEncoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

