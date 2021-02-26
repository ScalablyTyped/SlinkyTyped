package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geographic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.heading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.roll
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rotation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tilt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationVariable extends VisualVariable {
  
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    */
  var axis: heading | tilt | roll = js.native
  
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    */
  var rotationType: geographic | arithmetic = js.native
  
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#type)
    */
  @JSName("type")
  val type_RotationVariable: rotation = js.native
}
