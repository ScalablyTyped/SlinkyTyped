package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndicatorSrc extends js.Object {
  var enabled: js.UndefOr[Boolean | auto] = js.native
  var height: js.UndefOr[Double] = js.native
  var indicatorSrc: js.UndefOr[String] = js.native
  var shading: js.UndefOr[Boolean] = js.native
  var shadingColor: js.UndefOr[String] = js.native
  var showIndicator: js.UndefOr[Boolean] = js.native
  var showPane: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonIndicatorSrc {
  @scala.inline
  def apply(): AnonIndicatorSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIndicatorSrc]
  }
  @scala.inline
  implicit class AnonIndicatorSrcOps[Self <: AnonIndicatorSrc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withIndicatorSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withShading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withShadingColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPane")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

