package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageDetails extends js.Object {
  
  /**
    * Timestamp which tells creation date of the package.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.esMod.ErrorDetails] = js.native
  
  /**
    * User-specified description of the package.
    */
  var PackageDescription: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageDescription] = js.native
  
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageID] = js.native
  
  /**
    * User specified name of the package.
    */
  var PackageName: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageName] = js.native
  
  /**
    * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
    */
  var PackageStatus: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageStatus] = js.native
  
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageType] = js.native
}
object PackageDetails {
  
  @scala.inline
  def apply(): PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDetails]
  }
  
  @scala.inline
  implicit class PackageDetailsOps[Self <: PackageDetails] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: js.Date): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("ErrorDetails", js.undefined)
    
    @scala.inline
    def setPackageDescription(value: PackageDescription): Self = this.set("PackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageDescription: Self = this.set("PackageDescription", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageID: Self = this.set("PackageID", js.undefined)
    
    @scala.inline
    def setPackageName(value: PackageName): Self = this.set("PackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("PackageName", js.undefined)
    
    @scala.inline
    def setPackageStatus(value: PackageStatus): Self = this.set("PackageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageStatus: Self = this.set("PackageStatus", js.undefined)
    
    @scala.inline
    def setPackageType(value: PackageType): Self = this.set("PackageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageType: Self = this.set("PackageType", js.undefined)
  }
}
