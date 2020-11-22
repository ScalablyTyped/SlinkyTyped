package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1p1beta1Finding extends js.Object {
  
  /** The additional taxonomy group within findings from a given source. This field is immutable after creation time. Example: "XSS_FLASH_INJECTION" */
  var category: js.UndefOr[String] = js.native
  
  /** The time at which the finding was created in Security Command Center. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which the event took place, or when an update to the finding occurred. For example, if the finding represents an open firewall it would capture the time the detector
    * believes the firewall became open. The accuracy is determined by the detector. If the finding were to be resolved afterward, this time would reflect when the finding was resolved.
    */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * The URI that, if available, points to a web page outside of Security Command Center where additional information about the finding can be found. This field is guaranteed to be
    * either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of the source the finding belongs to. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is immutable after
    * creation time. For example: "organizations/{organization_id}/sources/{source_id}"
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * For findings on Google Cloud resources, the full resource name of the Google Cloud resource this finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for a non-Google Cloud resource, the resourceName can be a customer or partner defined
    * string. This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /** Output only. User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the finding. */
  var securityMarks: js.UndefOr[GoogleCloudSecuritycenterV1p1beta1SecurityMarks] = js.native
  
  /** The severity of the finding. This field is managed by the source that writes the finding. */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Source specific properties. These properties are managed by the source that writes the finding. The key names in the source_properties map must be between 1 and 255 characters, and
    * must start with a letter and contain alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1Finding with TopLevel[js.Any]
  ] = js.native
  
  /** The state of the finding. */
  var state: js.UndefOr[String] = js.native
}
object GoogleCloudSecuritycenterV1p1beta1Finding {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1p1beta1Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1p1beta1Finding]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1p1beta1FindingOps[Self <: GoogleCloudSecuritycenterV1p1beta1Finding] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setExternalUri(value: String): Self = this.set("externalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalUri: Self = this.set("externalUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: GoogleCloudSecuritycenterV1p1beta1SecurityMarks): Self = this.set("securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityMarks: Self = this.set("securityMarks", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSourceProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1Finding with TopLevel[js.Any]
    ): Self = this.set("sourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProperties: Self = this.set("sourceProperties", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
