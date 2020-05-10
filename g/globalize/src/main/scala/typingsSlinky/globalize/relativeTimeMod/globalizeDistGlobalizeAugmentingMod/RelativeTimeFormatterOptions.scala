package typingsSlinky.globalize.relativeTimeMod.globalizeDistGlobalizeAugmentingMod

import typingsSlinky.globalize.globalizeStrings.narrow
import typingsSlinky.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeFormatterOptions extends js.Object {
  /**
  		 * eg. "short" or "narrow". Or falsy for default long form
  		 */
  var form: js.UndefOr[short | narrow] = js.native
}

object RelativeTimeFormatterOptions {
  @scala.inline
  def apply(): RelativeTimeFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeFormatterOptions]
  }
  @scala.inline
  implicit class RelativeTimeFormatterOptionsOps[Self <: RelativeTimeFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForm(value: short | narrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
  }
  
}

