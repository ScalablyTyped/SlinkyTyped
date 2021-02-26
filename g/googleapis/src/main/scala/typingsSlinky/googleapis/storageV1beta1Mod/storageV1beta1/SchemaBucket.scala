package typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1

import typingsSlinky.googleapis.anon.Entity
import typingsSlinky.googleapis.anon.MainPageSuffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket.
  */
@js.native
trait SchemaBucket extends StObject {
  
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  
  /**
    * The name of the bucket.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage in this location. Can be US or EU. Defaults to US.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The owner of the bucket. This will always be the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Entity] = js.native
  
  /**
    * The project the bucket belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  
  /**
    * The bucket&#39;s website configuration.
    */
  var website: js.UndefOr[MainPageSuffix] = js.native
}
object SchemaBucket {
  
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  @scala.inline
  implicit class SchemaBucketMutableBuilder[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: js.Array[SchemaBucketAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setAclVarargs(value: SchemaBucketAccessControl*): Self = StObject.set(x, "acl", js.Array(value :_*))
    
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "defaultObjectAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultObjectAclUndefined: Self = StObject.set(x, "defaultObjectAcl", js.undefined)
    
    @scala.inline
    def setDefaultObjectAclVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "defaultObjectAcl", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
