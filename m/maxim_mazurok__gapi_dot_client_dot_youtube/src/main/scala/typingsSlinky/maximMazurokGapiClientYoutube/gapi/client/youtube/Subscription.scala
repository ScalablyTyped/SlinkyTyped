package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  /** The contentDetails object contains basic statistics about the subscription. */
  var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.native
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify the subscription. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#subscription". */
  var kind: js.UndefOr[String] = js.native
  
  /** The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to. */
  var snippet: js.UndefOr[SubscriptionSnippet] = js.native
  
  /** The subscriberSnippet object contains basic details about the subscriber. */
  var subscriberSnippet: js.UndefOr[SubscriptionSubscriberSnippet] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setContentDetails(value: SubscriptionContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SubscriptionSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setSubscriberSnippet(value: SubscriptionSubscriberSnippet): Self = this.set("subscriberSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriberSnippet: Self = this.set("subscriberSnippet", js.undefined)
  }
}
