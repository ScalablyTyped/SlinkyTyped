package typingsSlinky.rbx.otherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherHelpersProps extends js.Object {
  var marginless: js.UndefOr[Boolean] = js.native
  var paddingless: js.UndefOr[Boolean] = js.native
  var radiusless: js.UndefOr[Boolean] = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var shadowless: js.UndefOr[Boolean] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
}

object OtherHelpersProps {
  @scala.inline
  def apply(): OtherHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherHelpersProps]
  }
  @scala.inline
  implicit class OtherHelpersPropsOps[Self <: OtherHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginless")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingless")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusless")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowless")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
  }
  
}

