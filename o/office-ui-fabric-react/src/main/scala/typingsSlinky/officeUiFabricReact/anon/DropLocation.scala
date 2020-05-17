package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropLocation extends js.Object {
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.native
}

object DropLocation {
  @scala.inline
  def apply(): DropLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropLocation]
  }
  @scala.inline
  implicit class DropLocationOps[Self <: DropLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropLocation(value: ColumnDragEndLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(js.undefined)
        ret
    }
  }
  
}

