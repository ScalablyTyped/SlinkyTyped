package typingsSlinky.officeUiFabricReact.choiceGroupTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var optionsContainIconOrImage: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IChoiceGroupStyleProps {
  @scala.inline
  def apply(theme: ITheme): IChoiceGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupStyleProps]
  }
  @scala.inline
  implicit class IChoiceGroupStylePropsOps[Self <: IChoiceGroupStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsContainIconOrImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainIconOrImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsContainIconOrImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainIconOrImage")(js.undefined)
        ret
    }
  }
  
}

