package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.hidden
import typingsSlinky.mjmlReact.mjmlReactStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlCarouselProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  var borderRadius: js.UndefOr[String | Double] = js.native
  var iconWidth: js.UndefOr[String] = js.native
  var leftIcon: js.UndefOr[String] = js.native
  var rightIcon: js.UndefOr[String] = js.native
  var tbBorder: js.UndefOr[BorderProperty[String | Double]] = js.native
  var tbBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.native
  var tbHoverBorderColor: js.UndefOr[String] = js.native
  var tbSelectedBorderColor: js.UndefOr[String] = js.native
  var tbWidth: js.UndefOr[String] = js.native
  var thumbnails: js.UndefOr[hidden | visible] = js.native
}

object MjmlCarouselProps {
  @scala.inline
  def apply(): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselProps]
  }
  @scala.inline
  implicit class MjmlCarouselPropsOps[Self <: MjmlCarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: BackgroundColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTbBorder(value: BorderProperty[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withTbBorderRadius(value: BorderRadiusProperty[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTbHoverBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbHoverBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbHoverBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbHoverBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTbSelectedBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbSelectedBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbSelectedBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbSelectedBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTbWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: hidden | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
        ret
    }
  }
  
}

