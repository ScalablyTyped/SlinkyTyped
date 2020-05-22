package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDeploymentmanager.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: typingsSlinky.gapiClientDeploymentmanager.anon.Deployment): Request[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: MaxResults): Request[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: typingsSlinky.gapiClientDeploymentmanager.anon.Deployment => Request[Manifest],
    list: MaxResults => Request[ManifestsListResponse]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManifestsResource]
  }
}

