package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Alt
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptorsResource extends StObject {
  
  /** Gets a single monitored resource descriptor. This method does not require a Workspace. */
  def get(): Request[MonitoredResourceDescriptor] = js.native
  def get(request: Alt): Request[MonitoredResourceDescriptor] = js.native
  
  /** Lists monitored resource descriptors that match a filter. This method does not require a Workspace. */
  def list(): Request[ListMonitoredResourceDescriptorsResponse] = js.native
  def list(request: PageSize): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}
