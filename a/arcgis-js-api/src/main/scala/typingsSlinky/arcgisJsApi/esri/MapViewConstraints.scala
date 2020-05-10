package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewConstraints extends Object {
  /**
    * A read-only property that specifies the levels of detail (LODs) read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveLODs: js.UndefOr[js.Array[LOD]] = js.native
  /**
    * A read-only property that specifies the maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxScale: js.UndefOr[Double] = js.native
  /**
    * A read-only property that specifies the maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxZoom: js.UndefOr[Double] = js.native
  /**
    * A read-only property that specifies the minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinScale: js.UndefOr[Double] = js.native
  /**
    * A read-only property that specifies the minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinZoom: js.UndefOr[Double] = js.native
  /**
    * An array of [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html). If not specified, this value is read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). This property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var lods: js.UndefOr[js.Array[LOD]] = js.native
  /**
    * The maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view. Setting this value to `0` allows the user to overzoom layer tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view. Setting this value to `0` allows the user to overzoom layer tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * The minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minScale: js.UndefOr[Double] = js.native
  /**
    * The minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the user can rotate the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    *
    * @default true
    */
  var rotationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the view snaps to the next LOD when zooming in or out. When `false`, the zoom is continuous. This does not apply when zooming in/out using two finger pinch in/out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    *
    * @default true
    */
  var snapToZoom: js.UndefOr[Boolean] = js.native
}

object MapViewConstraints {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewConstraints = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewConstraints]
  }
  @scala.inline
  implicit class MapViewConstraintsOps[Self <: MapViewConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectiveLODs(value: js.Array[LOD]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveLODs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveLODs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveLODs")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMaxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMaxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMaxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMinScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMinScale")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMinZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withLods(value: js.Array[LOD]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToZoom")(js.undefined)
        ret
    }
  }
  
}

