package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityAggregatesResponse extends js.Object {
  /**
    * The number of entities that are affected by each of the specified events.
    */
  var entityAggregates: js.UndefOr[EntityAggregateList] = js.native
}

object DescribeEntityAggregatesResponse {
  @scala.inline
  def apply(): DescribeEntityAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityAggregatesResponse]
  }
  @scala.inline
  implicit class DescribeEntityAggregatesResponseOps[Self <: DescribeEntityAggregatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityAggregates(value: EntityAggregateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityAggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityAggregates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityAggregates")(js.undefined)
        ret
    }
  }
  
}

