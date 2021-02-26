package typingsSlinky.blueprintjsTable

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.esmRegionsMod.ICellCoordinate
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuContextMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus/menuContext", "MenuContext")
  @js.native
  class MenuContext protected () extends IMenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
    
    var numCols: js.Any = js.native
    
    var numRows: js.Any = js.native
    
    var regions: js.Any = js.native
    
    var selectedRegions: js.Any = js.native
    
    var target: js.Any = js.native
  }
  
  type IContextMenuRenderer = js.Function1[/* context */ IMenuContext, ReactElement]
  
  @js.native
  trait IMenuContext extends StObject {
    
    /**
      * Returns an array of `IRegion`s that represent the user-intended context
      * of this menu. If the mouse click was on a selection, the array will
      * contain all selected regions. Otherwise it will have one `IRegion` that
      * represents the clicked cell (the same `IRegion` from `getTarget`).
      */
    def getRegions(): js.Array[IRegion] = js.native
    
    /**
      * Returns the list of selected `IRegion` in the table, regardless of
      * where the users clicked to launch the context menu. For the user-
      * intended regions for this context, use `getRegions` instead.
      */
    def getSelectedRegions(): js.Array[IRegion] = js.native
    
    /**
      * Returns a region containing the single cell that was clicked to launch
      * this context menu.
      */
    def getTarget(): IRegion = js.native
    
    /**
      * Returns an array containing all of the unique, potentially non-
      * contiguous, cells contained in all the regions from `getRegions`. The
      * cell coordinates are sorted by rows then columns.
      */
    def getUniqueCells(): js.Array[ICellCoordinate] = js.native
  }
  object IMenuContext {
    
    @scala.inline
    def apply(
      getRegions: () => js.Array[IRegion],
      getSelectedRegions: () => js.Array[IRegion],
      getTarget: () => IRegion,
      getUniqueCells: () => js.Array[ICellCoordinate]
    ): IMenuContext = {
      val __obj = js.Dynamic.literal(getRegions = js.Any.fromFunction0(getRegions), getSelectedRegions = js.Any.fromFunction0(getSelectedRegions), getTarget = js.Any.fromFunction0(getTarget), getUniqueCells = js.Any.fromFunction0(getUniqueCells))
      __obj.asInstanceOf[IMenuContext]
    }
    
    @scala.inline
    implicit class IMenuContextMutableBuilder[Self <: IMenuContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRegions(value: () => js.Array[IRegion]): Self = StObject.set(x, "getRegions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedRegions(value: () => js.Array[IRegion]): Self = StObject.set(x, "getSelectedRegions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTarget(value: () => IRegion): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUniqueCells(value: () => js.Array[ICellCoordinate]): Self = StObject.set(x, "getUniqueCells", js.Any.fromFunction0(value))
    }
  }
}
