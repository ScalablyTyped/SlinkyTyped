package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseProfilePicture extends StObject {
  
  var uri: String = js.native
}
object InsightsServiceAccountResponseProfilePicture {
  
  @scala.inline
  def apply(uri: String): InsightsServiceAccountResponseProfilePicture = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseProfilePicture]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseProfilePictureMutableBuilder[Self <: InsightsServiceAccountResponseProfilePicture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
