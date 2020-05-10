package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOConfig extends js.Object {
  /**
    * The hyperparameters and their allowable ranges.
    */
  var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.native
  /**
    * The metric to optimize during HPO.
    */
  var hpoObjective: js.UndefOr[HPOObjective] = js.native
  /**
    * Describes the resource configuration for HPO.
    */
  var hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.native
}

object HPOConfig {
  @scala.inline
  def apply(): HPOConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOConfig]
  }
  @scala.inline
  implicit class HPOConfigOps[Self <: HPOConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmHyperParameterRanges(value: HyperParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withHpoObjective(value: HPOObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHpoObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withHpoResourceConfig(value: HPOResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHpoResourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoResourceConfig")(js.undefined)
        ret
    }
  }
  
}

