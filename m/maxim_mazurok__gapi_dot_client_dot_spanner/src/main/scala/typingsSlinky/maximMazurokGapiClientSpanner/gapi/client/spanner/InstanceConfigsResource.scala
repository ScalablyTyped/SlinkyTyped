package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceConfigsResource extends js.Object {
  
  /** Gets information about a particular instance configuration. */
  def get(): Request[InstanceConfig] = js.native
  def get(request: Accesstoken): Request[InstanceConfig] = js.native
  
  /** Lists the supported instance configurations for a given project. */
  def list(): Request[ListInstanceConfigsResponse] = js.native
  def list(request: Alt): Request[ListInstanceConfigsResponse] = js.native
}
