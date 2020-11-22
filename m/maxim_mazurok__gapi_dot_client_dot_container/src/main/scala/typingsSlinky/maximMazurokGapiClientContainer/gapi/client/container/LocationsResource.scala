package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.NameOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var clusters: ClustersResource = js.native
  
  /** Returns configuration info about the Google Kubernetes Engine service. */
  def getServerConfig(): Request[ServerConfig] = js.native
  def getServerConfig(request: NameOauthtokenPrettyPrint): Request[ServerConfig] = js.native
  
  var operations: OperationsResource = js.native
}
