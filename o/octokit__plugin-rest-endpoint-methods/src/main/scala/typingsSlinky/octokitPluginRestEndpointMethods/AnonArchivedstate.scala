package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArchivedstate extends js.Object {
  var archived_state: AnonEnum = js.native
  var column_id: AnonRequired = js.native
  var page: AnonType = js.native
  var per_page: AnonType = js.native
}

object AnonArchivedstate {
  @scala.inline
  def apply(archived_state: AnonEnum, column_id: AnonRequired, page: AnonType, per_page: AnonType): AnonArchivedstate = {
    val __obj = js.Dynamic.literal(archived_state = archived_state.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchivedstate]
  }
  @scala.inline
  implicit class AnonArchivedstateOps[Self <: AnonArchivedstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived_state(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

