package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedIdentityId extends js.Object {
  
  /**
    * The error code indicating the type of error that occurred.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.ErrorCode] = js.native
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityId] = js.native
}
object UnprocessedIdentityId {
  
  @scala.inline
  def apply(): UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedIdentityId]
  }
  
  @scala.inline
  implicit class UnprocessedIdentityIdOps[Self <: UnprocessedIdentityId] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
  }
}
