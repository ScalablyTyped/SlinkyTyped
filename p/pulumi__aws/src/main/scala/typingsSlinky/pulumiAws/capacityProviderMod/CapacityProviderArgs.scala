package typingsSlinky.pulumiAws.capacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderArgs extends js.Object {
  /**
    * Nested argument defining the provider for the ECS auto scaling group. Defined below.
    */
  val autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider] = js.native
  /**
    * The name of the capacity provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object CapacityProviderArgs {
  @scala.inline
  def apply(autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider]): CapacityProviderArgs = {
    val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderArgs]
  }
  @scala.inline
  implicit class CapacityProviderArgsOps[Self <: CapacityProviderArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupProvider(value: Input[CapacityProviderAutoScalingGroupProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

