package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.AdClientId
import typingsSlinky.gapiClientAdsensehost.anon.MaxResults
import typingsSlinky.gapiClientAdsensehost.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends js.Object {
  
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: QuotaUser): Request[UrlChannel] = js.native
  
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AdClientId): Request[UrlChannel] = js.native
  
  /** List all host URL channels in the host AdSense account. */
  def list(request: MaxResults): Request[UrlChannels] = js.native
}
object UrlchannelsResource {
  
  @scala.inline
  def apply(
    delete: QuotaUser => Request[UrlChannel],
    insert: AdClientId => Request[UrlChannel],
    list: MaxResults => Request[UrlChannels]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlchannelsResource]
  }
  
  @scala.inline
  implicit class UrlchannelsResourceOps[Self <: UrlchannelsResource] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: QuotaUser => Request[UrlChannel]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: AdClientId => Request[UrlChannel]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: MaxResults => Request[UrlChannels]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
