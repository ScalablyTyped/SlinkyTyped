package typingsSlinky.antdMobileRn.whiteSpaceIndexNativeMod

import typingsSlinky.antdMobileRn.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhiteSpaceProps extends WhiteSpacePropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object WhiteSpaceProps {
  @scala.inline
  def apply(): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiteSpaceProps]
  }
  @scala.inline
  implicit class WhiteSpacePropsOps[Self <: WhiteSpaceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

