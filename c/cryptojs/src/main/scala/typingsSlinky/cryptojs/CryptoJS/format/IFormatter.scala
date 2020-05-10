package typingsSlinky.cryptojs.CryptoJS.format

import typingsSlinky.cryptojs.CryptoJS.lib.CipherParams
import typingsSlinky.cryptojs.CryptoJS.lib.CipherParamsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatter extends js.Object {
  def parse(s: String): CipherParams = js.native
  def stringify(cipherParams: CipherParamsData): String = js.native
}

object IFormatter {
  @scala.inline
  def apply(parse: String => CipherParams, stringify: CipherParamsData => String): IFormatter = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[IFormatter]
  }
  @scala.inline
  implicit class IFormatterOps[Self <: IFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: String => CipherParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringify(value: CipherParamsData => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

