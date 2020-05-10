package typingsSlinky.reactVirtualized.esArrowKeyStepperMod

import typingsSlinky.reactVirtualized.esGridMod.RenderedSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProps extends js.Object {
  var scrollToColumn: Double = js.native
  var scrollToRow: Double = js.native
  def onSectionRendered(params: RenderedSection): Unit = js.native
}

object ChildProps {
  @scala.inline
  def apply(onSectionRendered: RenderedSection => Unit, scrollToColumn: Double, scrollToRow: Double): ChildProps = {
    val __obj = js.Dynamic.literal(onSectionRendered = js.Any.fromFunction1(onSectionRendered), scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProps]
  }
  @scala.inline
  implicit class ChildPropsOps[Self <: ChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSectionRendered(value: RenderedSection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollToColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

