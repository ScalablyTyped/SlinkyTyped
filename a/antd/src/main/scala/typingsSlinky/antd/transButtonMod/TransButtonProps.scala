package typingsSlinky.antd.transButtonMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransButtonProps extends HTMLAttributes[HTMLDivElement] {
  var noStyle: js.UndefOr[Boolean] = js.native
  @JSName("onClick")
  var onClick_TransButtonProps: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]], Unit]] = js.native
}

object TransButtonProps {
  @scala.inline
  def apply(): TransButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransButtonProps]
  }
  @scala.inline
  implicit class TransButtonPropsOps[Self <: TransButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

