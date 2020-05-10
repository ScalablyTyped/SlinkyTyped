package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BackgroundPositionProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.`fixed-height`
import typingsSlinky.mjmlReact.mjmlReactStrings.`fluid-height`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlHeroProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  var backgroundHeight: js.UndefOr[String] = js.native
  var backgroundPosition: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.native
  var backgroundUrl: js.UndefOr[String] = js.native
  var backgroundWidth: js.UndefOr[String] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var mode: js.UndefOr[`fluid-height` | `fixed-height`] = js.native
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlHeroProps {
  @scala.inline
  def apply(): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlHeroProps]
  }
  @scala.inline
  implicit class MjmlHeroPropsOps[Self <: MjmlHeroProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackgroundHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundPosition(value: BackgroundPositionProperty[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: `fluid-height` | `fixed-height`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

