package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeRotation extends js.Object {
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.native
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var weightCalculationStrategy: js.UndefOr[String] = js.native
}

object CreativeRotation {
  @scala.inline
  def apply(): CreativeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeRotation]
  }
  @scala.inline
  implicit class CreativeRotationOps[Self <: CreativeRotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeAssignments(value: js.Array[CreativeAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeOptimizationConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeOptimizationConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeOptimizationConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeOptimizationConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightCalculationStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightCalculationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightCalculationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightCalculationStrategy")(js.undefined)
        ret
    }
  }
  
}

