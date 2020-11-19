package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPartners.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStatesResource extends js.Object {
  
  /** Lists states for current user. */
  def list(request: Fields): Request[ListUserStatesResponse] = js.native
}
object UserStatesResource {
  
  @scala.inline
  def apply(list: Fields => Request[ListUserStatesResponse]): UserStatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserStatesResource]
  }
  
  @scala.inline
  implicit class UserStatesResourceOps[Self <: UserStatesResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: Fields => Request[ListUserStatesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
