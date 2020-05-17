package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.X
import typingsSlinky.pdfmake.pdfmakeStrings.polyline
import typingsSlinky.pdfmake.pdfmakeStrings.round
import typingsSlinky.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPolyline
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var closePath: js.UndefOr[Boolean] = js.native
  var lineCap: js.UndefOr[round | square] = js.native
  var points: js.Array[X] = js.native
  var `type`: polyline = js.native
}

object CanvasPolyline {
  @scala.inline
  def apply(points: js.Array[X], `type`: polyline): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPolyline]
  }
  @scala.inline
  implicit class CanvasPolylineOps[Self <: CanvasPolyline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[X]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: polyline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: round | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
  }
  
}

