package typingsSlinky.officeUiFabricReact.iconTypesMod

import typingsSlinky.officeUiFabricReact.anon.PartialIIconStyles
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var iconClassName: js.UndefOr[String] = js.native
  var isImage: Boolean = js.native
  var isPlaceholder: Boolean = js.native
  var styles: js.UndefOr[PartialIIconStyles] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object IIconStyleProps {
  @scala.inline
  def apply(isImage: Boolean, isPlaceholder: Boolean): IIconStyleProps = {
    val __obj = js.Dynamic.literal(isImage = isImage.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconStyleProps]
  }
  @scala.inline
  implicit class IIconStylePropsOps[Self <: IIconStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaceholder")(value.asInstanceOf[js.Any])
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
    def withIconClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialIIconStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
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

