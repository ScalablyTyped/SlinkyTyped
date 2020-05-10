package typingsSlinky.pulumiAws.stackSetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetInstanceArgs extends js.Object {
  /**
    * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of input parameters to override from the StackSet for this Instance.
    */
  val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
    */
  val retainStack: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the StackSet.
    */
  val stackSetName: Input[String] = js.native
}

object StackSetInstanceArgs {
  @scala.inline
  def apply(stackSetName: Input[String]): StackSetInstanceArgs = {
    val __obj = js.Dynamic.literal(stackSetName = stackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetInstanceArgs]
  }
  @scala.inline
  implicit class StackSetInstanceArgsOps[Self <: StackSetInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterOverrides(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainStack(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainStack")(js.undefined)
        ret
    }
  }
  
}

