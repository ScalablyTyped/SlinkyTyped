package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDeploymentmanager.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestsResource extends js.Object {
  
  /** Gets information about a specific manifest. */
  def get(): Request[Manifest] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientDeploymentmanager.anon.Manifest): Request[Manifest] = js.native
  
  /** Lists all manifests for a given deployment. */
  def list(): Request[ManifestsListResponse] = js.native
  def list(request: MaxResults): Request[ManifestsListResponse] = js.native
}
