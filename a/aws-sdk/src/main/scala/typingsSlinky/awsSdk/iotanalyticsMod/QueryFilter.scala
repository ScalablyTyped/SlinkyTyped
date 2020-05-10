package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFilter extends js.Object {
  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  var deltaTime: js.UndefOr[DeltaTime] = js.native
}

object QueryFilter {
  @scala.inline
  def apply(): QueryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilter]
  }
  @scala.inline
  implicit class QueryFilterOps[Self <: QueryFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaTime(value: DeltaTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTime")(js.undefined)
        ret
    }
  }
  
}

