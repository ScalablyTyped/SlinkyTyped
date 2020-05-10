package typingsSlinky.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulContainerState extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.native
  var highlightedIndex: Double = js.native
  var isFocused: Boolean = js.native
}

object StatefulContainerState {
  @scala.inline
  def apply(highlightedIndex: Double, isFocused: Boolean): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerState]
  }
  @scala.inline
  implicit class StatefulContainerStateOps[Self <: StatefulContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivedescendantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivedescendantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(js.undefined)
        ret
    }
  }
  
}

