package typingsSlinky.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBundleRequest extends StObject {
  
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId = js.native
}
object DescribeBundleRequest {
  
  @scala.inline
  def apply(bundleId: BundleId): DescribeBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBundleRequest]
  }
  
  @scala.inline
  implicit class DescribeBundleRequestMutableBuilder[Self <: DescribeBundleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: BundleId): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
  }
}
