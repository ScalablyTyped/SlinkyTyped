package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnId extends js.Object {
  var columnId: js.UndefOr[Double] = js.native
  var tableIndex: js.UndefOr[Double] = js.native
}

object AnonColumnId {
  @scala.inline
  def apply(): AnonColumnId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColumnId]
  }
  @scala.inline
  implicit class AnonColumnIdOps[Self <: AnonColumnId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableIndex")(js.undefined)
        ret
    }
  }
  
}

