package typingsSlinky.awsSdkClientS3Node.typesGrantMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ_ACP
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE_ACP
import typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grant extends js.Object {
  
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.native
  
  /**
    * <p>Specifies the permission given to the grantee.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.native
}
object Grant {
  
  @scala.inline
  def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
    
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
    def setGrantee(value: Grantee): Self = this.set("Grantee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantee: Self = this.set("Grantee", js.undefined)
    
    @scala.inline
    def setPermission(value: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String): Self = this.set("Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
  }
}
