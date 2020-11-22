package typingsSlinky.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientChromeuxreport.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientChromeuxreport.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordsResource extends js.Object {
  
  /**
    * Queries the Chrome User Experience for a single `record` for a given site. Returns a `record` that contains one or more `metrics` corresponding to performance data about the
    * requested site.
    */
  def queryRecord(request: Accesstoken): Request[QueryResponse] = js.native
  def queryRecord(request: Alt, body: QueryRequest): Request[QueryResponse] = js.native
}
