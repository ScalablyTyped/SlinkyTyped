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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClass
  extends Accessor
     with JSONSupport {
  
  /**
    * Defines how labels should be placed relative to one another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    */
  var deconflictionStrategy: none | static = js.native
  
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    */
  var labelExpression: String = js.native
  
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var labelExpressionInfo: LabelClassLabelExpressionInfo = js.native
  
  /**
    * The position of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    */
  var labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = js.native
  
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    */
  var minScale: Double = js.native
  
  /**
    * Defines the symbol used for rendering the label.
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
    * A SQL where clause used to determine the features to which the label class should be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    */
  var where: String = js.native
}
