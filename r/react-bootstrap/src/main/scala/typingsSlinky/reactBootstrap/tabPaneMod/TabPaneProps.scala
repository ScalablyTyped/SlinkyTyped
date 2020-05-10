package typingsSlinky.reactBootstrap.tabPaneMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabPaneProps
  extends AllHTMLAttributes[TabPane]
     with TransitionCallbacks
     with ClassAttributes[TabPane] {
  var animation: js.UndefOr[Boolean | ReactComponentClass[_]] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var eventKey: js.UndefOr[js.Any] = js.native
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object TabPaneProps {
  @scala.inline
  def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  @scala.inline
  implicit class TabPanePropsOps[Self <: TabPaneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(js.undefined)
        ret
    }
  }
  
}

