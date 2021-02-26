package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRun.anon.Alt
import typingsSlinky.maximMazurokGapiClientRun.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationsResource extends StObject {
  
  /** Get information about a configuration. */
  def get(): Request[Configuration] = js.native
  def get(request: Alt): Request[Configuration] = js.native
  
  /** List configurations. */
  def list(): Request[ListConfigurationsResponse] = js.native
  def list(request: Callback): Request[ListConfigurationsResponse] = js.native
}
