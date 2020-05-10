package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoadingStrokeColor extends js.Object {
  var loadingStrokeColor: js.UndefOr[String] = js.native
  var strokeColor: js.UndefOr[String] = js.native
}

object AnonLoadingStrokeColor {
  @scala.inline
  def apply(): AnonLoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLoadingStrokeColor]
  }
  @scala.inline
  implicit class AnonLoadingStrokeColorOps[Self <: AnonLoadingStrokeColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadingStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
  }
  
}

