package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.CreativeStatusId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsResource extends js.Object {
  
  /** List all details associated with a specific reason for which bids were filtered, with the number of bids filtered for each detail. */
  def list(): Request[ListCreativeStatusBreakdownByDetailResponse] = js.native
  def list(request: CreativeStatusId): Request[ListCreativeStatusBreakdownByDetailResponse] = js.native
}
