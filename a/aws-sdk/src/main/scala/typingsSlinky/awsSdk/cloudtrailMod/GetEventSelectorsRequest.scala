package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventSelectorsRequest extends StObject {
  
  /**
    * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are not valid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailName: String = js.native
}
object GetEventSelectorsRequest {
  
  @scala.inline
  def apply(TrailName: String): GetEventSelectorsRequest = {
    val __obj = js.Dynamic.literal(TrailName = TrailName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventSelectorsRequest]
  }
  
  @scala.inline
  implicit class GetEventSelectorsRequestMutableBuilder[Self <: GetEventSelectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrailName(value: String): Self = StObject.set(x, "TrailName", value.asInstanceOf[js.Any])
  }
}
