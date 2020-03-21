package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDataflow.AnonAccesstoken
import typingsSlinky.gapiClientDataflow.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemsResource extends js.Object {
  /** Leases a dataflow WorkItem to run. */
  def lease(request: AnonAccesstoken): Request_[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: AnonAlt): Request_[LeaseWorkItemResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: AnonAccesstoken): Request_[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: AnonAlt): Request_[ReportWorkItemStatusResponse] = js.native
}

