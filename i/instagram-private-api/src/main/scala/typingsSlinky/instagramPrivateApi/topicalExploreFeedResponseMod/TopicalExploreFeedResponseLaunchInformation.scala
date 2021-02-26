package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseLaunchInformation extends StObject {
  
  var drops_campaign_id: String = js.native
  
  var has_launched: Boolean = js.native
  
  var is_ig_exclusive: Boolean = js.native
  
  var launch_date: Double = js.native
}
object TopicalExploreFeedResponseLaunchInformation {
  
  @scala.inline
  def apply(drops_campaign_id: String, has_launched: Boolean, is_ig_exclusive: Boolean, launch_date: Double): TopicalExploreFeedResponseLaunchInformation = {
    val __obj = js.Dynamic.literal(drops_campaign_id = drops_campaign_id.asInstanceOf[js.Any], has_launched = has_launched.asInstanceOf[js.Any], is_ig_exclusive = is_ig_exclusive.asInstanceOf[js.Any], launch_date = launch_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseLaunchInformation]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseLaunchInformationMutableBuilder[Self <: TopicalExploreFeedResponseLaunchInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrops_campaign_id(value: String): Self = StObject.set(x, "drops_campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_launched(value: Boolean): Self = StObject.set(x, "has_launched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_ig_exclusive(value: Boolean): Self = StObject.set(x, "is_ig_exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch_date(value: Double): Self = StObject.set(x, "launch_date", value.asInstanceOf[js.Any])
  }
}
