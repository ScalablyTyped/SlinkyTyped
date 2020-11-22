package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataSourcesResource extends js.Object {
  
  /** List custom data sources to which the user has access. */
  def list(): Request[CustomDataSources] = js.native
  def list(request: Startindex): Request[CustomDataSources] = js.native
}
