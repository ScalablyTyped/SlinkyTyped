package typingsSlinky.qrcodeGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSize extends js.Object {
  var cellSize: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var scalable: js.UndefOr[Boolean] = js.native
}

object CellSize {
  @scala.inline
  def apply(): CellSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSize]
  }
  @scala.inline
  implicit class CellSizeOps[Self <: CellSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withScalable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(js.undefined)
        ret
    }
  }
  
}

