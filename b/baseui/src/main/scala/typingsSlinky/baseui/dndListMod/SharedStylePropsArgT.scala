package typingsSlinky.baseui.dndListMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArgT extends js.Object {
  @JSName("$isDragged")
  var $isDragged: Boolean = js.native
  @JSName("$isRemovable")
  var $isRemovable: Boolean = js.native
  @JSName("$isRemovableByMove")
  var $isRemovableByMove: Boolean = js.native
  @JSName("$isSelected")
  var $isSelected: Boolean = js.native
  @JSName("$value")
  var $value: TagMod[Any] = js.native
}

object SharedStylePropsArgT {
  @scala.inline
  def apply($isDragged: Boolean, $isRemovable: Boolean, $isRemovableByMove: Boolean, $isSelected: Boolean): SharedStylePropsArgT = {
    val __obj = js.Dynamic.literal($isDragged = $isDragged.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgT]
  }
  @scala.inline
  implicit class SharedStylePropsArgTOps[Self <: SharedStylePropsArgT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$isDragged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isRemovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isRemovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isRemovableByMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isRemovableByMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$value(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$value")(js.undefined)
        ret
    }
  }
  
}

