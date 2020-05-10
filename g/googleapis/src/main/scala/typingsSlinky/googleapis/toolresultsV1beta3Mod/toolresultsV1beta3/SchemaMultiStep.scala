package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details when multiple steps are run with the same configuration as a group.
  */
@js.native
trait SchemaMultiStep extends js.Object {
  /**
    * Unique int given to each step. Ranges from 0(inclusive) to total number
    * of steps(exclusive). The primary step is 0.
    */
  var multistepNumber: js.UndefOr[Double] = js.native
  /**
    * Present if it is a primary (original) step.
    */
  var primaryStep: js.UndefOr[SchemaPrimaryStep] = js.native
  /**
    * Step Id of the primary (original) step, which might be this step.
    */
  var primaryStepId: js.UndefOr[String] = js.native
}

object SchemaMultiStep {
  @scala.inline
  def apply(): SchemaMultiStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiStep]
  }
  @scala.inline
  implicit class SchemaMultiStepOps[Self <: SchemaMultiStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultistepNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multistepNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultistepNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multistepNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryStep(value: SchemaPrimaryStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryStep")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryStepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryStepId")(js.undefined)
        ret
    }
  }
  
}

