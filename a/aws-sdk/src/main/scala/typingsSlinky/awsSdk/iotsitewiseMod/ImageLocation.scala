package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageLocation extends StObject {
  
  /**
    * The ID of the image.
    */
  var id: ID = js.native
  
  /**
    * The URL where the image is available. The URL is valid for 15 minutes so that you can view and download the image
    */
  var url: Url = js.native
}
object ImageLocation {
  
  @scala.inline
  def apply(id: ID, url: Url): ImageLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLocation]
  }
  
  @scala.inline
  implicit class ImageLocationMutableBuilder[Self <: ImageLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
