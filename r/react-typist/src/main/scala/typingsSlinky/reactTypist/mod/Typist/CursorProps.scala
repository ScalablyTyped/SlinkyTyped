package typingsSlinky.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorProps extends js.Object {
  var blink: js.UndefOr[Boolean] = js.native
  var element: js.UndefOr[String] = js.native
  var hideWhenDone: js.UndefOr[Boolean] = js.native
  var hideWhenDoneDelay: js.UndefOr[Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object CursorProps {
  @scala.inline
  def apply(): CursorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorProps]
  }
  @scala.inline
  implicit class CursorPropsOps[Self <: CursorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blink")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withHideWhenDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWhenDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenDone")(js.undefined)
        ret
    }
    @scala.inline
    def withHideWhenDoneDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenDoneDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWhenDoneDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenDoneDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

