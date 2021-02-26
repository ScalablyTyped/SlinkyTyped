package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Resource
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientIdResource extends StObject {
  
  /** Hashes the given Client ID. */
  def hashClientId(request: Resource): Request[HashClientIdResponse] = js.native
  def hashClientId(request: UserIp, body: HashClientIdRequest): Request[HashClientIdResponse] = js.native
}
