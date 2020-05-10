package typingsSlinky.pulumiAws.inputMod.cfg

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorOrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var allRegions: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of source regions being aggregated.
    */
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var roleArn: Input[String] = js.native
}

object ConfigurationAggregatorOrganizationAggregationSource {
  @scala.inline
  def apply(roleArn: Input[String]): ConfigurationAggregatorOrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
  }
  @scala.inline
  implicit class ConfigurationAggregatorOrganizationAggregationSourceOps[Self <: ConfigurationAggregatorOrganizationAggregationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllRegions(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

