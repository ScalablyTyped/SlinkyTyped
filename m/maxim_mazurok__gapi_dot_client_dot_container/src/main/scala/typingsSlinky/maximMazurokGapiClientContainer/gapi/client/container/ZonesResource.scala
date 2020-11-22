package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.ProjectIdQuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZonesResource extends js.Object {
  
  var clusters: ClustersResource = js.native
  
  /** Returns configuration info about the Google Kubernetes Engine service. */
  def getServerconfig(): Request[ServerConfig] = js.native
  def getServerconfig(request: ProjectIdQuotaUserUploadType): Request[ServerConfig] = js.native
  
  var operations: OperationsResource = js.native
}
