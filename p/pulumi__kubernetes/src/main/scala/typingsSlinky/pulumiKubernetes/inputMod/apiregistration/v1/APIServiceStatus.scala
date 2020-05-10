package typingsSlinky.pulumiKubernetes.inputMod.apiregistration.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceStatus contains derived information about an API server
  */
@js.native
trait APIServiceStatus extends js.Object {
  /**
    * Current service state of apiService.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[APIServiceCondition]]]] = js.native
}

object APIServiceStatus {
  @scala.inline
  def apply(): APIServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIServiceStatus]
  }
  @scala.inline
  implicit class APIServiceStatusOps[Self <: APIServiceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: Input[js.Array[Input[APIServiceCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
  }
  
}

