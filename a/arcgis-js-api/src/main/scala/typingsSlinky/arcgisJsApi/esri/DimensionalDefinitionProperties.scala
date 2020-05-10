package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionalDefinitionProperties extends js.Object {
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    *
    * @default false
    */
  var isSlice: js.UndefOr[Boolean] = js.native
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.native
}

object DimensionalDefinitionProperties {
  @scala.inline
  def apply(): DimensionalDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionalDefinitionProperties]
  }
  @scala.inline
  implicit class DimensionalDefinitionPropertiesOps[Self <: DimensionalDefinitionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSlice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSlice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSlice")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableName")(js.undefined)
        ret
    }
  }
  
}

