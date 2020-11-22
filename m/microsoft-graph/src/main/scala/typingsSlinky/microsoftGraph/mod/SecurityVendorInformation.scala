package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityVendorInformation extends js.Object {
  
  // Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
  var provider: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the provider or subprovider, if it exists, that generated the alert. Required
  var providerVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
  var subProvider: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
  var vendor: js.UndefOr[NullableOption[String]] = js.native
}
object SecurityVendorInformation {
  
  @scala.inline
  def apply(): SecurityVendorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityVendorInformation]
  }
  
  @scala.inline
  implicit class SecurityVendorInformationOps[Self <: SecurityVendorInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvider(value: NullableOption[String]): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setProviderNull: Self = this.set("provider", null)
    
    @scala.inline
    def setProviderVersion(value: NullableOption[String]): Self = this.set("providerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderVersion: Self = this.set("providerVersion", js.undefined)
    
    @scala.inline
    def setProviderVersionNull: Self = this.set("providerVersion", null)
    
    @scala.inline
    def setSubProvider(value: NullableOption[String]): Self = this.set("subProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubProvider: Self = this.set("subProvider", js.undefined)
    
    @scala.inline
    def setSubProviderNull: Self = this.set("subProvider", null)
    
    @scala.inline
    def setVendor(value: NullableOption[String]): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
    
    @scala.inline
    def setVendorNull: Self = this.set("vendor", null)
  }
}
