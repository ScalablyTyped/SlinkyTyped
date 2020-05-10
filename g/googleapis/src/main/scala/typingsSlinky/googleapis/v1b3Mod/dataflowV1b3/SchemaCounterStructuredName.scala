package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a counter within a per-job namespace. Counters whose structured
  * names are the same get merged into a single value for the job.
  */
@js.native
trait SchemaCounterStructuredName extends js.Object {
  /**
    * Name of the optimized step being executed by the workers.
    */
  var componentStepName: js.UndefOr[String] = js.native
  /**
    * Name of the stage. An execution step contains multiple component steps.
    */
  var executionStepName: js.UndefOr[String] = js.native
  /**
    * Index of an input collection that&#39;s being read from/written to as a
    * side input. The index identifies a step&#39;s side inputs starting by 1
    * (e.g. the first side input has input_index 1, the third has input_index
    * 3). Side inputs are identified by a pair of (original_step_name,
    * input_index). This field helps uniquely identify them.
    */
  var inputIndex: js.UndefOr[Double] = js.native
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * One of the standard Origins defined above.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * A string containing a more specific namespace of the counter&#39;s
    * origin.
    */
  var originNamespace: js.UndefOr[String] = js.native
  /**
    * The step name requesting an operation, such as GBK. I.e. the ParDo
    * causing a read/write from shuffle to occur, or a read from side inputs.
    */
  var originalRequestingStepName: js.UndefOr[String] = js.native
  /**
    * System generated name of the original step in the user&#39;s graph,
    * before optimization.
    */
  var originalStepName: js.UndefOr[String] = js.native
  /**
    * Portion of this counter, either key or value.
    */
  var portion: js.UndefOr[String] = js.native
  /**
    * ID of a particular worker.
    */
  var workerId: js.UndefOr[String] = js.native
}

object SchemaCounterStructuredName {
  @scala.inline
  def apply(): SchemaCounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredName]
  }
  @scala.inline
  implicit class SchemaCounterStructuredNameOps[Self <: SchemaCounterStructuredName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalRequestingStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequestingStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalRequestingStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRequestingStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withPortion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portion")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(js.undefined)
        ret
    }
  }
  
}

