package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnownUser extends js.Object {
  
  var isCurrentUser: js.UndefOr[Boolean] = js.native
  
  var personName: js.UndefOr[String] = js.native
}
object KnownUser {
  
  @scala.inline
  def apply(): KnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownUser]
  }
  
  @scala.inline
  implicit class KnownUserOps[Self <: KnownUser] (val x: Self) extends AnyVal {
    
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
    def setIsCurrentUser(value: Boolean): Self = this.set("isCurrentUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCurrentUser: Self = this.set("isCurrentUser", js.undefined)
    
    @scala.inline
    def setPersonName(value: String): Self = this.set("personName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonName: Self = this.set("personName", js.undefined)
  }
}
