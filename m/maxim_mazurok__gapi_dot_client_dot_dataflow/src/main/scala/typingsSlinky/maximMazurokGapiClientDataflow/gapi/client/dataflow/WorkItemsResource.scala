package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDataflow.anon.UploadType
import typingsSlinky.maximMazurokGapiClientDataflow.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientDataflow.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemsResource extends StObject {
  
  def lease(request: PrettyPrint, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  def lease(request: QuotaUser, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: UploadType): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Xgafv): Request[LeaseWorkItemResponse] = js.native
  
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: AccesstokenAlt): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: PrettyPrint, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: QuotaUser, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Uploadprotocol): Request[ReportWorkItemStatusResponse] = js.native
}
