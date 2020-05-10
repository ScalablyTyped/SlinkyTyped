package typingsSlinky.reactstrap.fadeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FadeProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var baseClass: js.UndefOr[String] = js.native
  var baseClassIn: js.UndefOr[String] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
  var onLeave: js.UndefOr[js.Function0[Unit]] = js.native
  var tag: js.UndefOr[String | ReactComponentClass[_]] = js.native
  var transitionAppear: js.UndefOr[Boolean] = js.native
  var transitionAppearTimeout: js.UndefOr[Double] = js.native
  var transitionEnter: js.UndefOr[Boolean] = js.native
  var transitionEnterTimeout: js.UndefOr[Double] = js.native
  var transitionLeave: js.UndefOr[Boolean] = js.native
  var transitionLeaveTimeout: js.UndefOr[Double] = js.native
}

object FadeProps {
  @scala.inline
  def apply(): FadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeProps]
  }
  @scala.inline
  implicit class FadePropsOps[Self <: FadeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseClassIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClassIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassIn")(js.undefined)
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
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
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
    @scala.inline
    def withTransitionAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionAppearTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppearTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAppearTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppearTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnterTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEnterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionLeaveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeaveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionLeaveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionLeaveTimeout")(js.undefined)
        ret
    }
  }
  
}

