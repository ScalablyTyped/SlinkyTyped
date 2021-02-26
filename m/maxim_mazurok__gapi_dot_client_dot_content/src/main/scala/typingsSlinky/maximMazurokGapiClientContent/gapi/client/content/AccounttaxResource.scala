package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.AccountIdAlt
import typingsSlinky.maximMazurokGapiClientContent.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientContent.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccounttaxResource extends StObject {
  
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: AltCallback): Request[AccounttaxCustomBatchResponse] = js.native
  def custombatch(request: Key, body: AccounttaxCustomBatchRequest): Request[AccounttaxCustomBatchResponse] = js.native
  
  /** Retrieves the tax settings of the account. */
  def get(): Request[AccountTax] = js.native
  def get(request: Uploadprotocol): Request[AccountTax] = js.native
  
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[AccounttaxListResponse] = js.native
  def list(request: CallbackFields): Request[AccounttaxListResponse] = js.native
  
  /** Updates the tax settings of the account. Any fields that are not provided are deleted from the resource. */
  def update(request: AccountIdAlt): Request[AccountTax] = js.native
  def update(request: Uploadprotocol, body: AccountTax): Request[AccountTax] = js.native
}
