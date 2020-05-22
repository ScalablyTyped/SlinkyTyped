package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDeploymentmanager.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: typingsSlinky.gapiClientDeploymentmanager.anon.Operation): Request[Operation]
  /** Lists all operations for a project. */
  def list(request: Filter): Request[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: typingsSlinky.gapiClientDeploymentmanager.anon.Operation => Request[Operation],
    list: Filter => Request[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
}

