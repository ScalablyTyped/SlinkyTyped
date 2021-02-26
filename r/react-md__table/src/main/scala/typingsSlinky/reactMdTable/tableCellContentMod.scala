package typingsSlinky.reactMdTable

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdIcon.textIconSpacingMod.TextIconSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellContentMod {
  
  @JSImport("@react-md/table/types/TableCellContent", "TableCellContent")
  @js.native
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps with RefAttributes[HTMLButtonElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTable.reactMdTableStrings.ascending
    - typingsSlinky.reactMdTable.reactMdTableStrings.descending
    - typingsSlinky.reactMdTable.reactMdTableStrings.none
    - typingsSlinky.reactMdTable.reactMdTableStrings.other
  */
  trait SortOrder extends StObject
  object SortOrder {
    
    @scala.inline
    def ascending: typingsSlinky.reactMdTable.reactMdTableStrings.ascending = "ascending".asInstanceOf[typingsSlinky.reactMdTable.reactMdTableStrings.ascending]
    
    @scala.inline
    def descending: typingsSlinky.reactMdTable.reactMdTableStrings.descending = "descending".asInstanceOf[typingsSlinky.reactMdTable.reactMdTableStrings.descending]
    
    @scala.inline
    def none: typingsSlinky.reactMdTable.reactMdTableStrings.none = "none".asInstanceOf[typingsSlinky.reactMdTable.reactMdTableStrings.none]
    
    @scala.inline
    def other: typingsSlinky.reactMdTable.reactMdTableStrings.other = "other".asInstanceOf[typingsSlinky.reactMdTable.reactMdTableStrings.other]
  }
  
  @js.native
  trait TableCellContentProps extends TextIconSpacingProps {
    
    /**
      * An optional id for the sort order button.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the icon should be rotated.
      */
    var rotated: js.UndefOr[Boolean] = js.native
    
    /**
      * The current sort order for this cell. Setting this to `null` will prevent
      * the button from being rendered.
      */
    var sortOrder: js.UndefOr[SortOrder] = js.native
    
    /**
      * An optional style for the sort order button.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TableCellContentProps {
    
    @scala.inline
    def apply(): TableCellContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellContentProps]
    }
    
    @scala.inline
    implicit class TableCellContentPropsMutableBuilder[Self <: TableCellContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
