package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDeploymentmanager.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /** Gets information about a specific operation. */
  def get(): Request[Operation] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientDeploymentmanager.anon.Operation): Request[Operation] = js.native
  
  /** Lists all operations for a project. */
  def list(): Request[OperationsListResponse] = js.native
  def list(request: Filter): Request[OperationsListResponse] = js.native
}
