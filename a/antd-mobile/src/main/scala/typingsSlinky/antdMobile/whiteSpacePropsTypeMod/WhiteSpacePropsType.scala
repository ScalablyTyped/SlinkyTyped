package typingsSlinky.antdMobile.whiteSpacePropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.lg
import typingsSlinky.antdMobile.antdMobileStrings.md
import typingsSlinky.antdMobile.antdMobileStrings.sm
import typingsSlinky.antdMobile.antdMobileStrings.xl
import typingsSlinky.antdMobile.antdMobileStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhiteSpacePropsType extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
}

object WhiteSpacePropsType {
  @scala.inline
  def apply(): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
  @scala.inline
  implicit class WhiteSpacePropsTypeOps[Self <: WhiteSpacePropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: xs | sm | md | lg | xl): Self = {
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

