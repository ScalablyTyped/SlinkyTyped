package typingsSlinky.luminoWidgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@lumino/widgets.@lumino/widgets/types/gridlayout.GridLayout.ICellConfig> */
  @js.native
  trait PartialICellConfig extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    var columnSpan: js.UndefOr[Double] = js.native
    
    var row: js.UndefOr[Double] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
  }
  object PartialICellConfig {
    
    @scala.inline
    def apply(): PartialICellConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICellConfig]
    }
    
    @scala.inline
    implicit class PartialICellConfigMutableBuilder[Self <: PartialICellConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
