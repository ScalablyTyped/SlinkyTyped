package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeRampElement
  extends Object
     with LegendElement {
  
  /**
    * The individual size stops rendered in the legend that correspond to the size visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var infos: js.Array[SizeRampStop] = js.native
  
  /**
    * The title of the size ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var title: js.UndefOr[String | RampTitle] = js.native
  
  /**
    * The type of this element is always `size-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var `type`: String = js.native
}
object SizeRampElement {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): SizeRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRampElement]
  }
  
  @scala.inline
  implicit class SizeRampElementMutableBuilder[Self <: SizeRampElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfos(value: js.Array[SizeRampStop]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfosVarargs(value: SizeRampStop*): Self = StObject.set(x, "infos", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String | RampTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
