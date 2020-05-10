package typingsSlinky.agGrid.gridOptionsMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.agGrid.gridCellMod.GridCellDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToNextCellParams extends js.Object {
  var event: KeyboardEvent = js.native
  var key: Double = js.native
  var nextCellDef: GridCellDef = js.native
  var previousCellDef: GridCellDef = js.native
}

object NavigateToNextCellParams {
  @scala.inline
  def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToNextCellParams]
  }
  @scala.inline
  implicit class NavigateToNextCellParamsOps[Self <: NavigateToNextCellParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextCellDef(value: GridCellDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextCellDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCellDef(value: GridCellDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCellDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

