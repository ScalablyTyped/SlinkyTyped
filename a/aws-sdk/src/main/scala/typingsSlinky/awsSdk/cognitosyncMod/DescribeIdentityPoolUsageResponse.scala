package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityPoolUsageResponse extends StObject {
  
  /**
    * Information about the usage of the identity pool.
    */
  var IdentityPoolUsage: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolUsage] = js.native
}
object DescribeIdentityPoolUsageResponse {
  
  @scala.inline
  def apply(): DescribeIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
  }
  
  @scala.inline
  implicit class DescribeIdentityPoolUsageResponseMutableBuilder[Self <: DescribeIdentityPoolUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolUsage(value: IdentityPoolUsage): Self = StObject.set(x, "IdentityPoolUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolUsageUndefined: Self = StObject.set(x, "IdentityPoolUsage", js.undefined)
  }
}
