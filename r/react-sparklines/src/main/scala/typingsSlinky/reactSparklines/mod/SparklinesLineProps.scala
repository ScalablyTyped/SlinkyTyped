package typingsSlinky.reactSparklines.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSparklines.reactSparklinesStrings.click
import typingsSlinky.reactSparklines.reactSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklinesLineProps extends js.Object {
  var color: js.UndefOr[String] = js.native
  var onMouseMove: js.UndefOr[
    js.Function3[/* event */ enter | click, /* value */ Double, /* point */ Point, Unit]
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SparklinesLineProps {
  @scala.inline
  def apply(): SparklinesLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesLineProps]
  }
  @scala.inline
  implicit class SparklinesLinePropsOps[Self <: SparklinesLineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

