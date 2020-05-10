package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyRequestItem extends js.Object {
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaFreeBusyRequestItem {
  @scala.inline
  def apply(): SchemaFreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequestItem]
  }
  @scala.inline
  implicit class SchemaFreeBusyRequestItemOps[Self <: SchemaFreeBusyRequestItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

