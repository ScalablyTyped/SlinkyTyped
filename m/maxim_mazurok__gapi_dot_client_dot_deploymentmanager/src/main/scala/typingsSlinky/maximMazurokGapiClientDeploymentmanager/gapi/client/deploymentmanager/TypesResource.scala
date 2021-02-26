package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDeploymentmanager.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypesResource extends StObject {
  
  /** Lists all resource types for Deployment Manager. */
  def list(): Request[TypesListResponse] = js.native
  def list(request: Filter): Request[TypesListResponse] = js.native
}
