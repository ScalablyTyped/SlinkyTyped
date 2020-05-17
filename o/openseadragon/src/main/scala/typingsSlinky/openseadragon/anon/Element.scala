package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.mod.ButtonEvent
import typingsSlinky.openseadragon.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var element: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
  var fadeDelay: js.UndefOr[Double] = js.native
  var fadeLength: js.UndefOr[Double] = js.native
  var onBlur: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onClick: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onEnter: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onExit: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onFocus: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onPress: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onRelease: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var srcDown: js.UndefOr[String] = js.native
  var srcGroup: js.UndefOr[String] = js.native
  var srcHover: js.UndefOr[String] = js.native
  var srcRest: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
}

object Element {
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: org.scalajs.dom.raw.Element): Self = {
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
    def withFadeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: ButtonEvent => Unit): Self = {
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
    @scala.inline
    def withOnEnter(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: ButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcRest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcRest")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

