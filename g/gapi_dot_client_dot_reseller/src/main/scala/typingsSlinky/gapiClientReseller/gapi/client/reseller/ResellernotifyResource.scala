package typingsSlinky.gapiClientReseller.gapi.client.reseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientReseller.anon.Alt
import typingsSlinky.gapiClientReseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResellernotifyResource extends js.Object {
  
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: Alt): Request[ResellernotifyGetwatchdetailsResponse] = js.native
  
  /** Registers a Reseller for receiving notifications. */
  def register(request: Fields): Request[ResellernotifyResource] = js.native
  
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.native
  
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: Fields): Request[ResellernotifyResource] = js.native
}
object ResellernotifyResource {
  
  @scala.inline
  def apply(
    getwatchdetails: Alt => Request[ResellernotifyGetwatchdetailsResponse],
    register: Fields => Request[ResellernotifyResource],
    unregister: Fields => Request[ResellernotifyResource]
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal(getwatchdetails = js.Any.fromFunction1(getwatchdetails), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[ResellernotifyResource]
  }
  
  @scala.inline
  implicit class ResellernotifyResourceOps[Self <: ResellernotifyResource] (val x: Self) extends AnyVal {
    
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
    def setGetwatchdetails(value: Alt => Request[ResellernotifyGetwatchdetailsResponse]): Self = this.set("getwatchdetails", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: Fields => Request[ResellernotifyResource]): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: Fields => Request[ResellernotifyResource]): Self = this.set("unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
