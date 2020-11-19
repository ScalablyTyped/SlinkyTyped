package typingsSlinky.gapiClientOauth2.gapi.client.oauth2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientOauth2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeResource extends js.Object {
  
  def get(request: Alt): Request[Userinfoplus] = js.native
}
object MeResource {
  
  @scala.inline
  def apply(get: Alt => Request[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[MeResource]
  }
  
  @scala.inline
  implicit class MeResourceOps[Self <: MeResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Alt => Request[Userinfoplus]): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
