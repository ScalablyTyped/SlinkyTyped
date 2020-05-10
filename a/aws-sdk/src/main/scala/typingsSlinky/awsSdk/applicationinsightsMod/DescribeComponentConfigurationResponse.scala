package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentConfigurationResponse extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Monitor] = js.native
  /**
    * The tier of the application component. Supported tiers include DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT 
    */
  var Tier: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Tier] = js.native
}

object DescribeComponentConfigurationResponse {
  @scala.inline
  def apply(): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeComponentConfigurationResponseOps[Self <: DescribeComponentConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

