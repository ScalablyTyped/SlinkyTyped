package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TunedHPOParams extends js.Object {
  /**
    * A list of the hyperparameter values of the best performing model.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
}

object TunedHPOParams {
  @scala.inline
  def apply(): TunedHPOParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunedHPOParams]
  }
  @scala.inline
  implicit class TunedHPOParamsOps[Self <: TunedHPOParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameters")(js.undefined)
        ret
    }
  }
  
}

