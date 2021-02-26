package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object header {
  
  @js.native
  trait IContainer
    extends typingsSlinky.extjs.Ext.container.IContainer {
    
    /** [Config Option] (Number) */
    var defaultWidth: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var enableColumnHide: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
    var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
      * @param headerContainer Object
      */
    var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Gets the full width of all columns that are visible  */
    var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Returns an array of all columns which appear in the grid s View
      * @param inResult Object
      * @param hiddenAncestor Object
      * @returns Array
      */
    var getGridColumns: js.UndefOr[
        js.Function2[/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any], Array]
      ] = js.native
    
    /** [Method] Get a leaf level header by index regardless of what the nesting structure is
      * @param index Number The column index for which to retrieve the column.
      */
    var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
      * @param header Ext.grid.column.Column The header to find the index of
      * @returns Number The index of the specified column header
      */
    var getHeaderIndex: js.UndefOr[
        js.Function1[/* header */ js.UndefOr[typingsSlinky.extjs.Ext.grid.column.IColumn], Double]
      ] = js.native
    
    /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
      * @returns Array menuItems
      */
    var getMenuItems: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns an array of the visible columns in the grid
      * @returns Array
      */
    var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] When passed a column index returns the closet visible column to that
      * @param index Number Position at which to find the closest visible column.
      */
    var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Property] (Boolean) */
    var isGroupHeader: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var `sealed`: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var sortable: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var weight: js.UndefOr[Double] = js.native
  }
  object IContainer {
    
    @scala.inline
    def apply(): IContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContainer]
    }
    
    @scala.inline
    implicit class IContainerMutableBuilder[Self <: IContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      @scala.inline
      def setEnableColumnHide(value: Boolean): Self = StObject.set(x, "enableColumnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnHideUndefined: Self = StObject.set(x, "enableColumnHide", js.undefined)
      
      @scala.inline
      def setGetColumnCount(value: () => Unit): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColumnCountUndefined: Self = StObject.set(x, "getColumnCount", js.undefined)
      
      @scala.inline
      def setGetColumnMenu(value: /* headerContainer */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getColumnMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetColumnMenuUndefined: Self = StObject.set(x, "getColumnMenu", js.undefined)
      
      @scala.inline
      def setGetFullWidth(value: () => Unit): Self = StObject.set(x, "getFullWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFullWidthUndefined: Self = StObject.set(x, "getFullWidth", js.undefined)
      
      @scala.inline
      def setGetGridColumns(value: (/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "getGridColumns", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetGridColumnsUndefined: Self = StObject.set(x, "getGridColumns", js.undefined)
      
      @scala.inline
      def setGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "getHeaderAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeaderAtIndexUndefined: Self = StObject.set(x, "getHeaderAtIndex", js.undefined)
      
      @scala.inline
      def setGetHeaderIndex(value: /* header */ js.UndefOr[typingsSlinky.extjs.Ext.grid.column.IColumn] => Double): Self = StObject.set(x, "getHeaderIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeaderIndexUndefined: Self = StObject.set(x, "getHeaderIndex", js.undefined)
      
      @scala.inline
      def setGetMenuItems(value: () => Array): Self = StObject.set(x, "getMenuItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMenuItemsUndefined: Self = StObject.set(x, "getMenuItems", js.undefined)
      
      @scala.inline
      def setGetVisibleGridColumns(value: () => Array): Self = StObject.set(x, "getVisibleGridColumns", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVisibleGridColumnsUndefined: Self = StObject.set(x, "getVisibleGridColumns", js.undefined)
      
      @scala.inline
      def setGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVisibleHeaderClosestToIndexUndefined: Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.undefined)
      
      @scala.inline
      def setIsGroupHeader(value: Boolean): Self = StObject.set(x, "isGroupHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGroupHeaderUndefined: Self = StObject.set(x, "isGroupHeader", js.undefined)
      
      @scala.inline
      def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait IDragZone
    extends typingsSlinky.extjs.Ext.dd.IDragZone
  object IDragZone {
    
    @scala.inline
    def apply(): IDragZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragZone]
    }
  }
  
  @js.native
  trait IDropZone
    extends typingsSlinky.extjs.Ext.dd.IDropZone
  object IDropZone {
    
    @scala.inline
    def apply(): IDropZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropZone]
    }
  }
}
