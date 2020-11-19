package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventSelectorsRequest extends js.Object {
  
  /**
    * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
    */
  var EventSelectors: typingsSlinky.awsSdk.cloudtrailMod.EventSelectors = js.native
  
  /**
    * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailName: String = js.native
}
object PutEventSelectorsRequest {
  
  @scala.inline
  def apply(EventSelectors: EventSelectors, TrailName: String): PutEventSelectorsRequest = {
    val __obj = js.Dynamic.literal(EventSelectors = EventSelectors.asInstanceOf[js.Any], TrailName = TrailName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventSelectorsRequest]
  }
  
  @scala.inline
  implicit class PutEventSelectorsRequestOps[Self <: PutEventSelectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventSelectorsVarargs(value: EventSelector*): Self = this.set("EventSelectors", js.Array(value :_*))
    
    @scala.inline
    def setEventSelectors(value: EventSelectors): Self = this.set("EventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailName(value: String): Self = this.set("TrailName", value.asInstanceOf[js.Any])
  }
}
