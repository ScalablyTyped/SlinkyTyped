package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1p1beta1SecurityMarks extends js.Object {
  
  /**
    * Mutable user specified security marks belonging to the parent resource. Constraints are as follows: * Keys and values are treated as case insensitive * Keys must be between 1 - 256
    * characters (inclusive) * Keys must be letters, numbers, underscores, or dashes * Values have leading and trailing whitespace trimmed, remaining characters must be between 1 - 4096
    * characters (inclusive)
    */
  var marks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1SecurityMarks with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples:
    * "organizations/{organization_id}/assets/{asset_id}/securityMarks" "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudSecuritycenterV1p1beta1SecurityMarks {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1p1beta1SecurityMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1p1beta1SecurityMarks]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1p1beta1SecurityMarksOps[Self <: GoogleCloudSecuritycenterV1p1beta1SecurityMarks] (val x: Self) extends AnyVal {
    
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
    def setMarks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1SecurityMarks with TopLevel[js.Any]
    ): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
