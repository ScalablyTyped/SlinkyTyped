package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.AdClientId
import typingsSlinky.gapiClientAdsensehost.anon.MaxResults
import typingsSlinky.gapiClientAdsensehost.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withDelete(value: QuotaUser => Request[UrlChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AdClientId => Request[UrlChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[UrlChannels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

