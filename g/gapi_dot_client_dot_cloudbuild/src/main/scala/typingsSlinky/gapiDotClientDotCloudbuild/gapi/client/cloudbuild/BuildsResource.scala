package typingsSlinky.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCloudbuild.Anon_AccesstokenAltBearertoken
import typingsSlinky.gapiDotClientDotCloudbuild.Anon_AccesstokenAltBearertokenCallback
import typingsSlinky.gapiDotClientDotCloudbuild.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: Anon_AccesstokenAltBearertoken): Request[Build]
  /**
    * Starts a build with the specified configuration.
    *
    * The long-running Operation returned by this method will include the ID of
    * the build, which can be passed to GetBuild to determine its status (e.g.,
    * success or failure).
    */
  def create(request: Anon_AccesstokenAltBearertokenCallback): Request[Operation]
  /**
    * Returns information about a previously requested build.
    *
    * The Build that is returned includes its status (e.g., success or failure,
    * or in-progress), and timing information.
    */
  def get(request: Anon_AccesstokenAltBearertoken): Request[Build]
  /**
    * Lists previously requested builds.
    *
    * Previously requested builds may still be in-progress, or may have finished
    * successfully or unsuccessfully.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListBuildsResponse]
}

object BuildsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAltBearertoken => Request[Build],
    create: Anon_AccesstokenAltBearertokenCallback => Request[Operation],
    get: Anon_AccesstokenAltBearertoken => Request[Build],
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListBuildsResponse]
  ): BuildsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BuildsResource]
  }
}

