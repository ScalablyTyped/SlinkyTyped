package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettings extends js.Object {
  /** Specifies whether trim the labels will be true or false.
    * @Default {true}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  /** Contains property to customize the font of caption.
    */
  var font: js.UndefOr[CaptionSettingsFont] = js.native
  /** Contains property to customize the indicator.
    */
  var indicator: js.UndefOr[CaptionSettingsIndicator] = js.native
  /** Contains property to customize the location.
    */
  var location: js.UndefOr[CaptionSettingsLocation] = js.native
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.native
  /** Contains property to customize the subtitle.
    */
  var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.native
  /** Specifies the text to be displayed on bullet graph.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
    * Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  /** Specifies the angel in which the caption is rendered.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Specifies how caption text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
}

object CaptionSettings {
  @scala.inline
  def apply(): CaptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettings]
  }
  @scala.inline
  implicit class CaptionSettingsOps[Self <: CaptionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: CaptionSettingsFont): Self = {
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
    def withIndicator(value: CaptionSettingsIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: CaptionSettingsLocation): Self = {
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
    def withSubTitle(value: CaptionSettingsSubTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(js.undefined)
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

