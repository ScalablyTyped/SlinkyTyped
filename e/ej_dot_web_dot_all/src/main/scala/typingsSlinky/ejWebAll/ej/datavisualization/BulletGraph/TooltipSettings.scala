package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettings extends js.Object {
  /** Specifies template for caption tooltip
    * @Default {null}
    */
  var captionTemplate: js.UndefOr[String] = js.native
  /** Toggles the visibility of caption tooltip
    * @Default {false}
    */
  var enableCaptionTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the ID of a div, which is to be displayed as tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Toggles the visibility of tooltip
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
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
    def withCaptionTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCaptionTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaptionTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCaptionTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaptionTooltip")(js.undefined)
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

