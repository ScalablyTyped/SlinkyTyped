package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonEditId
import typingsSlinky.gapiClientAndroidpublisher.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: AnonOauthtoken): Request_[Track] = js.native
  /** Lists all the track configurations for this edit. */
  def list(request: AnonEditId): Request_[TracksListResponse] = js.native
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Track] = js.native
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: AnonOauthtoken): Request_[Track] = js.native
}

object TracksResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Track],
    list: AnonEditId => Request_[TracksListResponse],
    patch: AnonOauthtoken => Request_[Track],
    update: AnonOauthtoken => Request_[Track]
  ): TracksResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TracksResource]
  }
  @scala.inline
  implicit class TracksResourceOps[Self <: TracksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Track]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonEditId => Request_[TracksListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[Track]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Track]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

