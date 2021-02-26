package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Alt
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullHashesResource extends StObject {
  
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: Alt): Request[FindFullHashesResponse] = js.native
  def find(request: Callback, body: FindFullHashesRequest): Request[FindFullHashesResponse] = js.native
}
