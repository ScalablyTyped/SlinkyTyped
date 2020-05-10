package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMobilePhoneOptions extends js.Object {
  var strictMode: js.UndefOr[Boolean] = js.native
}

object IsMobilePhoneOptions {
  @scala.inline
  def apply(): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
  @scala.inline
  implicit class IsMobilePhoneOptionsOps[Self <: IsMobilePhoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(js.undefined)
        ret
    }
  }
  
}

