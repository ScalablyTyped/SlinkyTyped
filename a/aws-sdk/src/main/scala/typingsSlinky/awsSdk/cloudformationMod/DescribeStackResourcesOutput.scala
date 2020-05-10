package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourcesOutput extends js.Object {
  /**
    * A list of StackResource structures.
    */
  var StackResources: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackResources] = js.native
}

object DescribeStackResourcesOutput {
  @scala.inline
  def apply(): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
  @scala.inline
  implicit class DescribeStackResourcesOutputOps[Self <: DescribeStackResourcesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackResources(value: StackResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResources")(js.undefined)
        ret
    }
  }
  
}

