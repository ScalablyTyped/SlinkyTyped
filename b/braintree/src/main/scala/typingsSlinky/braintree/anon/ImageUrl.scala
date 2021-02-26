package typingsSlinky.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageUrl extends StObject {
  
  var imageUrl: String = js.native
  
  var sourceDescription: String = js.native
  
  var token: String = js.native
  
  var username: String = js.native
  
  var venmoUserId: String = js.native
}
object ImageUrl {
  
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], venmoUserId = venmoUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  
  @scala.inline
  implicit class ImageUrlMutableBuilder[Self <: ImageUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVenmoUserId(value: String): Self = StObject.set(x, "venmoUserId", value.asInstanceOf[js.Any])
  }
}
