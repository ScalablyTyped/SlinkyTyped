package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.calm
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.large
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.medium
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.moderate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rippled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.slight
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.small
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.water
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterSymbol3DLayer
  extends Symbol3DLayer
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * The dominant color used to shade the water.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_WaterSymbol3DLayer: water = js.native
  
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    */
  var waterbodySize: small | medium | large = js.native
  
  /**
    * Indicates the direction in which the waves travel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    */
  var waveDirection: Double = js.native
  
  /**
    * Indicates the shape and intensity of the waves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    */
  var waveStrength: calm | rippled | slight | moderate = js.native
}
