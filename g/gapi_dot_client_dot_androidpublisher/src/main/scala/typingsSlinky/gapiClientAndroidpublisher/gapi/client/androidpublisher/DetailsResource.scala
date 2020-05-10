package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: AnonEditId): Request_[AppDetails] = js.native
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: AnonEditId): Request_[AppDetails] = js.native
  /** Updates app details for this edit. */
  def update(request: AnonEditId): Request_[AppDetails] = js.native
}

object DetailsResource {
  @scala.inline
  def apply(
    get: AnonEditId => Request_[AppDetails],
    patch: AnonEditId => Request_[AppDetails],
    update: AnonEditId => Request_[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DetailsResource]
  }
  @scala.inline
  implicit class DetailsResourceOps[Self <: DetailsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonEditId => Request_[AppDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonEditId => Request_[AppDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonEditId => Request_[AppDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

