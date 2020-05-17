package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ellipse
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.line
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplate
  extends Accessor
     with JSONSupport {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: String = js.native
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow` = js.native
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: String = js.native
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: FeatureTemplateThumbnail = js.native
}

