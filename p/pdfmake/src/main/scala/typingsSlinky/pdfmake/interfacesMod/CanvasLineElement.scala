package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasLineElement extends js.Object {
  var dash: js.UndefOr[AnonLength] = js.native
  var lineColor: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
}

object CanvasLineElement {
  @scala.inline
  def apply(): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasLineElement]
  }
  @scala.inline
  implicit class CanvasLineElementOps[Self <: CanvasLineElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDash(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
  }
  
}

