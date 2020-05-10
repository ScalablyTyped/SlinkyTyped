package typingsSlinky.agGrid.colDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractColDef extends js.Object {
  /** Whether to show the column when the group is open / closed. */
  var columnGroupShow: js.UndefOr[String] = js.native
  /** CSS class for the header */
  var headerClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.native
  /** The name to render in the column header */
  var headerName: js.UndefOr[String] = js.native
  /** Tooltip for the column header */
  var headerTooltip: js.UndefOr[String] = js.native
  /** Expression or function to get the cells value. */
  var headerValueGetter: js.UndefOr[String | js.Function] = js.native
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotKeys: js.UndefOr[js.Array[String]] = js.native
  /** Set to true to not include this column in the toolpanel */
  var suppressToolPanel: js.UndefOr[Boolean] = js.native
  /** CSS class for the header */
  var toolPanelClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.native
}

object AbstractColDef {
  @scala.inline
  def apply(): AbstractColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractColDef]
  }
  @scala.inline
  implicit class AbstractColDefOps[Self <: AbstractColDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnGroupShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroupShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroupShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroupShow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderValueGetter(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValueGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderValueGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValueGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressToolPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressToolPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressToolPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressToolPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withToolPanelClassFunction1(value: /* params */ js.Any => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolPanelClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToolPanelClass(value: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolPanelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolPanelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolPanelClass")(js.undefined)
        ret
    }
  }
  
}

