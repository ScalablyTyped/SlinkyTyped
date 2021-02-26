package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdOnBehalfOfContentOwner extends StObject {
  
  /**
    * The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
    */
  var id: String = js.native
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
}
object IdOnBehalfOfContentOwner {
  
  @scala.inline
  def apply(id: String): IdOnBehalfOfContentOwner = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdOnBehalfOfContentOwner]
  }
  
  @scala.inline
  implicit class IdOnBehalfOfContentOwnerMutableBuilder[Self <: IdOnBehalfOfContentOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
  }
}
