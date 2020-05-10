package typingsSlinky.antdMobile.wingBlankPropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.lg
import typingsSlinky.antdMobile.antdMobileStrings.md
import typingsSlinky.antdMobile.antdMobileStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WingBlankPropsType extends js.Object {
  var size: js.UndefOr[sm | md | lg] = js.native
}

object WingBlankPropsType {
  @scala.inline
  def apply(): WingBlankPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WingBlankPropsType]
  }
  @scala.inline
  implicit class WingBlankPropsTypeOps[Self <: WingBlankPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: sm | md | lg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

