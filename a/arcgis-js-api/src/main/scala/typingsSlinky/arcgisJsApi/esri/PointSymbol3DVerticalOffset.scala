package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointSymbol3DVerticalOffset extends AnonymousAccessor {
  
  /**
    * The maximum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.native
  
  /**
    * The minimum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.native
  
  /**
    * The vertical symbol offset in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var screenLength: Double = js.native
}
object PointSymbol3DVerticalOffset {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    screenLength: Double,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, PointSymbol3DVerticalOffset]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], PointSymbol3DVerticalOffset]])
  ): PointSymbol3DVerticalOffset = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), screenLength = screenLength.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSymbol3DVerticalOffset]
  }
  
  @scala.inline
  implicit class PointSymbol3DVerticalOffsetMutableBuilder[Self <: PointSymbol3DVerticalOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxWorldLength(value: Double): Self = StObject.set(x, "maxWorldLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorldLengthUndefined: Self = StObject.set(x, "maxWorldLength", js.undefined)
    
    @scala.inline
    def setMinWorldLength(value: Double): Self = StObject.set(x, "minWorldLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWorldLengthUndefined: Self = StObject.set(x, "minWorldLength", js.undefined)
    
    @scala.inline
    def setScreenLength(value: Double): Self = StObject.set(x, "screenLength", value.asInstanceOf[js.Any])
  }
}
