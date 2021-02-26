package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePackageResponse extends StObject {
  
  /**
    * PackageDetails
    */
  var PackageDetails: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageDetails] = js.native
}
object DeletePackageResponse {
  
  @scala.inline
  def apply(): DeletePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePackageResponse]
  }
  
  @scala.inline
  implicit class DeletePackageResponseMutableBuilder[Self <: DeletePackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
