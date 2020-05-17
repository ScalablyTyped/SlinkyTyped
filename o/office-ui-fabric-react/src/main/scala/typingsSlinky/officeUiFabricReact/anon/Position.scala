package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.block
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var display: block = js.native
  var position: js.UndefOr[IPosition] = js.native
}

object Position {
  @scala.inline
  def apply(display: block): Position = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

