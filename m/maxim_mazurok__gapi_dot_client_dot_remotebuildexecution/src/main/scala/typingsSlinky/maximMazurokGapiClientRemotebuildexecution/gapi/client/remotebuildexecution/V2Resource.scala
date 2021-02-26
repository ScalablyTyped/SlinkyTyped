package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.anon.InstanceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V2Resource extends StObject {
  
  /**
    * GetCapabilities returns the server capabilities configuration of the remote endpoint. Only the capabilities of the services supported by the endpoint will be returned: * Execution +
    * CAS + Action Cache endpoints should return both CacheCapabilities and ExecutionCapabilities. * Execution only endpoints should return ExecutionCapabilities. * CAS + Action Cache
    * only endpoints should return CacheCapabilities.
    */
  def getCapabilities(): Request[BuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(request: InstanceName): Request[BuildBazelRemoteExecutionV2ServerCapabilities] = js.native
}
