package typingsSlinky.reachRect.mod

import slinky.core.TagMod
import typingsSlinky.reachRect.AnonRect
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ AnonRect, TagMod[Any]]] = js.native
  var observe: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.native
}

object RectProps {
  @scala.inline
  def apply(): RectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectProps]
  }
  @scala.inline
  implicit class RectPropsOps[Self <: RectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* args */ AnonRect => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withObserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* rect */ DOMRect => Unit): Self = {
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
  }
  
}

