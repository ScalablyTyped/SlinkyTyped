package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerMessage extends js.Object {
  /**
    * Labels are used to group WorkerMessages.
    * For example, a worker_message about a particular container
    * might have the labels:
    * { "JOB_ID": "2015-04-22",
    * "WORKER_ID": "wordcount-vm-2015…"
    * "CONTAINER_TYPE": "worker",
    * "CONTAINER_ID": "ac1234def"}
    * Label tags typically correspond to Label enum values. However, for ease
    * of development other strings can be used as tags. LABEL_UNSPECIFIED should
    * not be used here.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The timestamp of the worker_message. */
  var time: js.UndefOr[String] = js.native
  /** The health of a worker. */
  var workerHealthReport: js.UndefOr[WorkerHealthReport] = js.native
  /** A worker message code. */
  var workerMessageCode: js.UndefOr[WorkerMessageCode] = js.native
  /** Resource metrics reported by workers. */
  var workerMetrics: js.UndefOr[ResourceUtilizationReport] = js.native
  /** Shutdown notice by workers. */
  var workerShutdownNotice: js.UndefOr[WorkerShutdownNotice] = js.native
}

object WorkerMessage {
  @scala.inline
  def apply(): WorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessage]
  }
  @scala.inline
  implicit class WorkerMessageOps[Self <: WorkerMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerHealthReport(value: WorkerHealthReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHealthReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerHealthReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHealthReport")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMessageCode(value: WorkerMessageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerMessageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMetrics(value: ResourceUtilizationReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerShutdownNotice(value: WorkerShutdownNotice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerShutdownNotice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerShutdownNotice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerShutdownNotice")(js.undefined)
        ret
    }
  }
  
}

