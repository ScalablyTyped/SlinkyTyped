package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRange extends js.Object {
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CategoricalParameterRangeSpecification] = js.native
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContinuousParameterRangeSpecification] = js.native
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.IntegerParameterRangeSpecification] = js.native
}

object ParameterRange {
  @scala.inline
  def apply(): ParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRange]
  }
  @scala.inline
  implicit class ParameterRangeOps[Self <: ParameterRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalParameterRangeSpecification(value: CategoricalParameterRangeSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoricalParameterRangeSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalParameterRangeSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoricalParameterRangeSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousParameterRangeSpecification(value: ContinuousParameterRangeSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousParameterRangeSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousParameterRangeSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousParameterRangeSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerParameterRangeSpecification(value: IntegerParameterRangeSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameterRangeSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerParameterRangeSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameterRangeSpecification")(js.undefined)
        ret
    }
  }
  
}

