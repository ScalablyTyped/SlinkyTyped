package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLogPatternRequest extends js.Object {
  /**
    * The log pattern.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.native
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName = js.native
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName = js.native
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object UpdateLogPatternRequest {
  @scala.inline
  def apply(
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    ResourceGroupName: ResourceGroupName
  ): UpdateLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLogPatternRequest]
  }
  @scala.inline
  implicit class UpdateLogPatternRequestOps[Self <: UpdateLogPatternRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPattern(value: LogPatternRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: LogPatternRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(js.undefined)
        ret
    }
  }
  
}

