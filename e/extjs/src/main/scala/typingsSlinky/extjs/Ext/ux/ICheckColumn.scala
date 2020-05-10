package typingsSlinky.extjs.Ext.ux

import typingsSlinky.extjs.Ext.grid.column.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckColumn extends IColumn {
  /** [Method] Disables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onDisable")
  var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Enables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onEnable")
  var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.native
}

object ICheckColumn {
  @scala.inline
  def apply(): ICheckColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckColumn]
  }
  @scala.inline
  implicit class ICheckColumnOps[Self <: ICheckColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withStopSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSelection")(js.undefined)
        ret
    }
  }
  
}

