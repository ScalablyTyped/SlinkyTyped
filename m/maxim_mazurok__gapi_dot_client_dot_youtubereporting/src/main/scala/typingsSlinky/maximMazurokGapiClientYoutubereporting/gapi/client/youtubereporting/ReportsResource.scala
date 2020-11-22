package typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutubereporting.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientYoutubereporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  /** Gets the metadata of a specific report. */
  def get(): Request[Report] = js.native
  def get(request: Accesstoken): Request[Report] = js.native
  
  /** Lists reports created by a specific job. Returns NOT_FOUND if the job does not exist. */
  def list(): Request[ListReportsResponse] = js.native
  def list(request: Alt): Request[ListReportsResponse] = js.native
}
