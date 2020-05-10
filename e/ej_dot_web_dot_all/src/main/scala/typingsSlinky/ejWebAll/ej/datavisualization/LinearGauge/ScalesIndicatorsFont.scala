package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesIndicatorsFont extends js.Object {
  /** Specifies the fontFamily of font in bar indicators
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specifies the fontStyle of font in bar indicators. See FontStyle
    * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  /** Specifies the size of font in bar indicators
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.native
}

object ScalesIndicatorsFont {
  @scala.inline
  def apply(): ScalesIndicatorsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesIndicatorsFont]
  }
  @scala.inline
  implicit class ScalesIndicatorsFontOps[Self <: ScalesIndicatorsFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyle | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

