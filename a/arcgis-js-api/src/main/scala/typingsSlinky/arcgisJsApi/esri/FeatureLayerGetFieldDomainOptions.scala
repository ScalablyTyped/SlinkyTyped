package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerGetFieldDomainOptions extends Object {
  
  /**
    * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#getFieldDomain)
    */
  var feature: Graphic = js.native
}
object FeatureLayerGetFieldDomainOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerGetFieldDomainOptions]
  }
  
  @scala.inline
  implicit class FeatureLayerGetFieldDomainOptionsMutableBuilder[Self <: FeatureLayerGetFieldDomainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
