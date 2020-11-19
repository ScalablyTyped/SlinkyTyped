package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedConfigurationVersionSummary extends js.Object {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.native
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.native
  
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The configuration version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.native
}
object HostedConfigurationVersionSummary {
  
  @scala.inline
  def apply(): HostedConfigurationVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersionSummary]
  }
  
  @scala.inline
  implicit class HostedConfigurationVersionSummaryOps[Self <: HostedConfigurationVersionSummary] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationProfileId: Self = this.set("ConfigurationProfileId", js.undefined)
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And255): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Integer): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
