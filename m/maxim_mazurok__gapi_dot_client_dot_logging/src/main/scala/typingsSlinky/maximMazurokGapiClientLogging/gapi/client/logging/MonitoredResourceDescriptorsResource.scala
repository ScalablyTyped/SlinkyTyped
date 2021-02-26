package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientLogging.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptorsResource extends StObject {
  
  /** Lists the descriptors for monitored resource types used by Logging. */
  def list(): Request[ListMonitoredResourceDescriptorsResponse] = js.native
  def list(request: PageToken): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}
