package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geographic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.heading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.roll
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tilt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationVariableProperties extends VisualVariableProperties {
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Defines the axis the rotation visual variable should be applied to when rendering features with an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then the following rotation axis will rotate the symbol as indicated by their name.
    *
    * Possible Value | Description
    * ----------------|-----------
    * heading | The rotation of the symbol in the horizontal plane (i.e., around the z axis).
    * tilt | The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    * roll | The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    *
    * @default heading
    */
  var axis: js.UndefOr[heading | tilt | roll] = js.native
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured. See the table below for a list of possible values. This property only applies to rotations around the `heading` axis.
    *
    * Value | Description
    * ------|------------
    * geographic | Rotates the symbol from the north in a clockwise direction.
    * arithmetic | Rotates the symbol from the east in a counter-clockwise direction.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    *
    * @default geographic
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
  implicit class RotationVariablePropertiesOps[Self <: RotationVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: heading | tilt | roll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationType(value: geographic | arithmetic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationType")(js.undefined)
        ret
    }
  }
  
}

