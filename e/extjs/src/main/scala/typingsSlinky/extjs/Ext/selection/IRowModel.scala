package typingsSlinky.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
  /** [Method] Returns position of the first selected cell in the selection in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var ignoreRightMouseSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Selects the record immediately following the currently selected record
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		* @returns Boolean true if there is a next record, else false
  		*/
  var selectNext: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
  /** [Method] Selects the record that precedes the currently selected record
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		* @returns Boolean true if there is a previous record, else false
  		*/
  var selectPrevious: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
}

object IRowModel {
  @scala.inline
  def apply(): IRowModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowModel]
  }
  @scala.inline
  implicit class IRowModelOps[Self <: IRowModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableKeyNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRightMouseSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRightMouseSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRightMouseSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRightMouseSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectNext(
      value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNext")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectPrevious(
      value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPrevious")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPrevious")(js.undefined)
        ret
    }
  }
  
}

