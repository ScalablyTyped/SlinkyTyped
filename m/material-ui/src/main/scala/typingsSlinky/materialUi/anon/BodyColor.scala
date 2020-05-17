package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyColor extends js.Object {
  var bodyColor: js.UndefOr[String] = js.native
  var bodyFontSize: js.UndefOr[Double] = js.native
  var titleFontSize: js.UndefOr[Double] = js.native
}

object BodyColor {
  @scala.inline
  def apply(): BodyColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyColor]
  }
  @scala.inline
  implicit class BodyColorOps[Self <: BodyColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
  }
  
}

