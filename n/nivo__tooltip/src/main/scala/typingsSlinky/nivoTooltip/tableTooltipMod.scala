package typingsSlinky.nivoTooltip

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/TableTooltip", "TableTooltip")
  @js.native
  val TableTooltip: ReactComponentClass[
    js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, ReactElement | Null]
  ] = js.native
  
  @js.native
  trait TableTooltipProps extends StObject {
    
    var renderContent: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    var rows: js.UndefOr[js.Array[js.Array[ReactElement]]] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object TableTooltipProps {
    
    @scala.inline
    def apply(): TableTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableTooltipProps]
    }
    
    @scala.inline
    implicit class TableTooltipPropsMutableBuilder[Self <: TableTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderContent(value: () => ReactElement): Self = StObject.set(x, "renderContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[js.Array[ReactElement]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: js.Array[ReactElement]*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
