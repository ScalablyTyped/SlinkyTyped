package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMinuteUsageRequest extends StObject {
  
  /**
    * The month being requested, with a value of 1-12.
    */
  var month: Integer = js.native
  
  /**
    * The year being requested, in the format of YYYY.
    */
  var year: Integer = js.native
}
object GetMinuteUsageRequest {
  
  @scala.inline
  def apply(month: Integer, year: Integer): GetMinuteUsageRequest = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageRequest]
  }
  
  @scala.inline
  implicit class GetMinuteUsageRequestMutableBuilder[Self <: GetMinuteUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonth(value: Integer): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Integer): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
