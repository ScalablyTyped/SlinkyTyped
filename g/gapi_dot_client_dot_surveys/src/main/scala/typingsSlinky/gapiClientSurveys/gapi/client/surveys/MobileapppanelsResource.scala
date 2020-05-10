package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSurveys.AnonAlt
import typingsSlinky.gapiClientSurveys.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: AnonAlt): Request_[MobileAppPanel] = js.native
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: AnonFields): Request_[MobileAppPanelsListResponse] = js.native
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: AnonAlt): Request_[MobileAppPanel] = js.native
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[MobileAppPanel],
    list: AnonFields => Request_[MobileAppPanelsListResponse],
    update: AnonAlt => Request_[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MobileapppanelsResource]
  }
  @scala.inline
  implicit class MobileapppanelsResourceOps[Self <: MobileapppanelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAlt => Request_[MobileAppPanel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[MobileAppPanelsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[MobileAppPanel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

