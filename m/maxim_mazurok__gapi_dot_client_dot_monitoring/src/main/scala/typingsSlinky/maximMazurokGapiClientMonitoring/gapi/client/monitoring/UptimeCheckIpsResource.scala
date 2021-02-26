package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.OauthtokenPageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UptimeCheckIpsResource extends StObject {
  
  /** Returns the list of IP addresses that checkers run from */
  def list(): Request[ListUptimeCheckIpsResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListUptimeCheckIpsResponse] = js.native
}
