package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsIntOptions extends MinMaxExtendedOptions {
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.native
}

object IsIntOptions {
  @scala.inline
  def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  @scala.inline
  implicit class IsIntOptionsOps[Self <: IsIntOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_leading_zeroes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_leading_zeroes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_leading_zeroes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_leading_zeroes")(js.undefined)
        ret
    }
  }
  
}

