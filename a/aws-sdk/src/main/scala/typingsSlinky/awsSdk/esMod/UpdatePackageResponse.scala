package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePackageResponse extends js.Object {
  
  /**
    * Information about the package PackageDetails.
    */
  var PackageDetails: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageDetails] = js.native
}
object UpdatePackageResponse {
  
  @scala.inline
  def apply(): UpdatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePackageResponse]
  }
  
  @scala.inline
  implicit class UpdatePackageResponseOps[Self <: UpdatePackageResponse] (val x: Self) extends AnyVal {
    
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
    def setPackageDetails(value: PackageDetails): Self = this.set("PackageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageDetails: Self = this.set("PackageDetails", js.undefined)
  }
}
