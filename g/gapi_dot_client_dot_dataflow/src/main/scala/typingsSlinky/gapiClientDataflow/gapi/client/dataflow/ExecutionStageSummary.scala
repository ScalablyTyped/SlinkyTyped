package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionStageSummary extends js.Object {
  /** Collections produced and consumed by component transforms of this stage. */
  var componentSource: js.UndefOr[js.Array[ComponentSource]] = js.native
  /** Transforms that comprise this execution stage. */
  var componentTransform: js.UndefOr[js.Array[ComponentTransform]] = js.native
  /** Dataflow service generated id for this stage. */
  var id: js.UndefOr[String] = js.native
  /** Input sources for this stage. */
  var inputSource: js.UndefOr[js.Array[StageSource]] = js.native
  /** Type of tranform this stage is executing. */
  var kind: js.UndefOr[String] = js.native
  /** Dataflow service generated name for this stage. */
  var name: js.UndefOr[String] = js.native
  /** Output sources for this stage. */
  var outputSource: js.UndefOr[js.Array[StageSource]] = js.native
}

object ExecutionStageSummary {
  @scala.inline
  def apply(): ExecutionStageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageSummary]
  }
  @scala.inline
  implicit class ExecutionStageSummaryOps[Self <: ExecutionStageSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentSource(value: js.Array[ComponentSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentTransform(value: js.Array[ComponentTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSource(value: js.Array[StageSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withOutputSource(value: js.Array[StageSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSource")(js.undefined)
        ret
    }
  }
  
}

