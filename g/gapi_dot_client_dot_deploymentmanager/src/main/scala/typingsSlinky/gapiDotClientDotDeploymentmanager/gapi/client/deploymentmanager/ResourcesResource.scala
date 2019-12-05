package typingsSlinky.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDeploymentmanager.Anon_AltDeploymentFields
import typingsSlinky.gapiDotClientDotDeploymentmanager.Anon_AltDeploymentFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: Anon_AltDeploymentFieldsKey): Request[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: Anon_AltDeploymentFields): Request[ResourcesListResponse]
}

object ResourcesResource {
  @scala.inline
  def apply(
    get: Anon_AltDeploymentFieldsKey => Request[Resource],
    list: Anon_AltDeploymentFields => Request[ResourcesListResponse]
  ): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ResourcesResource]
  }
}

