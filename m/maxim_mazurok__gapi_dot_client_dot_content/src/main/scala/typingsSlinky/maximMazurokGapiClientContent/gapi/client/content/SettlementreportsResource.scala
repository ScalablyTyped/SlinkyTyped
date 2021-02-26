package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.SettlementId
import typingsSlinky.maximMazurokGapiClientContent.anon.TransferEndDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementreportsResource extends StObject {
  
  /** Retrieves a settlement report from your Merchant Center account. */
  def get(): Request[SettlementReport] = js.native
  def get(request: SettlementId): Request[SettlementReport] = js.native
  
  /** Retrieves a list of settlement reports from your Merchant Center account. */
  def list(): Request[SettlementreportsListResponse] = js.native
  def list(request: TransferEndDate): Request[SettlementreportsListResponse] = js.native
}
