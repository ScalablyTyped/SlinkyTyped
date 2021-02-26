package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponsePaginationInfo extends StObject {
  
  var group_id: Null = js.native
  
  var source: Null = js.native
}
object TimelineFeedResponsePaginationInfo {
  
  @scala.inline
  def apply(group_id: Null, source: Null): TimelineFeedResponsePaginationInfo = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponsePaginationInfo]
  }
  
  @scala.inline
  implicit class TimelineFeedResponsePaginationInfoMutableBuilder[Self <: TimelineFeedResponsePaginationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup_id(value: Null): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
