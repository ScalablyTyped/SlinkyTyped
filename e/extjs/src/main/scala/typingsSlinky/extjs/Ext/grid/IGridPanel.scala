package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.panel.ITable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IGridPanelMutableBuilder[Self <: IGridPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReconfigure(value: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit): Self = StObject.set(x, "reconfigure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
  }
}
