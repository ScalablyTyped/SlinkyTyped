package typingsSlinky.reactScrollbarSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarSizeProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.native
}

object ScrollbarSizeProps {
  @scala.inline
  def apply(): ScrollbarSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarSizeProps]
  }
  @scala.inline
  implicit class ScrollbarSizePropsOps[Self <: ScrollbarSizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: /* measurement */ Measurement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* measurement */ Measurement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
  }
  
}

