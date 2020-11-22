package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue extends js.Object {
  
  /** Required. The display name of the enum value. Must not be an empty string. */
  var displayName: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValueOps[Self <: GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue] (val x: Self) extends AnyVal {
    
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
  }
}
