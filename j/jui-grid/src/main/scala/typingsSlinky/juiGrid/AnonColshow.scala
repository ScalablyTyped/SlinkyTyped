package typingsSlinky.juiGrid

import typingsSlinky.juiGrid.juiGridStrings.asc
import typingsSlinky.juiGrid.juiGridStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColshow extends js.Object {
  /**
    * @cfg {Boolean/Array} [colshow=false]
    * Sets a column index shown when the Show/Hide Column menu is enabled.
    */
  var colshow: js.UndefOr[Boolean | js.Array[_]] = js.native
  /**
    * @cfg {Array} [csv=null]
    * Sets the column key shown when converted to a CSV string.
    */
  var csv: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Array} [csvNames=null]
    * Sets the name of a column shown when converting to a CSV string, which must be defined in the same order as the CSV option.
    */
  var csvNames: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Array} [csvNumber=null]
    * Sets the column key to be changed to a number form when converted to a CSV string.
    */
  var csvNumber: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Array} data
    * Sets the initial row list of a table.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Boolean} [editEvent=true]
    * Sets the Show/Hide state of an extended row area when doubleclicking on a row/cell.
    */
  var editEvent: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean|Array} [editRow=false]
    * Determines whether to use a modified row area.
    */
  var editRow: js.UndefOr[Boolean | js.Array[_]] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Boolean} [expand=false]
    * Determines whether to use an extended row area.
    */
  var expand: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [expandEvent=true]
    * Sets the Show/Hide state of an extended row area when clicking on a row.
    */
  var expandEvent: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Array} [fields=null]
    * Sets the name of columns in the order of being displayed on the table screen.
    */
  var fields: js.UndefOr[js.Array[_]] = js.native
  /**
    * @cfg {Boolean} [moveRow=false]
    * Determines whether to use the move function when you fire row draggable event.
    */
  var moveRow: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [resize=false]
    * Determines whether to use the column resizing function.
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [scroll=false]
    * Determines whether to use a table scroll.
    */
  var scroll: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Integer} [scrollHeight=200]
    * Sets the reference height of a body area when using a table scroll.
    */
  var scrollHeight: js.UndefOr[Double] = js.native
  /**
    * @cfg {Boolean/Array} [sort=false]
    * Determines whether to use the table sort function.
    */
  var sort: js.UndefOr[Boolean | js.Array[_]] = js.native
  /**
    * @cfg {Boolean} [sortEvent=true]
    * Determines whether to use the sort function when you click on a column.
    */
  var sortEvent: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Integer} [sortIndex=null]
    * Determines whether to use the table sort function.
    */
  var sortIndex: js.UndefOr[Double] = js.native
  /**
    * @cfg {String} [sortOrder="asc"]
    * Determines whether to use the table sort function.
    */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [width=0]
    * Sets the area of a table.
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonColshow {
  @scala.inline
  def apply(): AnonColshow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColshow]
  }
  @scala.inline
  implicit class AnonColshowOps[Self <: AnonColshow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColshow(value: Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colshow")(js.undefined)
        ret
    }
    @scala.inline
    def withCsv(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvNames(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvNumber(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEditEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRow(value: Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

