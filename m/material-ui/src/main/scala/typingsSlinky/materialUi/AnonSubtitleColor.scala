package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubtitleColor extends js.Object {
  var fontWeight: js.UndefOr[Double] = js.native
  var subtitleColor: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
}

object AnonSubtitleColor {
  @scala.inline
  def apply(): AnonSubtitleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSubtitleColor]
  }
  @scala.inline
  implicit class AnonSubtitleColorOps[Self <: AnonSubtitleColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
  }
  
}

