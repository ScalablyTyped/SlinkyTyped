package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerHealthReport extends js.Object {
  /**
    * The pods running on the worker. See:
    * http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod
    *
    * This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /**
    * The interval at which the worker is sending health reports.
    * The default value of 0 should be interpreted as the field is not being
    * explicitly set by the worker.
    */
  var reportInterval: js.UndefOr[String] = js.native
  /** Whether the VM is healthy. */
  var vmIsHealthy: js.UndefOr[Boolean] = js.native
  /** The time the VM was booted. */
  var vmStartupTime: js.UndefOr[String] = js.native
}

object WorkerHealthReport {
  @scala.inline
  def apply(): WorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerHealthReport]
  }
  @scala.inline
  implicit class WorkerHealthReportOps[Self <: WorkerHealthReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPods(value: js.Array[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pods")(js.undefined)
        ret
    }
    @scala.inline
    def withReportInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withVmIsHealthy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmIsHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmIsHealthy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmIsHealthy")(js.undefined)
        ret
    }
    @scala.inline
    def withVmStartupTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStartupTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmStartupTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStartupTime")(js.undefined)
        ret
    }
  }
  
}

