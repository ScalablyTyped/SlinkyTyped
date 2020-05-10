package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typingsSlinky.awsSdk.healthMod.aggregateValue] = js.native
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typingsSlinky.awsSdk.healthMod.count] = js.native
}

object EventAggregate {
  @scala.inline
  def apply(): EventAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAggregate]
  }
  @scala.inline
  implicit class EventAggregateOps[Self <: EventAggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateValue(value: aggregateValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
  }
  
}

