package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderProperties extends StObject {
  
  /** The dash style of the border. */
  var dashStyle: js.UndefOr[String] = js.native
  
  /** The fill of the table border. */
  var tableBorderFill: js.UndefOr[TableBorderFill] = js.native
  
  /** The thickness of the border. */
  var weight: js.UndefOr[Dimension] = js.native
}
object TableBorderProperties {
  
  @scala.inline
  def apply(): TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderProperties]
  }
  
  @scala.inline
  implicit class TableBorderPropertiesMutableBuilder[Self <: TableBorderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setTableBorderFill(value: TableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
    
    @scala.inline
    def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
