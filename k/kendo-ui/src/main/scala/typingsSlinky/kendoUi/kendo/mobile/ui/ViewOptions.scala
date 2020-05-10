package typingsSlinky.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions extends js.Object {
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, Unit]] = js.native
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, Unit]] = js.native
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, Unit]] = js.native
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, Unit]] = js.native
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, Unit]] = js.native
  var model: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var reload: js.UndefOr[Boolean] = js.native
  var scroller: js.UndefOr[js.Any] = js.native
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, Unit]] = js.native
  var stretch: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, Unit]] = js.native
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, Unit]] = js.native
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
}

object ViewOptions {
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterShow(value: /* e */ ViewAfterShowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHide(value: /* e */ ViewBeforeHideEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: /* e */ ViewBeforeShowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* e */ ViewHideEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* e */ ViewInitEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
    @scala.inline
    def withScroller(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* e */ ViewShowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnd(value: /* e */ ViewTransitionEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionStart(value: /* e */ ViewTransitionStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

