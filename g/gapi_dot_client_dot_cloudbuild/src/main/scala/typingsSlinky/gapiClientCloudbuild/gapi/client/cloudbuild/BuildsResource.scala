package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudbuild.AnonBearertoken
import typingsSlinky.gapiClientCloudbuild.AnonCallback
import typingsSlinky.gapiClientCloudbuild.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: AnonBearertoken): Request_[Build] = js.native
  /**
    * Starts a build with the specified configuration.
    *
    * The long-running Operation returned by this method will include the ID of
    * the build, which can be passed to GetBuild to determine its status (e.g.,
    * success or failure).
    */
  def create(request: AnonCallback): Request_[Operation] = js.native
  /**
    * Returns information about a previously requested build.
    *
    * The Build that is returned includes its status (e.g., success or failure,
    * or in-progress), and timing information.
    */
  def get(request: AnonBearertoken): Request_[Build] = js.native
  /**
    * Lists previously requested builds.
    *
    * Previously requested builds may still be in-progress, or may have finished
    * successfully or unsuccessfully.
    */
  def list(request: AnonFields): Request_[ListBuildsResponse] = js.native
}

object BuildsResource {
  @scala.inline
  def apply(
    cancel: AnonBearertoken => Request_[Build],
    create: AnonCallback => Request_[Operation],
    get: AnonBearertoken => Request_[Build],
    list: AnonFields => Request_[ListBuildsResponse]
  ): BuildsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BuildsResource]
  }
  @scala.inline
  implicit class BuildsResourceOps[Self <: BuildsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonBearertoken => Request_[Build]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonCallback => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[Build]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ListBuildsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

