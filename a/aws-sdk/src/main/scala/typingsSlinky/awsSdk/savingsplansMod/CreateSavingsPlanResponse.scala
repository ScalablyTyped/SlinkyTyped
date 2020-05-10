package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSavingsPlanResponse extends js.Object {
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
}

object CreateSavingsPlanResponse {
  @scala.inline
  def apply(): CreateSavingsPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSavingsPlanResponse]
  }
  @scala.inline
  implicit class CreateSavingsPlanResponseOps[Self <: CreateSavingsPlanResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavingsPlanId(value: SavingsPlanId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(js.undefined)
        ret
    }
  }
  
}

