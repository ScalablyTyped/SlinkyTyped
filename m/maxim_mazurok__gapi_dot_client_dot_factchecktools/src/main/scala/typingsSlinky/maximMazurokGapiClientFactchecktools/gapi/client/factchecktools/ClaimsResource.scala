package typingsSlinky.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFactchecktools.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsResource extends js.Object {
  
  /** Search through fact-checked claims. */
  def search(): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(request: Accesstoken): Request[GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
}
