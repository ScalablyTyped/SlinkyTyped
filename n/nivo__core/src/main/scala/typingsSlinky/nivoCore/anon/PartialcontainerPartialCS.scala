package typingsSlinky.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  container  :std.Partial<react.react.CSSProperties>,   basic  :std.Partial<react.react.CSSProperties>,   chip  :std.Partial<react.react.CSSProperties>,   table  :std.Partial<react.react.CSSProperties>,   tableCell  :std.Partial<react.react.CSSProperties>}> */
@js.native
trait PartialcontainerPartialCS extends js.Object {
  var basic: js.UndefOr[PartialCSSProperties] = js.native
  var chip: js.UndefOr[PartialCSSProperties] = js.native
  var container: js.UndefOr[PartialCSSProperties] = js.native
  var table: js.UndefOr[PartialCSSProperties] = js.native
  var tableCell: js.UndefOr[PartialCSSProperties] = js.native
}

object PartialcontainerPartialCS {
  @scala.inline
  def apply(): PartialcontainerPartialCS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcontainerPartialCS]
  }
  @scala.inline
  implicit class PartialcontainerPartialCSOps[Self <: PartialcontainerPartialCS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withChip(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chip")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCell(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(js.undefined)
        ret
    }
  }
  
}

