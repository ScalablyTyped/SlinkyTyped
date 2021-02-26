package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointSymbol3DProperties extends Symbol3DProperties {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#callout)
    */
  var callout: js.UndefOr[LineCallout3DProperties] = js.native
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[PointSymbol3DVerticalOffsetProperties] = js.native
}
object PointSymbol3DProperties {
  
  @scala.inline
  def apply(): PointSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointSymbol3DProperties]
  }
  
  @scala.inline
  implicit class PointSymbol3DPropertiesMutableBuilder[Self <: PointSymbol3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallout(value: LineCallout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: PointSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
