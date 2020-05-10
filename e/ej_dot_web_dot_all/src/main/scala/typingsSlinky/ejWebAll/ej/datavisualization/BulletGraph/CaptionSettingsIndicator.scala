package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsIndicator extends js.Object {
  /** Contains property to customize the font of indicator.
    */
  var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.native
  /** Contains property to customize the location of indicator.
    */
  var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.native
  /** Specifies the padding to be applied when text position is used.
    * @Default {2}
    */
  var padding: js.UndefOr[Double] = js.native
  /** Contains property to customize the symbol of indicator.
    */
  var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.native
  /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the alignment of indicator with respect to scale based on text position
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  /** indicator text render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Specifies where indicator should be placed
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
  /** Specifies the space between indicator symbol and text.
    * @Default {3}
    */
  var textSpacing: js.UndefOr[Double] = js.native
  /** Specifies whether indicator will be visible or not.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object CaptionSettingsIndicator {
  @scala.inline
  def apply(): CaptionSettingsIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicator]
  }
  @scala.inline
  implicit class CaptionSettingsIndicatorOps[Self <: CaptionSettingsIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: CaptionSettingsIndicatorFont): Self = {
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
    def withLocation(value: CaptionSettingsIndicatorLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: CaptionSettingsIndicatorSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
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
    def withTextAlignment(value: TextAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchor | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPosition(value: TextPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSpacing")(js.undefined)
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

