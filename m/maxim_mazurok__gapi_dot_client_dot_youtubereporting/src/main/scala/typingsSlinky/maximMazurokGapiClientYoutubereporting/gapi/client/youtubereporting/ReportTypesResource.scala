package typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutubereporting.anon.IncludeSystemManaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTypesResource extends js.Object {
  
  /** Lists report types. */
  def list(): Request[ListReportTypesResponse] = js.native
  def list(request: IncludeSystemManaged): Request[ListReportTypesResponse] = js.native
}
