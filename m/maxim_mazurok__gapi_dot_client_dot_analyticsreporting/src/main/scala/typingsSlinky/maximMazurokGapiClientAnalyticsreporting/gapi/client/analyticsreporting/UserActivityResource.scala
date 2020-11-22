package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalyticsreporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientAnalyticsreporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserActivityResource extends js.Object {
  
  def search(request: Alt, body: SearchUserActivityRequest): Request[SearchUserActivityResponse] = js.native
  /** Returns User Activity data. */
  def search(request: Callback): Request[SearchUserActivityResponse] = js.native
}
