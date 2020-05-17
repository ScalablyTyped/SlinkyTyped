package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointColor extends js.Object {
  var pointColor: js.UndefOr[String] = js.native
  var pointIndex: js.UndefOr[Double] = js.native
  var pointName: js.UndefOr[js.Any] = js.native
}

object PointColor {
  @scala.inline
  def apply(): PointColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointColor]
  }
  @scala.inline
  implicit class PointColorOps[Self <: PointColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPointName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointName")(js.undefined)
        ret
    }
  }
  
}

