package typingsSlinky.googleapis.servicebrokerV1Mod.servicebrokerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait SchemaGoogleIamV1TestIamPermissionsRequest extends js.Object {
  
  /**
    * The set of permissions to check for the `resource`. Permissions with
    * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
    * For more information see [IAM
    * Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleIamV1TestIamPermissionsRequest {
  
  @scala.inline
  def apply(): SchemaGoogleIamV1TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleIamV1TestIamPermissionsRequestOps[Self <: SchemaGoogleIamV1TestIamPermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
}
