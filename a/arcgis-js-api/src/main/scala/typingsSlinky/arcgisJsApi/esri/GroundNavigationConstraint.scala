package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundNavigationConstraint extends AnonymousAccessor {
  
  /**
    * The type of the constraint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: `stay-above` | none = js.native
}
object GroundNavigationConstraint {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, GroundNavigationConstraint]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], GroundNavigationConstraint]]),
    `type`: `stay-above` | none
  ): GroundNavigationConstraint = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundNavigationConstraint]
  }
  
  @scala.inline
  implicit class GroundNavigationConstraintMutableBuilder[Self <: GroundNavigationConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `stay-above` | none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
