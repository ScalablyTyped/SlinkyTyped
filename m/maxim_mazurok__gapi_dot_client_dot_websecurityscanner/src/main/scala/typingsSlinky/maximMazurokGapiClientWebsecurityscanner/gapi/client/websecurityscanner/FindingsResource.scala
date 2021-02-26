package typingsSlinky.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Alt
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingsResource extends StObject {
  
  /** Gets a Finding. */
  def get(): Request[Finding] = js.native
  def get(request: Alt): Request[Finding] = js.native
  
  /** List Findings under a given ScanRun. */
  def list(): Request[ListFindingsResponse] = js.native
  def list(request: Callback): Request[ListFindingsResponse] = js.native
}
