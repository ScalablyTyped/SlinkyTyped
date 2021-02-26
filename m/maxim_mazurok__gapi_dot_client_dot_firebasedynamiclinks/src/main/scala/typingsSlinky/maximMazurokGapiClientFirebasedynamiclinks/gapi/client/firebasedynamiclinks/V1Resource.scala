package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.anon.Alt
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.anon.DurationDays
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.anon.Fields
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends StObject {
  
  /** Fetches analytics stats of a short Dynamic Link for a given duration. Metrics include number of clicks, redirects, installs, app first opens, and app reopens. */
  def getLinkStats(): Request[DynamicLinkStats] = js.native
  def getLinkStats(request: DurationDays): Request[DynamicLinkStats] = js.native
  
  def installAttribution(request: Alt, body: GetIosPostInstallAttributionRequest): Request[GetIosPostInstallAttributionResponse] = js.native
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: Fields): Request[GetIosPostInstallAttributionResponse] = js.native
  
  def reopenAttribution(request: Alt, body: GetIosReopenAttributionRequest): Request[GetIosReopenAttributionResponse] = js.native
  /** Get iOS reopen attribution for app universal link open deeplinking. */
  def reopenAttribution(request: Key): Request[GetIosReopenAttributionResponse] = js.native
}
