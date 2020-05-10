package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComponentConfigurationRequest extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration. For more information about the JSON format, see Working with JSON. You can send a request to DescribeComponentConfigurationRecommendation to see the recommended configuration for a component. For the complete format of the component configuration file, see Component Configuration.
    */
  var ComponentConfiguration: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
  /**
    * The name of the component.
    */
  var ComponentName: typingsSlinky.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Monitor] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB, DOT_NET_CORE, SQL_SERVER, and DEFAULT.
    */
  var Tier: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Tier] = js.native
}

object UpdateComponentConfigurationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateComponentConfigurationRequestOps[Self <: UpdateComponentConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: ComponentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentConfiguration(value: ComponentConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitor(value: Monitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitor")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: Tier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
  }
  
}

