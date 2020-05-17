package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudbuild.anon.Bearertoken
import typingsSlinky.gapiClientCloudbuild.anon.Callback
import typingsSlinky.gapiClientCloudbuild.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: Bearertoken): Request[Build] = js.native
  /**
    * Starts a build with the specified configuration.
    *
    * The long-running Operation returned by this method will include the ID of
    * the build, which can be passed to GetBuild to determine its status (e.g.,
    * success or failure).
    */
  def create(request: Callback): Request[Operation] = js.native
  /**
    * Returns information about a previously requested build.
    *
    * The Build that is returned includes its status (e.g., success or failure,
    * or in-progress), and timing information.
    */
  def get(request: Bearertoken): Request[Build] = js.native
  /**
    * Lists previously requested builds.
    *
    * Previously requested builds may still be in-progress, or may have finished
    * successfully or unsuccessfully.
    */
  def list(request: Fields): Request[ListBuildsResponse] = js.native
}

object BuildsResource {
  @scala.inline
  def apply(
    cancel: Bearertoken => Request[Build],
    create: Callback => Request[Operation],
    get: Bearertoken => Request[Build],
    list: Fields => Request[ListBuildsResponse]
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
    def withCancel(value: Bearertoken => Request[Build]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Callback => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Bearertoken => Request[Build]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ListBuildsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

