package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregator extends js.Object {
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorArn] = js.native
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName] = js.native
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
}

object ConfigurationAggregator {
  @scala.inline
  def apply(): ConfigurationAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregator]
  }
  @scala.inline
  implicit class ConfigurationAggregatorOps[Self <: ConfigurationAggregator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConfigurationAggregatorArn(value: ConfigurationAggregatorArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationAggregatorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationAggregatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
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
  }
  
}

