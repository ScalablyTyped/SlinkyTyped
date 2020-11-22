package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FieldsFilterKey
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnersResource extends js.Object {
  
  /**
    * Bulk edits targeting options under a single partner. The operation will delete the assigned targeting options provided in
    * BulkEditPartnerAssignedTargetingOptionsRequest.deleteRequests and then create the assigned targeting options provided in
    * BulkEditPartnerAssignedTargetingOptionsRequest.createRequests .
    */
  def bulkEditPartnerAssignedTargetingOptions(request: PartnerIdPrettyPrintQuotaUser): Request[BulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(request: PrettyPrintQuotaUserUploadType, body: BulkEditPartnerAssignedTargetingOptionsRequest): Request[BulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  
  var channels: ChannelsResource = js.native
  
  /** Gets a partner. */
  def get(): Request[Partner] = js.native
  def get(request: PrettyPrintQuotaUserUploadType): Request[Partner] = js.native
  
  /** Lists partners that are accessible to the current user. The order is defined by the order_by parameter. */
  def list(): Request[ListPartnersResponse] = js.native
  def list(request: FieldsFilterKey): Request[ListPartnersResponse] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
