package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends js.Object {
  
  /** Gets one user by ID. */
  def get(request: UserId): Request[User] = js.native
}
object UsersResource {
  
  @scala.inline
  def apply(get: UserId => Request[User]): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: UserId => Request[User]): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
