package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.SymbolTableElement
  - typingsSlinky.arcgisJsApi.esri.ColorRampElement
  - typingsSlinky.arcgisJsApi.esri.OpacityRampElement
  - typingsSlinky.arcgisJsApi.esri.SizeRampElement
  - typingsSlinky.arcgisJsApi.esri.HeatmapRampElement
  - typingsSlinky.arcgisJsApi.esri.RelationshipRampElement
*/
trait LegendElement extends StObject
object LegendElement {
  
  @scala.inline
  def ColorRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[ColorRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String | RampTitle,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.ColorRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.ColorRampElement]
  }
  
  @scala.inline
  def HeatmapRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[HeatmapRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.HeatmapRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.HeatmapRampElement]
  }
  
  @scala.inline
  def OpacityRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[OpacityRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.OpacityRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.OpacityRampElement]
  }
  
  @scala.inline
  def RelationshipRampElement(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    focus: String,
    hasOwnProperty: PropertyKey => Boolean,
    labels: RelationshipLabels,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.RelationshipRampElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.RelationshipRampElement]
  }
  
  @scala.inline
  def SizeRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.SizeRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.SizeRampElement]
  }
  
  @scala.inline
  def SymbolTableElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): typingsSlinky.arcgisJsApi.esri.SymbolTableElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.SymbolTableElement]
  }
}
