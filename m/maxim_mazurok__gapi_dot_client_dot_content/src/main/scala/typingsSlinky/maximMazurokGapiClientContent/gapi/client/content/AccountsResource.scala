package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.AccesstokenAccountId
import typingsSlinky.maximMazurokGapiClientContent.anon.Force
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.Label
import typingsSlinky.maximMazurokGapiClientContent.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientContent.anon.MerchantId
import typingsSlinky.maximMazurokGapiClientContent.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientContent.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientContent.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientContent.anon.Resource
import typingsSlinky.maximMazurokGapiClientContent.anon.UploadType
import typingsSlinky.maximMazurokGapiClientContent.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientContent.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends js.Object {
  
  /** Returns information about the authenticated user. */
  def authinfo(): Request[AccountsAuthInfoResponse] = js.native
  def authinfo(request: Key): Request[AccountsAuthInfoResponse] = js.native
  
  /** Claims the website of a Merchant Center sub-account. */
  def claimwebsite(): Request[AccountsClaimWebsiteResponse] = js.native
  def claimwebsite(request: MerchantId): Request[AccountsClaimWebsiteResponse] = js.native
  
  def custombatch(request: Key, body: AccountsCustomBatchRequest): Request[AccountsCustomBatchResponse] = js.native
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: Oauthtoken): Request[AccountsCustomBatchResponse] = js.native
  
  /** Deletes a Merchant Center sub-account. */
  def delete(): Request[Unit] = js.native
  def delete(request: Force): Request[Unit] = js.native
  
  /** Retrieves a Merchant Center account. */
  def get(): Request[Account] = js.native
  def get(request: PrettyPrint): Request[Account] = js.native
  
  /** Creates a Merchant Center sub-account. */
  def insert(request: QuotaUser): Request[Account] = js.native
  def insert(request: UploadType, body: Account): Request[Account] = js.native
  
  var labels: LabelsResource = js.native
  
  /** Performs an action on a link between two Merchant Center accounts, namely accountId and linkedAccountId. */
  def link(request: Resource): Request[AccountsLinkResponse] = js.native
  def link(request: Uploadprotocol, body: AccountsLinkRequest): Request[AccountsLinkResponse] = js.native
  
  /** Lists the sub-accounts in your Merchant Center account. */
  def list(): Request[AccountsListResponse] = js.native
  def list(request: Label): Request[AccountsListResponse] = js.native
  
  /** Returns the list of accounts linked to your Merchant Center account. */
  def listlinks(): Request[AccountsListLinksResponse] = js.native
  def listlinks(request: MaxResults): Request[AccountsListLinksResponse] = js.native
  
  def update(request: Uploadprotocol, body: Account): Request[Account] = js.native
  /** Updates a Merchant Center account. Any fields that are not provided are deleted from the resource. */
  def update(request: Xgafv): Request[Account] = js.native
  
  /** Updates labels that are assigned to the Merchant Center account by CSS user. */
  def updatelabels(request: AccesstokenAccountId): Request[AccountsUpdateLabelsResponse] = js.native
  def updatelabels(request: Uploadprotocol, body: AccountsUpdateLabelsRequest): Request[AccountsUpdateLabelsResponse] = js.native
}
