package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-start`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelClassProperties extends js.Object {
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    *
    * @default null
    */
  var labelExpression: js.UndefOr[String] = js.native
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    *
    * @default null
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.native
  /**
    * The position of the label. Possible values are based on the feature type. This property requires a value.
    *
    * | Feature Type | Possible Values |
    * |--------------|-----------------|
    * | Points       | `above-center`, `above-left`, `above-right`, `below-center`, `below-left`, `below-right`, `center-center`, `center-left`, `center-right` |
    * | Polylines    | `above-after`, `above-along`, `above-before`, `above-start`, `above-end`, `below-after`, `below-along`, `below-before`, `below-start`, `below-end`, `center-after`, `center-along`, `center-before`, `center-start`, `center-end`|
    * | Polygons     | `always-horizontal`|
    *
    * > **Known Limitations**
    *   * Currently, if the label has a [line callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html) in a 3D SceneView, then only `above-center` is supported.
    *   * Label placement only applies to [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) layers in 3D SceneViews.
    *   * FeatureLayer [Polylines](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) only support `center-along` label placement in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    *
    * @default null
    */
  var labelPlacement: js.UndefOr[
    `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
  ] = js.native
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[Double] = js.native
  /**
    * Defines the symbol used for rendering the label. If not set, the default symbol will be used. See the example below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.native
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[Boolean] = js.native
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    *
    * @default null
    */
  var where: js.UndefOr[String] = js.native
}

object LabelClassProperties {
  @scala.inline
  def apply(): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClassProperties]
  }
  @scala.inline
  implicit class LabelClassPropertiesOps[Self <: LabelClassProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelExpressionInfo(value: LabelClassLabelExpressionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExpressionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelExpressionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExpressionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPlacement(
      value: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
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
    def withSymbol(value: TextSymbolProperties | LabelSymbol3DProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCodedValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCodedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCodedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCodedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

