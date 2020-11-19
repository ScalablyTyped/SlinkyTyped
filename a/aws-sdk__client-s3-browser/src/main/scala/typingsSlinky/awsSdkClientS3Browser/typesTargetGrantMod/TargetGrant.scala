package typingsSlinky.awsSdkClientS3Browser.typesTargetGrantMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typingsSlinky.awsSdkClientS3Browser.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGrant extends js.Object {
  
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesGranteeMod.Grantee] = js.native
  
  /**
    * <p>Logging permissions assigned to the Grantee for the bucket.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.native
}
object TargetGrant {
  
  @scala.inline
  def apply(): TargetGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGrant]
  }
  
  @scala.inline
  implicit class TargetGrantOps[Self <: TargetGrant] (val x: Self) extends AnyVal {
    
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
    def setPermission(value: FULL_CONTROL | READ | WRITE | String): Self = this.set("Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
  }
}
