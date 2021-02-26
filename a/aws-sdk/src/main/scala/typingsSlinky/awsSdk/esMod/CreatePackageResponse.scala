package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePackageResponse extends StObject {
  
  /**
    * Information about the package PackageDetails.
    */
  var PackageDetails: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageDetails] = js.native
}
object CreatePackageResponse {
  
  @scala.inline
  def apply(): CreatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePackageResponse]
  }
  
  @scala.inline
  implicit class CreatePackageResponseMutableBuilder[Self <: CreatePackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
