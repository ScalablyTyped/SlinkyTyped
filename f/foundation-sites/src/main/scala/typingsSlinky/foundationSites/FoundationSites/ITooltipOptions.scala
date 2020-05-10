package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipOptions extends js.Object {
  var clickOpen: js.UndefOr[Boolean] = js.native
  var disableHover: js.UndefOr[Boolean] = js.native
  var fadeInDuration: js.UndefOr[Double] = js.native
  var fadeOutDuration: js.UndefOr[Double] = js.native
  var hOffset: js.UndefOr[Double] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var positionClass: js.UndefOr[String] = js.native
  var showOn: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var templateClasses: js.UndefOr[String] = js.native
  var tipText: js.UndefOr[String] = js.native
  var tooltipClass: js.UndefOr[String] = js.native
  var triggerClass: js.UndefOr[String] = js.native
  var vOffset: js.UndefOr[Double] = js.native
}

object ITooltipOptions {
  @scala.inline
  def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  @scala.inline
  implicit class ITooltipOptionsOps[Self <: ITooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHover")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeInDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeInDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeInDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withTipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipText")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(js.undefined)
        ret
    }
  }
  
}

