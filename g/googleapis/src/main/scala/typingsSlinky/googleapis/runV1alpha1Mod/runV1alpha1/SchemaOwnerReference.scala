package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OwnerReference contains enough information to let you identify an owning
  * object. Currently, an owning object must be in the same namespace, so there
  * is no namespace field.
  */
@js.native
trait SchemaOwnerReference extends StObject {
  
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * If true, AND if the owner has the &quot;foregroundDeletion&quot;
    * finalizer, then the owner cannot be deleted from the key-value store
    * until this reference is removed. Defaults to false. To set this field, a
    * user needs &quot;delete&quot; permission of the owner, otherwise 422
    * (Unprocessable Entity) will be returned. +optional
    */
  var blockOwnerDeletion: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, this reference points to the managing controller. +optional
    */
  var controller: js.UndefOr[Boolean] = js.native
  
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * UID of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[String] = js.native
}
object SchemaOwnerReference {
  
  @scala.inline
  def apply(): SchemaOwnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwnerReference]
  }
  
  @scala.inline
  implicit class SchemaOwnerReferenceMutableBuilder[Self <: SchemaOwnerReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setBlockOwnerDeletion(value: Boolean): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockOwnerDeletionUndefined: Self = StObject.set(x, "blockOwnerDeletion", js.undefined)
    
    @scala.inline
    def setController(value: Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
