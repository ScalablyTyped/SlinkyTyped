package typingsSlinky.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenColumns {
  
  @js.native
  trait Settings extends StObject {
    
    var columns: js.UndefOr[js.Array[Double]] = js.native
    
    var indicators: js.UndefOr[Boolean] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Double*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    }
  }
}
