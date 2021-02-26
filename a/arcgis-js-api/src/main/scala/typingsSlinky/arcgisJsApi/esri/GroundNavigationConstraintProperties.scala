package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundNavigationConstraintProperties extends Object {
  
  /**
    * The type of the constraint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: js.UndefOr[`stay-above` | none] = js.native
}
object GroundNavigationConstraintProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GroundNavigationConstraintProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GroundNavigationConstraintProperties]
  }
  
  @scala.inline
  implicit class GroundNavigationConstraintPropertiesMutableBuilder[Self <: GroundNavigationConstraintProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `stay-above` | none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
