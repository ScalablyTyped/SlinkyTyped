package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKeyMetadata extends js.Object {
  
  /** The ID of the HMAC Key. */
  var accessId: js.UndefOr[String] = js.native
  
  /** HTTP 1.1 Entity tag for the HMAC key. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID of the HMAC key, including the Project ID and the Access ID. */
  var id: js.UndefOr[String] = js.native
  
  /** The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata. */
  var kind: js.UndefOr[String] = js.native
  
  /** Project ID owning the service account to which the key authenticates. */
  var projectId: js.UndefOr[String] = js.native
  
  /** The link to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The email address of the key's associated service account. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /** The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED. */
  var state: js.UndefOr[String] = js.native
  
  /** The creation time of the HMAC key in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.native
  
  /** The last modification time of the HMAC key metadata in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.native
}
object HmacKeyMetadata {
  
  @scala.inline
  def apply(): HmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKeyMetadata]
  }
  
  @scala.inline
  implicit class HmacKeyMetadataOps[Self <: HmacKeyMetadata] (val x: Self) extends AnyVal {
    
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
    def setAccessId(value: String): Self = this.set("accessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessId: Self = this.set("accessId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
