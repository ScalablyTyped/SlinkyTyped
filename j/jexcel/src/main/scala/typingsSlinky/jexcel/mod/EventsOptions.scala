package typingsSlinky.jexcel.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsOptions extends js.Object {
  /** After all changes are applied in the table. */
  // tslint:disable-next-line ban-types
  var onafterchanges: js.UndefOr[js.Function] = js.native
  /** Before a column value is changed. NOTE: It is possible to overwrite the original value, by return a new value on this method. v3.4.0+ */
  // tslint:disable-next-line ban-types
  var onbeforechange: js.UndefOr[js.Function] = js.native
  /** Before a column is excluded. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeletecolumn: js.UndefOr[js.Function] = js.native
  /** Before a row is deleted. You can cancel the delete event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeleterow: js.UndefOr[js.Function] = js.native
  /** Before a new column is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertcolumn: js.UndefOr[js.Function] = js.native
  /** Before a new row is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertrow: js.UndefOr[js.Function] = js.native
  /** Before the paste action is performed. Used to parse any input data, should return the data. */
  // tslint:disable-next-line ban-types
  var onbeforepaste: js.UndefOr[js.Function] = js.native
  /** On table blur */
  // tslint:disable-next-line ban-types
  var onblur: js.UndefOr[js.Function] = js.native
  /** After a column value is changed. */
  var onchange: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      /* value */ CellValue, 
      Unit
    ]
  ] = js.native
  /** On header change */
  // tslint:disable-next-line ban-types
  var onchangeheader: js.UndefOr[js.Function] = js.native
  /** When a setMeta is called. */
  // tslint:disable-next-line ban-types
  var onchangemeta: js.UndefOr[js.Function] = js.native
  /** When the page is changed. */
  // tslint:disable-next-line ban-types
  var onchangepage: js.UndefOr[js.Function] = js.native
  /** When a setStyle is called. */
  // tslint:disable-next-line ban-types
  var onchangestyle: js.UndefOr[js.Function] = js.native
  /** After a column is excluded. */
  // tslint:disable-next-line ban-types
  var ondeletecolumn: js.UndefOr[js.Function] = js.native
  /** After a row is excluded. */
  // tslint:disable-next-line ban-types
  var ondeleterow: js.UndefOr[js.Function] = js.native
  /** When a closeEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionend: js.UndefOr[js.Function] = js.native
  /** When a openEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionstart: js.UndefOr[js.Function] = js.native
  /** On table focus */
  // tslint:disable-next-line ban-types
  var onfocus: js.UndefOr[js.Function] = js.native
  /** After a new column is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertcolumn: js.UndefOr[js.Function] = js.native
  /** After a new row is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertrow: js.UndefOr[js.Function] = js.native
  /** This method is called when the method setData */
  // tslint:disable-next-line ban-types
  var onload: js.UndefOr[js.Function] = js.native
  /** On column merge */
  // tslint:disable-next-line ban-types
  var onmerge: js.UndefOr[js.Function] = js.native
  /** After a column is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmovecolumn: js.UndefOr[js.Function] = js.native
  /** After a row is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmoverow: js.UndefOr[js.Function] = js.native
  /** After a paste action is performed in the javascript table. */
  // tslint:disable-next-line ban-types
  var onpaste: js.UndefOr[js.Function] = js.native
  /** On redo is applied */
  // tslint:disable-next-line ban-types
  var onredo: js.UndefOr[js.Function] = js.native
  /** After a change in column width. */
  // tslint:disable-next-line ban-types
  var onresizecolumn: js.UndefOr[js.Function] = js.native
  /** After a change in row height. */
  // tslint:disable-next-line ban-types
  var onresizerow: js.UndefOr[js.Function] = js.native
  /** On the selection is changed. */
  // tslint:disable-next-line ban-types
  var onselection: js.UndefOr[js.Function] = js.native
  /** After a colum is sorted. */
  // tslint:disable-next-line ban-types
  var onsort: js.UndefOr[js.Function] = js.native
  /** On undo is applied */
  // tslint:disable-next-line ban-types
  var onundo: js.UndefOr[js.Function] = js.native
}

object EventsOptions {
  @scala.inline
  def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  @scala.inline
  implicit class EventsOptionsOps[Self <: EventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnafterchanges(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onafterchanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnafterchanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onafterchanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforechange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforedeletecolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforedeletecolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforedeletecolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforedeletecolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforedeleterow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforedeleterow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforedeleterow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforedeleterow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforeinsertcolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeinsertcolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforeinsertcolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeinsertcolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforeinsertrow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeinsertrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforeinsertrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeinsertrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforepaste(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforepaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforepaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforepaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnblur(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchangeheader(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangeheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchangeheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangeheader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchangemeta(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangemeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchangemeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangemeta")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchangepage(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchangepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangepage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchangestyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangestyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchangestyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchangestyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOndeletecolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondeletecolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndeletecolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondeletecolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOndeleterow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondeleterow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndeleterow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondeleterow")(js.undefined)
        ret
    }
    @scala.inline
    def withOneditionend(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneditionend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneditionend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneditionend")(js.undefined)
        ret
    }
    @scala.inline
    def withOneditionstart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneditionstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneditionstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneditionstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocus(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOninsertcolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninsertcolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninsertcolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninsertcolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOninsertrow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninsertrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninsertrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninsertrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmerge(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmerge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmovecolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmovecolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmovecolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmovecolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmoverow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmoverow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmoverow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmoverow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpaste(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnredo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onredo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnredo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onredo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresizecolumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresizecolumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresizecolumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresizecolumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresizerow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresizerow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresizerow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresizerow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselection(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsort(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnundo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onundo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnundo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onundo")(js.undefined)
        ret
    }
  }
  
}

