package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores rollup test status of multiple steps that were run as a group and
  * outcome of each individual step.
  */
@js.native
trait SchemaPrimaryStep extends js.Object {
  /**
    * Step Id and outcome of each individual step.
    */
  var individualOutcome: js.UndefOr[js.Array[SchemaIndividualOutcome]] = js.native
  /**
    * Rollup test status of multiple steps that were run with the same
    * configuration as a group.
    */
  var rollUp: js.UndefOr[String] = js.native
}

object SchemaPrimaryStep {
  @scala.inline
  def apply(): SchemaPrimaryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrimaryStep]
  }
  @scala.inline
  implicit class SchemaPrimaryStepOps[Self <: SchemaPrimaryStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndividualOutcome(value: js.Array[SchemaIndividualOutcome]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualOutcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividualOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualOutcome")(js.undefined)
        ret
    }
    @scala.inline
    def withRollUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollUp")(js.undefined)
        ret
    }
  }
  
}

