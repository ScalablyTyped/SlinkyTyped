package typingsSlinky.reactstrap.collapseMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactstrap.anon.Hide
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var classNames: js.UndefOr[String] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var delay: js.UndefOr[Hide] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var navbar: js.UndefOr[Boolean] = js.native
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.native
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.native
  var onExit: js.UndefOr[js.Function0[Unit]] = js.native
  var onExited: js.UndefOr[js.Function0[Unit]] = js.native
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  var tag: js.UndefOr[String | ReactComponentClass[_]] = js.native
}

object CollapseProps {
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCssModule(value: CSSModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withNavbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntering(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExited(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExiting(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpened(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

