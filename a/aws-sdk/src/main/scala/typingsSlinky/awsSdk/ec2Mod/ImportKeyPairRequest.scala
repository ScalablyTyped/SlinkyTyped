package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportKeyPairRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * A unique name for the key pair.
    */
  var KeyName: String = js.native
  
  /**
    * The public key. For API calls, the text must be base64-encoded. For command line tools, base64 encoding is performed for you.
    */
  var PublicKeyMaterial: _Blob = js.native
  
  /**
    * The tags to apply to the imported key pair.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object ImportKeyPairRequest {
  
  @scala.inline
  def apply(KeyName: String, PublicKeyMaterial: _Blob): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], PublicKeyMaterial = PublicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
  
  @scala.inline
  implicit class ImportKeyPairRequestOps[Self <: ImportKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyMaterialUint8Array(value: js.typedarray.Uint8Array): Self = this.set("PublicKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyMaterial(value: _Blob): Self = this.set("PublicKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
