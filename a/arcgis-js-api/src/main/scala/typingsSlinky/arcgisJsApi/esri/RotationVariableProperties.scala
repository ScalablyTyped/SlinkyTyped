package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geographic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.heading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.roll
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tilt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationVariableProperties extends VisualVariableProperties {
  
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    */
  var axis: js.UndefOr[heading | tilt | roll] = js.native
  
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    */
  var rotationType: js.UndefOr[geographic | arithmetic] = js.native
}
object RotationVariableProperties {
  
  @scala.inline
  def apply(): RotationVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationVariableProperties]
  }
  
  @scala.inline
  implicit class RotationVariablePropertiesMutableBuilder[Self <: RotationVariableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: heading | tilt | roll): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setRotationType(value: geographic | arithmetic): Self = StObject.set(x, "rotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationTypeUndefined: Self = StObject.set(x, "rotationType", js.undefined)
  }
}
