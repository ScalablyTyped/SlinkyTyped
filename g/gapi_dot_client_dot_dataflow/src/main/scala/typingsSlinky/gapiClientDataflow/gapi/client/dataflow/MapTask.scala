package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTask extends js.Object {
  /** The instructions in the MapTask. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.native
  /**
    * System-defined name of the stage containing this MapTask.
    * Unique across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of this MapTask.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}

object MapTask {
  @scala.inline
  def apply(): MapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTask]
  }
  @scala.inline
  implicit class MapTaskOps[Self <: MapTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

