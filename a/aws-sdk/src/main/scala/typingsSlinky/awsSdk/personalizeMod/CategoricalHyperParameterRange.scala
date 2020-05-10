package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalHyperParameterRange extends js.Object {
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.native
}

object CategoricalHyperParameterRange {
  @scala.inline
  def apply(): CategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalHyperParameterRange]
  }
  @scala.inline
  implicit class CategoricalHyperParameterRangeOps[Self <: CategoricalHyperParameterRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ParameterName): Self = {
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
    def withValues(value: CategoricalValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

