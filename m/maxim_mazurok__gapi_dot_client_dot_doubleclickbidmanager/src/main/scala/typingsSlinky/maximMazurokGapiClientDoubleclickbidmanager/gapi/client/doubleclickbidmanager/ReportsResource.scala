package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  /** Retrieves stored reports. */
  def listreports(): Request[ListReportsResponse] = js.native
  def listreports(request: PageSize): Request[ListReportsResponse] = js.native
}
