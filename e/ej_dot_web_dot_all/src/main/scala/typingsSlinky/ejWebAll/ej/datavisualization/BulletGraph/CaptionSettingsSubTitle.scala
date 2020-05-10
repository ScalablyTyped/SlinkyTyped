package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsSubTitle extends js.Object {
  /** Contains property to customize the font of subtitle.
    */
  var font: js.UndefOr[CaptionSettingsSubTitleFont] = js.native
  /** Contains property to customize the location of subtitle.
    */
  var location: js.UndefOr[CaptionSettingsSubTitleLocation] = js.native
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.native
  /** Specifies the text to be displayed as subtitle.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the alignment of sub title text with respect to scale. Alignment will not be applied in float position.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies where subtitle text should be anchored when sub title text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  /** Subtitle render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Specifies where sub title text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
}

object CaptionSettingsSubTitle {
  @scala.inline
  def apply(): CaptionSettingsSubTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsSubTitle]
  }
  @scala.inline
  implicit class CaptionSettingsSubTitleOps[Self <: CaptionSettingsSubTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: CaptionSettingsSubTitleFont): Self = {
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
    def withLocation(value: CaptionSettingsSubTitleLocation): Self = {
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
  }
  
}

