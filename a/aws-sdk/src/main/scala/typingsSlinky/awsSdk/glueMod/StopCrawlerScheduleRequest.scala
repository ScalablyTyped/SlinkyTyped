package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopCrawlerScheduleRequest extends StObject {
  
  /**
    * Name of the crawler whose schedule state to set.
    */
  var CrawlerName: NameString = js.native
}
object StopCrawlerScheduleRequest {
  
  @scala.inline
  def apply(CrawlerName: NameString): StopCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCrawlerScheduleRequest]
  }
  
  @scala.inline
  implicit class StopCrawlerScheduleRequestMutableBuilder[Self <: StopCrawlerScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
  }
}
