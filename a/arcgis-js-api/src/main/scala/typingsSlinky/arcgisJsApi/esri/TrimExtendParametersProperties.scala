package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimExtendParametersProperties extends js.Object {
  /**
    * A flag used with the `trimExtend` operation.
    *
    * Possible Value | Description
    * ---------------|-------------
    * default-curve-extension | The extension considers both ends of the path. The old ends remain and new points are added to the extended ends. The new points have attributes that are extrapolated from existing adjacent segments.
    * relocate-ends | When an extension is performed at an end, relocate the end point to the new position.
    * keep-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead, the attributes will be the same as the current end.
    * no-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead the attributes will be empty.
    * no-extend-at-from | Do not extend the 'from' end of any path.
    * no-extend-at-to | Do not extend the 'to' end of any path.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#extendHow)
    *
    * @default "default-curve-extension"
    */
  var extendHow: js.UndefOr[
    `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
  ] = js.native
  /**
    * The array of polylines to trim or extend. The structure of each geometry in the array is the same as the structure of the JSON polyline objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.native
  /**
    * A polyline used as a guide for trimming or extending input polylines. The structure of the polyline is the same as the structure of the JSON polyline object returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: js.UndefOr[PolylineProperties] = js.native
}

object TrimExtendParametersProperties {
  @scala.inline
  def apply(): TrimExtendParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimExtendParametersProperties]
  }
  @scala.inline
  implicit class TrimExtendParametersPropertiesOps[Self <: TrimExtendParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendHow(
      value: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendHow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendHow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendHow")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylines(value: js.Array[PolylineProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylines")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimExtendTo(value: PolylineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimExtendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimExtendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimExtendTo")(js.undefined)
        ret
    }
  }
  
}

