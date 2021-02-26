package typingsSlinky.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawledUrlsResource extends StObject {
  
  /** List CrawledUrls under a given ScanRun. */
  def list(): Request[ListCrawledUrlsResponse] = js.native
  def list(request: Accesstoken): Request[ListCrawledUrlsResponse] = js.native
}
