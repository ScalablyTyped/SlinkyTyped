package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featurization extends js.Object {
  /**
    * The name of the schema attribute that specifies the data field to be featurized. Only the target field of the TARGET_TIME_SERIES dataset type is supported. For example, for the RETAIL domain, the target is demand, and for the CUSTOM domain, the target is target_value.
    */
  var AttributeName: Name = js.native
  /**
    * An array of one FeaturizationMethod object that specifies the feature transformation method.
    */
  var FeaturizationPipeline: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.FeaturizationPipeline] = js.native
}

object Featurization {
  @scala.inline
  def apply(AttributeName: Name): Featurization = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Featurization]
  }
  @scala.inline
  implicit class FeaturizationOps[Self <: Featurization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturizationPipeline(value: FeaturizationPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationPipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturizationPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationPipeline")(js.undefined)
        ret
    }
  }
  
}

