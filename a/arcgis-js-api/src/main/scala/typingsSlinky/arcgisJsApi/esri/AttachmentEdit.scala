package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentEdit extends Object {
  
  /**
    * The attachment to be added, updated or deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var attachment: AttachmentEditAttachment = js.native
  
  /**
    * The feature, `objectId` or `globalId` of feature associated with the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var feature: Graphic | Double | String = js.native
}
object AttachmentEdit {
  
  @scala.inline
  def apply(
    attachment: AttachmentEditAttachment,
    constructor: js.Function,
    feature: Graphic | Double | String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AttachmentEdit = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AttachmentEdit]
  }
  
  @scala.inline
  implicit class AttachmentEditMutableBuilder[Self <: AttachmentEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: AttachmentEditAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: Graphic | Double | String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
