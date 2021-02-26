package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationFsxWindowsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows location to describe.
    */
  var LocationArn: typingsSlinky.awsSdk.datasyncMod.LocationArn = js.native
}
object DescribeLocationFsxWindowsRequest {
  
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxWindowsRequest]
  }
  
  @scala.inline
  implicit class DescribeLocationFsxWindowsRequestMutableBuilder[Self <: DescribeLocationFsxWindowsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
