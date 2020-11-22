package typingsSlinky.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexperiencereport.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolatingSitesResource extends js.Object {
  
  /** Lists sites that are failing in the Ad Experience Report on at least one platform. */
  def list(): Request[ViolatingSitesResponse] = js.native
  def list(request: Alt): Request[ViolatingSitesResponse] = js.native
}
