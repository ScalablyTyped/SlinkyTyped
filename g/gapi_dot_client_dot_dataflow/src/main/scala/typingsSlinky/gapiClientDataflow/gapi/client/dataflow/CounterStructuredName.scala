package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterStructuredName extends js.Object {
  /** Name of the optimized step being executed by the workers. */
  var componentStepName: js.UndefOr[String] = js.native
  /** Name of the stage. An execution step contains multiple component steps. */
  var executionStepName: js.UndefOr[String] = js.native
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /** One of the standard Origins defined above. */
  var origin: js.UndefOr[String] = js.native
  /** A string containing a more specific namespace of the counter's origin. */
  var originNamespace: js.UndefOr[String] = js.native
  /** The GroupByKey step name from the original graph. */
  var originalShuffleStepName: js.UndefOr[String] = js.native
  /**
    * System generated name of the original step in the user's graph, before
    * optimization.
    */
  var originalStepName: js.UndefOr[String] = js.native
  /** Portion of this counter, either key or value. */
  var portion: js.UndefOr[String] = js.native
  /**
    * ID of a side input being read from/written to. Side inputs are identified
    * by a pair of (reader, input_index). The reader is usually equal to the
    * original name, but it may be different, if a ParDo emits it's Iterator /
    * Map side input object.
    */
  var sideInput: js.UndefOr[SideInputId] = js.native
  /** ID of a particular worker. */
  var workerId: js.UndefOr[String] = js.native
}

object CounterStructuredName {
  @scala.inline
  def apply(): CounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStructuredName]
  }
  @scala.inline
  implicit class CounterStructuredNameOps[Self <: CounterStructuredName] (val x: Self) extends AnyVal {
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
    def withOriginalShuffleStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalShuffleStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalShuffleStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalShuffleStepName")(js.undefined)
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
    def withSideInput(value: SideInputId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInput")(js.undefined)
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

