package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalyticsreporting.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAnalyticsreporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  /** Returns the Analytics data. */
  def batchGet(request: Accesstoken): Request[GetReportsResponse] = js.native
  def batchGet(request: Alt, body: GetReportsRequest): Request[GetReportsResponse] = js.native
}
