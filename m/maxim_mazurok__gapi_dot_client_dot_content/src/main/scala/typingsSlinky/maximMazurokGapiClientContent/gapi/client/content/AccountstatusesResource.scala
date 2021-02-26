package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientContent.anon.Destinations
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountstatusesResource extends StObject {
  
  /** Retrieves multiple Merchant Center account statuses in a single request. */
  def custombatch(request: AccesstokenAlt): Request[AccountstatusesCustomBatchResponse] = js.native
  def custombatch(request: Key, body: AccountstatusesCustomBatchRequest): Request[AccountstatusesCustomBatchResponse] = js.native
  
  /** Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts. */
  def get(): Request[AccountStatus] = js.native
  def get(request: Destinations): Request[AccountStatus] = js.native
  
  /** Lists the statuses of the sub-accounts in your Merchant Center account. */
  def list(): Request[AccountstatusesListResponse] = js.native
  def list(request: PageToken): Request[AccountstatusesListResponse] = js.native
}
