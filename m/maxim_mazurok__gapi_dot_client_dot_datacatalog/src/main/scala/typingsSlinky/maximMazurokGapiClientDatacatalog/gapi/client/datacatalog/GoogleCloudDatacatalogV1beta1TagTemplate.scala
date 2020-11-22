package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1TagTemplate extends js.Object {
  
  /** The display name for this template. Defaults to an empty string. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500
    * fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least
    * 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagTemplateField}
    */ typingsSlinky.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1TagTemplate with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The resource name of the tag template in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} Note that this TagTemplate and its child
    * resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1TagTemplate {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagTemplate]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagTemplateOps[Self <: GoogleCloudDatacatalogV1beta1TagTemplate] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagTemplateField}
      */ typingsSlinky.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1TagTemplate with TopLevel[js.Any]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
