package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for sending worker messages to the service.
  */
@js.native
trait SchemaSendWorkerMessagesRequest extends js.Object {
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The WorkerMessages to send.
    */
  var workerMessages: js.UndefOr[js.Array[SchemaWorkerMessage]] = js.native
}

object SchemaSendWorkerMessagesRequest {
  @scala.inline
  def apply(): SchemaSendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesRequest]
  }
  @scala.inline
  implicit class SchemaSendWorkerMessagesRequestOps[Self <: SchemaSendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMessages(value: js.Array[SchemaWorkerMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessages")(js.undefined)
        ret
    }
  }
  
}

