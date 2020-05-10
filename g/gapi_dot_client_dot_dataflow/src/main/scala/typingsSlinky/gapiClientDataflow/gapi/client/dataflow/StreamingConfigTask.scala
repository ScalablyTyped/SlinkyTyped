package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingConfigTask extends js.Object {
  /** Set of computation configuration information. */
  var streamingComputationConfigs: js.UndefOr[js.Array[StreamingComputationConfig]] = js.native
  /** Map from user step names to state families. */
  var userStepToStateFamilyNameMap: js.UndefOr[Record[String, String]] = js.native
  /**
    * If present, the worker must use this endpoint to communicate with Windmill
    * Service dispatchers, otherwise the worker must continue to use whatever
    * endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.native
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.native
}

object StreamingConfigTask {
  @scala.inline
  def apply(): StreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingConfigTask]
  }
  @scala.inline
  implicit class StreamingConfigTaskOps[Self <: StreamingConfigTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamingComputationConfigs(value: js.Array[StreamingComputationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingComputationConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStepToStateFamilyNameMap(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStepToStateFamilyNameMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStepToStateFamilyNameMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStepToStateFamilyNameMap")(js.undefined)
        ret
    }
    @scala.inline
    def withWindmillServiceEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServiceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindmillServiceEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServiceEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withWindmillServicePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServicePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindmillServicePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServicePort")(js.undefined)
        ret
    }
  }
  
}

