package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can only specify the BEGINS_WITH operator, which finds signaling channels whose names begin with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ComparisonOperator] = js.native
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[ChannelName] = js.native
}

object ChannelNameCondition {
  @scala.inline
  def apply(): ChannelNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelNameCondition]
  }
  @scala.inline
  implicit class ChannelNameConditionOps[Self <: ChannelNameCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonValue(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonValue")(js.undefined)
        ret
    }
  }
  
}

