package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturizationMethod extends js.Object {
  /**
    * The name of the method. The "filling" method is the only supported method.
    */
  var FeaturizationMethodName: typingsSlinky.awsSdk.forecastserviceMod.FeaturizationMethodName = js.native
  /**
    * The method parameters (key-value pairs). Specify these parameters to override the default values. The following list shows the parameters and their valid values. Bold signifies the default value.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number)    backfill: zero, nan   
    */
  var FeaturizationMethodParameters: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.FeaturizationMethodParameters] = js.native
}

object FeaturizationMethod {
  @scala.inline
  def apply(FeaturizationMethodName: FeaturizationMethodName): FeaturizationMethod = {
    val __obj = js.Dynamic.literal(FeaturizationMethodName = FeaturizationMethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationMethod]
  }
  @scala.inline
  implicit class FeaturizationMethodOps[Self <: FeaturizationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeaturizationMethodName(value: FeaturizationMethodName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationMethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturizationMethodParameters(value: FeaturizationMethodParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationMethodParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturizationMethodParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationMethodParameters")(js.undefined)
        ret
    }
  }
  
}

