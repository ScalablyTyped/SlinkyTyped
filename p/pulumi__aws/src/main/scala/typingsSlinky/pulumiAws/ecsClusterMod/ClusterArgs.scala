package typingsSlinky.pulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typingsSlinky.pulumiAws.inputMod.ecs.ClusterSetting
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterArgs extends js.Object {
  /**
    * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
    */
  val capacityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
    */
  val defaultCapacityProviderStrategies: js.UndefOr[Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]]] = js.native
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
    */
  val settings: js.UndefOr[Input[js.Array[Input[ClusterSetting]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterArgs {
  @scala.inline
  def apply(): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterArgs]
  }
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityProviders(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCapacityProviderStrategies(value: Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCapacityProviderStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCapacityProviderStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCapacityProviderStrategies")(js.undefined)
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
    def withSettings(value: Input[js.Array[Input[ClusterSetting]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
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

