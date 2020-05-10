package typingsSlinky.pulumiAws.agentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentArgs extends js.Object {
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DataSync Agent.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AgentArgs {
  @scala.inline
  def apply(): AgentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentArgs]
  }
  @scala.inline
  implicit class AgentArgsOps[Self <: AgentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
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

