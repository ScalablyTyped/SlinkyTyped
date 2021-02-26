package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMScaleDependentSizeVariation extends StObject {
  
  /**
    * The scale the size is associated with.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The size for the associated scale.
    */
  var size: js.UndefOr[Double] = js.native
  
  var `type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation = js.native
}
object CIMScaleDependentSizeVariation {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation): CIMScaleDependentSizeVariation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMScaleDependentSizeVariation]
  }
  
  @scala.inline
  implicit class CIMScaleDependentSizeVariationMutableBuilder[Self <: CIMScaleDependentSizeVariation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
