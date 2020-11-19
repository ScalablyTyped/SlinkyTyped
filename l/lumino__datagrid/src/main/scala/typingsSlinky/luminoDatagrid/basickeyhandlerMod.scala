package typingsSlinky.luminoDatagrid

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.IKeyHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/basickeyhandler", JSImport.Namespace)
@js.native
object basickeyhandlerMod extends js.Object {
  
  @js.native
  class BasicKeyHandler () extends IKeyHandler {
    
    var _disposed: js.Any = js.native
    
    /**
      * Handle the `'ArrowDown'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowDown(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowLeft'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowLeft(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowRight'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowRight(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowUp'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowUp(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'Delete'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onDelete(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'Escape'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onEscape(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'C'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onKeyC(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'PageDown'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onPageDown(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'PageUp'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onPageUp(grid: DataGrid, event: KeyboardEvent): Unit = js.native
  }
}
