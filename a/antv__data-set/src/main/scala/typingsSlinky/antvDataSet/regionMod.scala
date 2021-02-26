package typingsSlinky.antvDataSet

import typingsSlinky.antvDataSet.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionMod {
  
  @js.native
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var field: String = js.native
    
    var geoDataView: View | String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(field: String, geoDataView: View | String): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], geoDataView = geoDataView.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoDataView(value: View | String): Self = StObject.set(x, "geoDataView", value.asInstanceOf[js.Any])
    }
  }
}
