package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsensehost.AnonAdClientId
import typingsSlinky.gapiClientAdsensehost.AnonCustomChannelId
import typingsSlinky.gapiClientAdsensehost.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: AnonCustomChannelId): Request_[CustomChannel] = js.native
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: AnonCustomChannelId): Request_[CustomChannel] = js.native
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[CustomChannel] = js.native
  /** List all host custom channels in this AdSense account. */
  def list(request: AnonMaxResults): Request_[CustomChannels] = js.native
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: AnonCustomChannelId): Request_[CustomChannel] = js.native
  /** Update a custom channel in the host AdSense account. */
  def update(request: AnonAdClientId): Request_[CustomChannel] = js.native
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: AnonCustomChannelId => Request_[CustomChannel],
    get: AnonCustomChannelId => Request_[CustomChannel],
    insert: AnonAdClientId => Request_[CustomChannel],
    list: AnonMaxResults => Request_[CustomChannels],
    patch: AnonCustomChannelId => Request_[CustomChannel],
    update: AnonAdClientId => Request_[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomchannelsResource]
  }
  @scala.inline
  implicit class CustomchannelsResourceOps[Self <: CustomchannelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonCustomChannelId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCustomChannelId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAdClientId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[CustomChannels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCustomChannelId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAdClientId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

