package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingComputationConfig extends js.Object {
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[String] = js.native
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.native
  /** Stage name of this computation. */
  var stageName: js.UndefOr[String] = js.native
  /** System defined name for this computation. */
  var systemName: js.UndefOr[String] = js.native
}

object StreamingComputationConfig {
  @scala.inline
  def apply(): StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationConfig]
  }
  @scala.inline
  implicit class StreamingComputationConfigOps[Self <: StreamingComputationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructions(value: js.Array[ParallelInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(js.undefined)
        ret
    }
  }
  
}

