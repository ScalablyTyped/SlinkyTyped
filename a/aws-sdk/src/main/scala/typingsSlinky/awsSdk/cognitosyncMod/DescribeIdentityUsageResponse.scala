package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityUsageResponse extends StObject {
  
  /**
    * Usage information for the identity.
    */
  var IdentityUsage: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityUsage] = js.native
}
object DescribeIdentityUsageResponse {
  
  @scala.inline
  def apply(): DescribeIdentityUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityUsageResponse]
  }
  
  @scala.inline
  implicit class DescribeIdentityUsageResponseMutableBuilder[Self <: DescribeIdentityUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityUsage(value: IdentityUsage): Self = StObject.set(x, "IdentityUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUsageUndefined: Self = StObject.set(x, "IdentityUsage", js.undefined)
  }
}
