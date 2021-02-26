package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidResponseErrorsResource extends StObject {
  
  /** List all errors that occurred in bid responses, with the number of bid responses affected for each reason. */
  def list(): Request[ListBidResponseErrorsResponse] = js.native
  def list(request: FilterSetName): Request[ListBidResponseErrorsResponse] = js.native
}
