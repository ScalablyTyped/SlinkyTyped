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
trait PointCloudUniqueValueRendererProperties extends PointCloudRendererProperties {
  /**
    * Each element in the array is an object that matches a unique value with a specific color. Features with equal values to those specified here will be assigned the associated color. For example, you may choose to visualize points representing low vegetation with a green color and points representing power lines with a gray color. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.UndefOr[js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]] = js.native
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudUniqueValueRendererLegendOptions] = js.native
}

object PointCloudUniqueValueRendererProperties {
  @scala.inline
  def apply(): PointCloudUniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudUniqueValueRendererProperties]
  }
  @scala.inline
  implicit class PointCloudUniqueValueRendererPropertiesOps[Self <: PointCloudUniqueValueRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorUniqueValueInfos(value: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorUniqueValueInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorUniqueValueInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorUniqueValueInfos")(js.undefined)
        ret
    }
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
    def withLegendOptions(value: PointCloudUniqueValueRendererLegendOptions): Self = {
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
  }
  
}

