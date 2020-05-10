package typingsSlinky.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: String = js.native
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: String = js.native
}

object UsagePlanApiStage {
  @scala.inline
  def apply(apiId: String, stage: String): UsagePlanApiStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanApiStage]
  }
  @scala.inline
  implicit class UsagePlanApiStageOps[Self <: UsagePlanApiStage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

