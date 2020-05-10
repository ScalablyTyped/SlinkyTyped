package typingsSlinky.pulumiAws.resourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupState extends js.Object {
  /**
    * The resource group ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of tags that are used to select the EC2 instances to be included in an [Amazon Inspector assessment target](https://www.terraform.io/docs/providers/aws/r/inspector_assessment_target.html).
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResourceGroupState {
  @scala.inline
  def apply(): ResourceGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupState]
  }
  @scala.inline
  implicit class ResourceGroupStateOps[Self <: ResourceGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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

