package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridPanel extends ITable {
  /** [Method] Reconfigures the grid with a new store columns
  		* @param store Ext.data.Store The new store.
  		* @param columns Object[] An array of column configs
  		*/
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.native
}

object IGridPanel {
  @scala.inline
  def apply(): IGridPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridPanel]
  }
  @scala.inline
  implicit class IGridPanelOps[Self <: IGridPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconfigure(value: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReconfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.undefined)
        ret
    }
  }
  
}

