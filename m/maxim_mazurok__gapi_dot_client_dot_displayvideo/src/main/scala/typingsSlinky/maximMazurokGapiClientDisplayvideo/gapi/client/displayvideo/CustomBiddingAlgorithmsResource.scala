package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.CustomBiddingAlgorithmId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBiddingAlgorithmsResource extends StObject {
  
  /** Gets a custom bidding algorithm. */
  def get(): Request[CustomBiddingAlgorithm] = js.native
  def get(request: CustomBiddingAlgorithmId): Request[CustomBiddingAlgorithm] = js.native
  
  /** Lists custom bidding algorithms that are accessible to the current user and can be used in bidding stratgies. The order is defined by the order_by parameter. */
  def list(): Request[ListCustomBiddingAlgorithmsResponse] = js.native
  def list(request: PartnerIdPrettyPrint): Request[ListCustomBiddingAlgorithmsResponse] = js.native
}
