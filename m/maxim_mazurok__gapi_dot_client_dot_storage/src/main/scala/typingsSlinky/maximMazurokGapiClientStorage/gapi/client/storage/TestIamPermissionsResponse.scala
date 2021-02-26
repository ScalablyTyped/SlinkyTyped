package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIamPermissionsResponse extends StObject {
  
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The permissions held by the caller. Permissions are always of the format storage.resource.capability, where resource is one of buckets or objects. The supported permissions are as
    * follows:
    * - storage.buckets.delete — Delete bucket.
    * - storage.buckets.get — Read bucket metadata.
    * - storage.buckets.getIamPolicy — Read bucket IAM policy.
    * - storage.buckets.create — Create bucket.
    * - storage.buckets.list — List buckets.
    * - storage.buckets.setIamPolicy — Update bucket IAM policy.
    * - storage.buckets.update — Update bucket metadata.
    * - storage.objects.delete — Delete object.
    * - storage.objects.get — Read object data and metadata.
    * - storage.objects.getIamPolicy — Read object IAM policy.
    * - storage.objects.create — Create object.
    * - storage.objects.list — List objects.
    * - storage.objects.setIamPolicy — Update object IAM policy.
    * - storage.objects.update — Update object metadata.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object TestIamPermissionsResponse {
  
  @scala.inline
  def apply(): TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestIamPermissionsResponse]
  }
  
  @scala.inline
  implicit class TestIamPermissionsResponseMutableBuilder[Self <: TestIamPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
