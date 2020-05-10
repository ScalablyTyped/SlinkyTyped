package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettings extends js.Object {
  /** Defines the animation for the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var animation: js.UndefOr[TooltipSettingsAnimation] = js.native
  /** Defines the tooltip of associate that should be shown when the mouse hovers over rows/columns.
    * @Default {mouseFollow}
    */
  var associate: js.UndefOr[Associate | String] = js.native
  /** Enables/ disables the balloon for the tooltip to be shown
    * @Default {true}
    */
  var isBalloon: js.UndefOr[Boolean] = js.native
  /** Defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[TooltipSettingsPosition] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
  /** Defines the tooltip to be triggered.
    * @Default {hover}
    */
  var trigger: js.UndefOr[Trigger | String] = js.native
}

object TooltipSettings {
  @scala.inline
  def apply(): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettings]
  }
  @scala.inline
  implicit class TooltipSettingsOps[Self <: TooltipSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: TooltipSettingsAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociate(value: Associate | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBalloon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBalloon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBalloon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBalloon")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: TooltipSettingsPosition): Self = {
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
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: Trigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

