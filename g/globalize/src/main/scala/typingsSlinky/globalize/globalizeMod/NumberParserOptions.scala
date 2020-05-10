package typingsSlinky.globalize.globalizeMod

import typingsSlinky.globalize.globalizeStrings.decimal
import typingsSlinky.globalize.globalizeStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberParserOptions extends js.Object {
  /**
  		 * decimal (default), or percent.
  		 */
  var style: js.UndefOr[decimal | percent] = js.native
}

object NumberParserOptions {
  @scala.inline
  def apply(): NumberParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberParserOptions]
  }
  @scala.inline
  implicit class NumberParserOptionsOps[Self <: NumberParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: decimal | percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

