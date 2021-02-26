package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseHashtagsReach extends StObject {
  
  var follow_status: InsightsServiceAccountResponseFollowStatus = js.native
  
  var name: String = js.native
}
object InsightsServiceAccountResponseHashtagsReach {
  
  @scala.inline
  def apply(follow_status: InsightsServiceAccountResponseFollowStatus, name: String): InsightsServiceAccountResponseHashtagsReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsReach]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseHashtagsReachMutableBuilder[Self <: InsightsServiceAccountResponseHashtagsReach] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollow_status(value: InsightsServiceAccountResponseFollowStatus): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
