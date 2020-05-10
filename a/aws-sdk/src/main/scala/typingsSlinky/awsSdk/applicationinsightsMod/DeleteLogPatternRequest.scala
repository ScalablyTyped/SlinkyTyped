package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLogPatternRequest extends js.Object {
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName = js.native
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object DeleteLogPatternRequest {
  @scala.inline
  def apply(
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    ResourceGroupName: ResourceGroupName
  ): DeleteLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogPatternRequest]
  }
  @scala.inline
  implicit class DeleteLogPatternRequestOps[Self <: DeleteLogPatternRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatternName(value: LogPatternName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternSetName(value: LogPatternSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

