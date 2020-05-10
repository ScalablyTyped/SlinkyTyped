package typingsSlinky.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrillAll extends js.Object {
  var columns: js.UndefOr[js.Array[AnonMeasure]] = js.native
  var drillAll: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[js.Array[AnonMeasure]] = js.native
}

object AnonDrillAll {
  @scala.inline
  def apply(): AnonDrillAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDrillAll]
  }
  @scala.inline
  implicit class AnonDrillAllOps[Self <: AnonDrillAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[AnonMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[AnonMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

