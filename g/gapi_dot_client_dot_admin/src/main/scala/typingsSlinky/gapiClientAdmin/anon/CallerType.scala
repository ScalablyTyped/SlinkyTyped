package typingsSlinky.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallerType extends js.Object {
  
  /** User or OAuth 2LO request. */
  var callerType: js.UndefOr[String] = js.native
  
  /** Email address of the user. */
  var email: js.UndefOr[String] = js.native
  
  /** For OAuth 2LO API requests, consumer_key of the requestor. */
  var key: js.UndefOr[String] = js.native
  
  /** Obfuscated user id of the user. */
  var profileId: js.UndefOr[String] = js.native
}
object CallerType {
  
  @scala.inline
  def apply(): CallerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallerType]
  }
  
  @scala.inline
  implicit class CallerTypeOps[Self <: CallerType] (val x: Self) extends AnyVal {
    
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
    def setCallerType(value: String): Self = this.set("callerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerType: Self = this.set("callerType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
  }
}
