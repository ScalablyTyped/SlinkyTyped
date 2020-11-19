package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderreportsListDisbursementsResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderreportsListTransactionsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsCollection extends js.Object {
  
  // Retrieves a report for disbursements from your Merchant Center account.
  def listdisbursements(merchantId: String, disbursementStartDate: String): OrderreportsListDisbursementsResponse = js.native
  // Retrieves a report for disbursements from your Merchant Center account.
  def listdisbursements(merchantId: String, disbursementStartDate: String, optionalArgs: js.Object): OrderreportsListDisbursementsResponse = js.native
  
  // Retrieves a list of transactions for a disbursement from your Merchant Center account.
  def listtransactions(merchantId: String, disbursementId: String, transactionStartDate: String): OrderreportsListTransactionsResponse = js.native
  // Retrieves a list of transactions for a disbursement from your Merchant Center account.
  def listtransactions(merchantId: String, disbursementId: String, transactionStartDate: String, optionalArgs: js.Object): OrderreportsListTransactionsResponse = js.native
}
