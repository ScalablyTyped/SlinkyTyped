package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Step Id and outcome of each individual step that was run as a group with
  * other steps with the same configuration.
  */
@js.native
trait SchemaIndividualOutcome extends js.Object {
  var outcomeSummary: js.UndefOr[String] = js.native
  var stepId: js.UndefOr[String] = js.native
}

object SchemaIndividualOutcome {
  @scala.inline
  def apply(): SchemaIndividualOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndividualOutcome]
  }
  @scala.inline
  implicit class SchemaIndividualOutcomeOps[Self <: SchemaIndividualOutcome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutcomeSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomeSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(js.undefined)
        ret
    }
  }
  
}

