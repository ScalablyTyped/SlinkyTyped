package typingsSlinky.leafletPm.mod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditOptions extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.native
  var snapDistance: js.UndefOr[Double] = js.native
  var snappable: js.UndefOr[Boolean] = js.native
}

object EditOptions {
  @scala.inline
  def apply(): EditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOptions]
  }
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withSnappable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnappable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappable")(js.undefined)
        ret
    }
  }
  
}

