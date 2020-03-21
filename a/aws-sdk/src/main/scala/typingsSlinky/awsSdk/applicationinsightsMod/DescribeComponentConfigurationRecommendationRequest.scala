package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentConfigurationRecommendationRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typingsSlinky.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The tier of the application component. Supported tiers include DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT.
    */
  var Tier: typingsSlinky.awsSdk.applicationinsightsMod.Tier = js.native
}

object DescribeComponentConfigurationRecommendationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, Tier: Tier): DescribeComponentConfigurationRecommendationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any], Tier = Tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationRequest]
  }
}

