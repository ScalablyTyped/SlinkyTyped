package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.pdfmakeStrings.ellipse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasEllipse
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var r1: Double = js.native
  var r2: js.UndefOr[Double] = js.native
  var `type`: ellipse = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object CanvasEllipse {
  @scala.inline
  def apply(r1: Double, `type`: ellipse, x: Double, y: Double): CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasEllipse]
  }
  @scala.inline
  implicit class CanvasEllipseOps[Self <: CanvasEllipse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withR1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ellipse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(js.undefined)
        ret
    }
  }
  
}

