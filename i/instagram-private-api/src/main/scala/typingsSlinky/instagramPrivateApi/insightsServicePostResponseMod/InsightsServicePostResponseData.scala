package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseData extends StObject {
  
  var media: InsightsServicePostResponseMedia = js.native
}
object InsightsServicePostResponseData {
  
  @scala.inline
  def apply(media: InsightsServicePostResponseMedia): InsightsServicePostResponseData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseData]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseDataMutableBuilder[Self <: InsightsServicePostResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: InsightsServicePostResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
