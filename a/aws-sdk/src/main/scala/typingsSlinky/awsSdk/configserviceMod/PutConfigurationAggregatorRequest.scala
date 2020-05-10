package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationAggregatorRequest extends js.Object {
  /**
    * A list of AccountAggregationSource object. 
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutConfigurationAggregatorRequest {
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
  @scala.inline
  implicit class PutConfigurationAggregatorRequestOps[Self <: PutConfigurationAggregatorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountAggregationSources(value: AccountAggregationSourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAggregationSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAggregationSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAggregationSources")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationAggregationSource(value: OrganizationAggregationSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationAggregationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationAggregationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationAggregationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

