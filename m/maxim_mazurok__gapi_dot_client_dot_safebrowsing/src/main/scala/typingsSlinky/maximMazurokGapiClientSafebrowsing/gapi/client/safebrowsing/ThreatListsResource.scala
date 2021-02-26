package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatListsResource extends StObject {
  
  /** Lists the Safe Browsing threat lists available for download. */
  def list(): Request[ListThreatListsResponse] = js.native
  def list(request: Callback): Request[ListThreatListsResponse] = js.native
}
