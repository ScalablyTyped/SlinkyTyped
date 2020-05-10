package typingsSlinky.reactThemeableTs.hocMod

import typingsSlinky.reactThemeableTs.themeableMod.IStaticFnReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHOCDefaultProps extends IHOCDefaultNoThemeProps {
  var theme: js.UndefOr[js.Any] = js.native
}

object IHOCDefaultProps {
  @scala.inline
  def apply(t: IStaticFnReturn): IHOCDefaultProps = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHOCDefaultProps]
  }
  @scala.inline
  implicit class IHOCDefaultPropsOps[Self <: IHOCDefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

