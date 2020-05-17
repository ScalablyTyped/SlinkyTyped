package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archivedstate extends js.Object {
  var archived_state: Enum = js.native
  var column_id: Required = js.native
  var page: Type = js.native
  var per_page: Type = js.native
}

object Archivedstate {
  @scala.inline
  def apply(archived_state: Enum, column_id: Required, page: Type, per_page: Type): Archivedstate = {
    val __obj = js.Dynamic.literal(archived_state = archived_state.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archivedstate]
  }
  @scala.inline
  implicit class ArchivedstateOps[Self <: Archivedstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived_state(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

