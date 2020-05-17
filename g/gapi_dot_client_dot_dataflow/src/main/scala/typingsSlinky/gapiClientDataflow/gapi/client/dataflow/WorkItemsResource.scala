package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDataflow.anon.Accesstoken
import typingsSlinky.gapiClientDataflow.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemsResource extends js.Object {
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Accesstoken): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Alt): Request[LeaseWorkItemResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Accesstoken): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Alt): Request[ReportWorkItemStatusResponse] = js.native
}

