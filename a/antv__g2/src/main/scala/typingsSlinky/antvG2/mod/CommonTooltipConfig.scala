package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.AnonStyle
import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.click
import typingsSlinky.antvG2.antvG2Strings.default
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.mini
import typingsSlinky.antvG2.antvG2Strings.mousemove
import typingsSlinky.antvG2.antvG2Strings.none
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonTooltipConfig extends js.Object {
  var crosshairs: js.UndefOr[AnonStyle] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var hideMarkers: js.UndefOr[Boolean] = js.native
  var inPlot: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var position: js.UndefOr[left | right | top | bottom] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var triggerOn: js.UndefOr[mousemove | click | none] = js.native
  var `type`: js.UndefOr[default | mini] = js.native
  var useHtml: js.UndefOr[Boolean] = js.native
}

object CommonTooltipConfig {
  @scala.inline
  def apply(): CommonTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonTooltipConfig]
  }
  @scala.inline
  implicit class CommonTooltipConfigOps[Self <: CommonTooltipConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrosshairs(value: AnonStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withInPlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: left | right | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerOn(value: mousemove | click | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: default | mini): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(js.undefined)
        ret
    }
  }
  
}

