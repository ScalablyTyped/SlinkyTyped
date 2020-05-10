package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`fixed-size`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.splat
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudRendererPointSizeAlgorithm extends Object {
  /**
    * Specifies the scale factor that is applied to the size estimated by the density. Applies to `splat` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    *
    * @default 1
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  /**
    * Point size in meters (`useRealWorldSymbolSizes = true`) or points. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * `fixed-size` or `splat`. Choosing `fixed-size` implies setting `size` and `useRealWorldSymbolSizes`. If `splat` is chosen then `scaleFactor` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var `type`: `fixed-size` | splat = js.native
  /**
    * Specifies whether `size` is in real world units or screen-space units. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.native
}

object PointCloudRendererPointSizeAlgorithm {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `fixed-size` | splat
  ): PointCloudRendererPointSizeAlgorithm = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRendererPointSizeAlgorithm]
  }
  @scala.inline
  implicit class PointCloudRendererPointSizeAlgorithmOps[Self <: PointCloudRendererPointSizeAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `fixed-size` | splat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRealWorldSymbolSizes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRealWorldSymbolSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRealWorldSymbolSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRealWorldSymbolSizes")(js.undefined)
        ret
    }
  }
  
}

