package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityVariableProperties extends VisualVariableProperties {
  /**
    * Name of the numeric attribute field by which to normalize the data. If this field is used, then the values in [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * An array of objects that defines the opacity to apply to features in a layer in a sequence of stops. You must specify 2 - 8 stops. In most cases, no more than five are needed. Features with data values that fall between the given stops will be assigned opacity values linearly interpolated along the ramp in relation to the stop values. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.native
}

object OpacityVariableProperties {
  @scala.inline
  def apply(): OpacityVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityVariableProperties]
  }
  @scala.inline
  implicit class OpacityVariablePropertiesOps[Self <: OpacityVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizationField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizationField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationField")(js.undefined)
        ret
    }
    @scala.inline
    def withStops(value: js.Array[OpacityStopProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
  }
  
}

