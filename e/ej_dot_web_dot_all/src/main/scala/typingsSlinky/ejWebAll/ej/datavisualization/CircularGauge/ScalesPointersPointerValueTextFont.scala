package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointersPointerValueTextFont extends js.Object {
  /** Specify pointer value text font family of circular gauge.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specify pointer value text font style of circular gauge.
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[String] = js.native
  /** Specify pointer value text size of circular gauge.
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.native
}

object ScalesPointersPointerValueTextFont {
  @scala.inline
  def apply(): ScalesPointersPointerValueTextFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointersPointerValueTextFont]
  }
  @scala.inline
  implicit class ScalesPointersPointerValueTextFontOps[Self <: ScalesPointersPointerValueTextFont] (val x: Self) extends AnyVal {
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
    def withFontStyle(value: String): Self = {
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

