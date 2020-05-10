package typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /** Specifies the Character settings for the DigitalGauge.
    * @Default {null}
    */
  var characterSettings: js.UndefOr[ItemsCharacterSettings] = js.native
  /** Enable/Disable the custom font to be applied to the text in the gauge.
    * @Default {false}
    */
  var enableCustomFont: js.UndefOr[Boolean] = js.native
  /** Set the specific font for the text, when the enableCustomFont is set to true
    * @Default {null}
    */
  var font: js.UndefOr[ItemsFont] = js.native
  /** Set the location for the text, where it needs to be placed within the gauge.
    * @Default {null}
    */
  var position: js.UndefOr[ItemsPosition] = js.native
  /** Set the segment settings for the digital gauge.
    * @Default {null}
    */
  var segmentSettings: js.UndefOr[ItemsSegmentSettings] = js.native
  /** Set the value for enabling/disabling the blurring effect for the shadows of the text
    * @Default {0}
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /** Specifies the color of the text shadow.
    * @Default {null}
    */
  var shadowColor: js.UndefOr[String] = js.native
  /** Set the x offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /** Set the y offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /** Set the alignment of the text that is displayed within the gauge.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[String] = js.native
  /** Specifies the color of the text.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.native
  /** Specifies the text value.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}

object Item {
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacterSettings(value: ItemsCharacterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCustomFont(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCustomFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCustomFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCustomFont")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ItemsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ItemsPosition): Self = {
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
    def withSegmentSettings(value: ItemsSegmentSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

