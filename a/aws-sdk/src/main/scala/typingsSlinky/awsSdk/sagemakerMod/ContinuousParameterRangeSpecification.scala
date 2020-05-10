package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousParameterRangeSpecification extends js.Object {
  /**
    * The maximum floating-point value allowed.
    */
  var MaxValue: ParameterValue = js.native
  /**
    * The minimum floating-point value allowed.
    */
  var MinValue: ParameterValue = js.native
}

object ContinuousParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRangeSpecification]
  }
  @scala.inline
  implicit class ContinuousParameterRangeSpecificationOps[Self <: ContinuousParameterRangeSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

