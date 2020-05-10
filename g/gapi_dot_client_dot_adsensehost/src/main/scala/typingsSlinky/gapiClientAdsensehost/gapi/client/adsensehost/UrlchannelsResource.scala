package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsensehost.AnonAdClientId
import typingsSlinky.gapiClientAdsensehost.AnonMaxResults
import typingsSlinky.gapiClientAdsensehost.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: AnonQuotaUser): Request_[UrlChannel] = js.native
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[UrlChannel] = js.native
  /** List all host URL channels in the host AdSense account. */
  def list(request: AnonMaxResults): Request_[UrlChannels] = js.native
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[UrlChannel],
    insert: AnonAdClientId => Request_[UrlChannel],
    list: AnonMaxResults => Request_[UrlChannels]
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
    def withDelete(value: AnonQuotaUser => Request_[UrlChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAdClientId => Request_[UrlChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[UrlChannels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

