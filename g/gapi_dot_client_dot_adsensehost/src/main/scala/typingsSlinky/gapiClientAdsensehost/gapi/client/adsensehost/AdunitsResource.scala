package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsensehost.AnonAccountId
import typingsSlinky.gapiClientAdsensehost.AnonAdUnitId
import typingsSlinky.gapiClientAdsensehost.AnonHostCustomChannelId
import typingsSlinky.gapiClientAdsensehost.AnonIncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AnonAdUnitId): Request_[AdUnit] = js.native
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AnonAdUnitId): Request_[AdUnit] = js.native
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: AnonHostCustomChannelId): Request_[AdCode] = js.native
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AnonAccountId): Request_[AdUnit] = js.native
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: AnonIncludeInactive): Request_[AdUnits] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AnonAdUnitId): Request_[AdUnit] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AnonAccountId): Request_[AdUnit] = js.native
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: AnonAdUnitId => Request_[AdUnit],
    get: AnonAdUnitId => Request_[AdUnit],
    getAdCode: AnonHostCustomChannelId => Request_[AdCode],
    insert: AnonAccountId => Request_[AdUnit],
    list: AnonIncludeInactive => Request_[AdUnits],
    patch: AnonAdUnitId => Request_[AdUnit],
    update: AnonAccountId => Request_[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdunitsResource]
  }
  @scala.inline
  implicit class AdunitsResourceOps[Self <: AdunitsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAdUnitId => Request_[AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAdUnitId => Request_[AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAdCode(value: AnonHostCustomChannelId => Request_[AdCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAccountId => Request_[AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonIncludeInactive => Request_[AdUnits]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAdUnitId => Request_[AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAccountId => Request_[AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

