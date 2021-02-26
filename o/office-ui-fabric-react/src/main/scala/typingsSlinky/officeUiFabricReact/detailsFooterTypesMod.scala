package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsFooterTypesMod {
  
  type IDetailsFooterBaseProps = IDetailsItemProps
  
  @js.native
  trait IDetailsFooterProps extends IDetailsItemProps {
    
    /**
      * Column metadata
      */
    @JSName("columns")
    var columns_IDetailsFooterProps: js.Array[IColumn] = js.native
    
    /**
      * Selection mode
      */
    @JSName("selectionMode")
    var selectionMode_IDetailsFooterProps: SelectionMode = js.native
    
    /**
      * Selection from utilities
      */
    @JSName("selection")
    var selection_IDetailsFooterProps: ISelection[IObjectWithKey] = js.native
  }
  object IDetailsFooterProps {
    
    @scala.inline
    def apply(columns: js.Array[IColumn], selection: ISelection[IObjectWithKey], selectionMode: SelectionMode): IDetailsFooterProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsFooterProps]
    }
    
    @scala.inline
    implicit class IDetailsFooterPropsMutableBuilder[Self <: IDetailsFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
}
