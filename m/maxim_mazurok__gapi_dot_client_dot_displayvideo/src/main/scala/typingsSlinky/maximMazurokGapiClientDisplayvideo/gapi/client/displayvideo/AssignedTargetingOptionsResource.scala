package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AltAssignedTargetingOptionId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AssignedTargetingOptionId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AssignedTargetingOptionIdCallback
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FieldsFilter
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FilterKey
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.LineItemId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.OauthtokenOrderBy
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.QuotaUserTargetingType
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.TargetingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedTargetingOptionsResource extends js.Object {
  
  /** Assigns a targeting option to a partner. Returns the assigned targeting option if successful. */
  def create(request: AccesstokenAlt): Request[AssignedTargetingOption] = js.native
  /** Assigns a targeting option to a line item. Returns the assigned targeting option if successful. */
  def create(request: LineItemId): Request[AssignedTargetingOption] = js.native
  def create(request: OauthtokenPartnerId, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  /** Assigns a targeting option to an advertiser. Returns the assigned targeting option if successful. */
  def create(request: PrettyPrintQuotaUser): Request[AssignedTargetingOption] = js.native
  def create(request: QuotaUserTargetingType, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  def create(request: TargetingType, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  
  /** Deletes an assigned targeting option from a line item. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AltAssignedTargetingOptionId): Request[js.Object] = js.native
  def delete(request: AssignedTargetingOptionId): Request[js.Object] = js.native
  def delete(request: AssignedTargetingOptionIdCallback): Request[js.Object] = js.native
  
  /** Gets a single targeting option assigned to a line item. */
  def get(): Request[AssignedTargetingOption] = js.native
  def get(request: AltAssignedTargetingOptionId): Request[AssignedTargetingOption] = js.native
  def get(request: AssignedTargetingOptionId): Request[AssignedTargetingOption] = js.native
  def get(request: AssignedTargetingOptionIdCallback): Request[AssignedTargetingOption] = js.native
  
  /** Lists the targeting options assigned to a line item. */
  /** Lists the targeting options assigned to an advertiser. */
  /** Lists the targeting options assigned to a partner. */
  def list(): Request[ListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(request: FieldsFilter): Request[ListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(request: FilterKey): Request[ListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def list(request: OauthtokenOrderBy): Request[ListPartnerAssignedTargetingOptionsResponse] = js.native
}
