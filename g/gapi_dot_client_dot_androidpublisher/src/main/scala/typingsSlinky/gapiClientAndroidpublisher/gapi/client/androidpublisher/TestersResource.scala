package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestersResource extends js.Object {
  def get(request: AnonOauthtoken): Request_[Testers] = js.native
  def patch(request: AnonOauthtoken): Request_[Testers] = js.native
  def update(request: AnonOauthtoken): Request_[Testers] = js.native
}

object TestersResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Testers],
    patch: AnonOauthtoken => Request_[Testers],
    update: AnonOauthtoken => Request_[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TestersResource]
  }
  @scala.inline
  implicit class TestersResourceOps[Self <: TestersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Testers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[Testers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Testers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

