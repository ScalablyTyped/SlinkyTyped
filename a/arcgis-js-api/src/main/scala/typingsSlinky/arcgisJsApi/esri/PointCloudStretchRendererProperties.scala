package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudStretchRendererProperties extends PointCloudRendererProperties {
  /**
    * The name of the number field whose values are used to drive the continuous color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudStretchRendererLegendOptions] = js.native
  /**
    * An array of color value pairs. Points with values between the specified stops are colorized with linearly interpolated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var stops: js.UndefOr[js.Array[PointCloudStretchRendererStops]] = js.native
}

object PointCloudStretchRendererProperties {
  @scala.inline
  def apply(): PointCloudStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudStretchRendererProperties]
  }
  @scala.inline
  implicit class PointCloudStretchRendererPropertiesOps[Self <: PointCloudStretchRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTransformType(value: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTransformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransformType")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendOptions(value: PointCloudStretchRendererLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStops(value: js.Array[PointCloudStretchRendererStops]): Self = {
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

