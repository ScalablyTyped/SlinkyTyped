package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerMessage provides information to the backend about a worker.
  */
@js.native
trait SchemaWorkerMessage extends js.Object {
  /**
    * Labels are used to group WorkerMessages. For example, a worker_message
    * about a particular container might have the labels: { &quot;JOB_ID&quot;:
    * &quot;2015-04-22&quot;,   &quot;WORKER_ID&quot;:
    * &quot;wordcount-vm-2015…&quot;   &quot;CONTAINER_TYPE&quot;:
    * &quot;worker&quot;,   &quot;CONTAINER_ID&quot;: &quot;ac1234def&quot;}
    * Label tags typically correspond to Label enum values. However, for ease
    * of development other strings can be used as tags. LABEL_UNSPECIFIED
    * should not be used here.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The timestamp of the worker_message.
    */
  var time: js.UndefOr[String] = js.native
  /**
    * The health of a worker.
    */
  var workerHealthReport: js.UndefOr[SchemaWorkerHealthReport] = js.native
  /**
    * Record of worker lifecycle events.
    */
  var workerLifecycleEvent: js.UndefOr[SchemaWorkerLifecycleEvent] = js.native
  /**
    * A worker message code.
    */
  var workerMessageCode: js.UndefOr[SchemaWorkerMessageCode] = js.native
  /**
    * Resource metrics reported by workers.
    */
  var workerMetrics: js.UndefOr[SchemaResourceUtilizationReport] = js.native
  /**
    * Shutdown notice by workers.
    */
  var workerShutdownNotice: js.UndefOr[SchemaWorkerShutdownNotice] = js.native
}

object SchemaWorkerMessage {
  @scala.inline
  def apply(): SchemaWorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerMessage]
  }
  @scala.inline
  implicit class SchemaWorkerMessageOps[Self <: SchemaWorkerMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
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
    def withWorkerHealthReport(value: SchemaWorkerHealthReport): Self = {
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
    def withWorkerLifecycleEvent(value: SchemaWorkerLifecycleEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerLifecycleEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerLifecycleEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerLifecycleEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMessageCode(value: SchemaWorkerMessageCode): Self = {
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
    def withWorkerMetrics(value: SchemaResourceUtilizationReport): Self = {
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
    def withWorkerShutdownNotice(value: SchemaWorkerShutdownNotice): Self = {
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

