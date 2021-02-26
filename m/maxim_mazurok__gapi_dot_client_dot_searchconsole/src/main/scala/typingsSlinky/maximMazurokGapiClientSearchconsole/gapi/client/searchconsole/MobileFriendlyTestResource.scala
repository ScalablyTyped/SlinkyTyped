package typingsSlinky.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Key
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileFriendlyTestResource extends StObject {
  
  def run(request: Key, body: RunMobileFriendlyTestRequest): Request[RunMobileFriendlyTestResponse] = js.native
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: Oauthtoken): Request[RunMobileFriendlyTestResponse] = js.native
}
