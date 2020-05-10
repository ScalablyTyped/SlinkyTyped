package typingsSlinky.reactSelect.menuMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.reactSelectStrings.auto
import typingsSlinky.reactSelect.reactSelectStrings.bottom
import typingsSlinky.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementArgs extends js.Object {
  var isFixedPosition: Boolean = js.native
  var maxHeight: Double = js.native
  var menuEl: Ref[_] = js.native
  var minHeight: Double = js.native
  var placement: bottom | top | auto = js.native
  var shouldScroll: Boolean = js.native
}

object PlacementArgs {
  @scala.inline
  def apply(
    isFixedPosition: Boolean,
    maxHeight: Double,
    minHeight: Double,
    placement: bottom | top | auto,
    shouldScroll: Boolean
  ): PlacementArgs = {
    val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementArgs]
  }
  @scala.inline
  implicit class PlacementArgsOps[Self <: PlacementArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFixedPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: bottom | top | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuElRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuElFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMenuEl(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuElNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEl")(null)
        ret
    }
  }
  
}

