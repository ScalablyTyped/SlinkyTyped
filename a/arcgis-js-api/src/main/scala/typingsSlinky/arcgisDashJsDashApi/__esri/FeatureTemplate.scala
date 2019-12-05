package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`auto-complete-polygon`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`down-arrow`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`left-arrow`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`right-arrow`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`up-arrow`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.arrow
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ellipse
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.line
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.triangle
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

@JSGlobal("__esri.FeatureTemplate")
@js.native
object FeatureTemplate extends TopLevel[FeatureTemplateConstructor]

