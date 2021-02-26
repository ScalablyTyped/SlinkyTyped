package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.FilterSetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LosingBidsResource extends StObject {
  
  /** List all reasons for which bids lost in the auction, with the number of bids that lost for each reason. */
  def list(): Request[ListLosingBidsResponse] = js.native
  def list(request: FilterSetName): Request[ListLosingBidsResponse] = js.native
}
