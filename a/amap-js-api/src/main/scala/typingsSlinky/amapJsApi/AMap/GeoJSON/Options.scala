package typingsSlinky.amapJsApi.AMap.GeoJSON

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApi.AMap.Polygon
import typingsSlinky.amapJsApi.AMap.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var coordsToLatLng: js.UndefOr[js.Function1[/* lnglat */ LngLat, LngLat]] = js.native
  // internal
  var coordsToLatLngs: js.UndefOr[js.Function1[/* lnglats */ js.Array[LngLat], js.Array[LngLat]]] = js.native
  /**
    * 要加载的标准GeoJSON对象
    */
  var geoJSON: js.UndefOr[GeoJSONObject | js.Array[GeoJSONObject]] = js.native
  /**
    * 指定点要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglat 点的位置
    */
  var getMarker: js.UndefOr[js.Function2[/* obj */ GeoJSONObject, /* lnglat */ LngLat, Marker[_]]] = js.native
  /**
    * 指定面要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 面的路径
    */
  var getPolygon: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polygon[_]]
  ] = js.native
  /**
    * 指定线要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 线的路径
    */
  var getPolyline: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polyline[_]]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordsToLatLng(value: /* lnglat */ LngLat => LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoordsToLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordsToLatLngs(value: /* lnglats */ js.Array[LngLat] => js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLngs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoordsToLatLngs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLngs")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoJSON(value: GeoJSONObject | js.Array[GeoJSONObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarker(value: (/* obj */ GeoJSONObject, /* lnglat */ LngLat) => Marker[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPolygon(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polygon[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPolyline(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polyline[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolyline")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolyline")(js.undefined)
        ret
    }
  }
  
}

