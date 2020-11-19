package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Alt
import typingsSlinky.gapiClientYoutube.anon.ForChannelId
import typingsSlinky.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends js.Object {
  
  /** Deletes a subscription. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Adds a subscription for the authenticated user's channel. */
  def insert(request: Alt): Request[Subscription] = js.native
  
  /** Returns subscription resources that match the API request criteria. */
  def list(request: ForChannelId): Request[SubscriptionListResponse] = js.native
}
object SubscriptionsResource {
  
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[Subscription],
    list: ForChannelId => Request[SubscriptionListResponse]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SubscriptionsResource]
  }
  
  @scala.inline
  implicit class SubscriptionsResourceOps[Self <: SubscriptionsResource] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: Alt => Request[Subscription]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: ForChannelId => Request[SubscriptionListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
