package typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access-control entry.
  */
@js.native
trait SchemaBucketAccessControl extends js.Object {
  
  /**
    * The name of the bucket.
    */
  var bucket: js.UndefOr[String] = js.native
  
  /**
    * The domain associated with the entity, if any.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The email address associated with the entity, if any.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The entity holding the permission, in one of the following forms:  -
    * user-userId  - user-email  - group-groupId  - group-email  -
    * domain-domain  - allUsers  - allAuthenticatedUsers Examples:  - The user
    * liz@example.com would be user-liz@example.com.  - The group
    * example@googlegroups.com would be group-example@googlegroups.com.  - To
    * refer to all members of the Google Apps for Business domain example.com,
    * the entity would be domain-example.com.
    */
  var entity: js.UndefOr[String] = js.native
  
  /**
    * The ID for the entity, if any.
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the access-control entry.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of item this is. For bucket access control entries, this is
    * always storage#bucketAccessControl.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The access permission for the entity. Can be READER, WRITER, or OWNER.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * The link to this access-control entry.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaBucketAccessControl {
  
  @scala.inline
  def apply(): SchemaBucketAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketAccessControl]
  }
  
  @scala.inline
  implicit class SchemaBucketAccessControlOps[Self <: SchemaBucketAccessControl] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
