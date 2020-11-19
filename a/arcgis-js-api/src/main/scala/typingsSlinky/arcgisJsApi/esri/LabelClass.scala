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
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClass
  extends Accessor
     with JSONSupport {
  
  /**
    * Defines how labels should be placed relative to one another. By default, labels have a `static` deconfliction strategy, meaning labels that overlap are dropped to make them easier to read.  In some cases where few labels overlap, it may be preferable to turn off label deconfliction with the `none` option. It is also advisable to turn off deconfliction when [labeling clusters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) with a count of features in the center of the cluster.  >>> esri-read-more  The following images illustrate when you may, or may not, want labels to deconflict.  When labeling dense layers, the default deconfliction strategy (`static`) is preferable since labeling all features causes significant overlap, making the labels illegible. Keeping the default setting allows some labels to render. As the user zooms in, all labels will eventually come into view.
    *
    * static (default) | none
    * -----------------|------
    * ![layer-deconfliction-on](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/layer-deconfliction-on.png) | ![layer-deconfliction-off](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/layer-deconfliction-off.png)
    *
    * When labeling clusters (or even sparsely distributed features) with small labels, it may be preferable to allow labels to slightly overlap since the information is still legible and doesn't significantly occlude the visualization. In the clustering scenario, a label deconfliction setting of `static` may actually cause more confusion, making some features not appear to be clusters.
    *
    * static (default) | none
    * -----------------|------
    * ![cluster-deconfliction-on](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/cluster-deconfliction-on.png) | ![cluster-deconfliction-off](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/cluster-deconfliction-off.png)
    *
    * >>>
    *
    * > **Known Limitations**  Currently, this property only applies to FeatureLayer, CSVLayer, and StreamLayer in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    *
    * @default static
    */
  var deconflictionStrategy: none | static = js.native
  
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    *
    * @default null
    */
  var labelExpression: String = js.native
  
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    *
    * @default null
    */
  var labelExpressionInfo: LabelClassLabelExpressionInfo = js.native
  
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
  var labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = js.native
  
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: Double = js.native
  
  /**
    * Defines the symbol used for rendering the label. If not set, the default symbol will be used. See the example below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: TextSymbol | LabelSymbol3D = js.native
  
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: Boolean = js.native
  
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    *
    * @default null
    */
  var where: String = js.native
}
