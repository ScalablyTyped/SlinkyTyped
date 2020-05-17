package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandAll extends js.Object {
  var columns: js.UndefOr[js.Array[Measure]] = js.native
  var expandAll: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[js.Array[Measure]] = js.native
}

object ExpandAll {
  @scala.inline
  def apply(): ExpandAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandAll]
  }
  @scala.inline
  implicit class ExpandAllOps[Self <: ExpandAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Measure]): Self = {
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
    def withExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Measure]): Self = {
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

