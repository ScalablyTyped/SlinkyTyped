package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonContainerVersionId
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a Container Version. */
  def get(request: AnonContainerVersionId): Request_[ContainerVersion] = js.native
  /** Gets the live (i.e. published) container version */
  def live(request: AnonAlt): Request_[ContainerVersion] = js.native
  /** Publishes a Container Version. */
  def publish(request: AnonFingerprint): Request_[PublishContainerVersionResponse] = js.native
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: AnonFields): Request_[ContainerVersion] = js.native
  /** Undeletes a Container Version. */
  def undelete(request: AnonFields): Request_[ContainerVersion] = js.native
  /** Updates a Container Version. */
  def update(request: AnonFingerprint): Request_[ContainerVersion] = js.native
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonContainerVersionId => Request_[ContainerVersion],
    live: AnonAlt => Request_[ContainerVersion],
    publish: AnonFingerprint => Request_[PublishContainerVersionResponse],
    set_latest: AnonFields => Request_[ContainerVersion],
    undelete: AnonFields => Request_[ContainerVersion],
    update: AnonFingerprint => Request_[ContainerVersion]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), live = js.Any.fromFunction1(live), publish = js.Any.fromFunction1(publish), set_latest = js.Any.fromFunction1(set_latest), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VersionsResource]
  }
  @scala.inline
  implicit class VersionsResourceOps[Self <: VersionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonContainerVersionId => Request_[ContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLive(value: AnonAlt => Request_[ContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: AnonFingerprint => Request_[PublishContainerVersionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_latest(value: AnonFields => Request_[ContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_latest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndelete(value: AnonFields => Request_[ContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[ContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

