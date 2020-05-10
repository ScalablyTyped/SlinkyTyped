package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputationTopology extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.native
  /** The inputs to the computation. */
  var inputs: js.UndefOr[js.Array[StreamLocation]] = js.native
  /** The key ranges processed by the computation. */
  var keyRanges: js.UndefOr[js.Array[KeyRangeLocation]] = js.native
  /** The outputs from the computation. */
  var outputs: js.UndefOr[js.Array[StreamLocation]] = js.native
  /** The state family values. */
  var stateFamilies: js.UndefOr[js.Array[StateFamilyConfig]] = js.native
  /** The system stage name. */
  var systemStageName: js.UndefOr[String] = js.native
}

object ComputationTopology {
  @scala.inline
  def apply(): ComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputationTopology]
  }
  @scala.inline
  implicit class ComputationTopologyOps[Self <: ComputationTopology] (val x: Self) extends AnyVal {
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
    def withInputs(value: js.Array[StreamLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyRanges(value: js.Array[KeyRangeLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[StreamLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withStateFamilies(value: js.Array[StateFamilyConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStageName")(js.undefined)
        ret
    }
  }
  
}

