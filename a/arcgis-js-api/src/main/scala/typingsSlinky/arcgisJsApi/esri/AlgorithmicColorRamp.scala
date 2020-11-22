package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cie-lab`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`lab-lch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.algorithmic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmicColorRamp extends ColorRamp {
  
  /**
    * The algorithm used to generate the colors between the `fromColor` and `toColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#algorithm)
    */
  var algorithm: `cie-lab` | `lab-lch` | hsv = js.native
  
  /**
    * The first color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#fromColor)
    */
  var fromColor: Color_ = js.native
  
  /**
    * The last color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#toColor)
    */
  var toColor: Color_ = js.native
  
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#type)
    */
  @JSName("type")
  val type_AlgorithmicColorRamp: algorithmic = js.native
}
