package typingsSlinky.jqueryBootstrapWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardOptions extends js.Object {
  var firstSelector: js.UndefOr[String] = js.native
  var lastSelector: js.UndefOr[String] = js.native
  var nextSelector: js.UndefOr[String] = js.native
  var onFirst: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double, Boolean]
  ] = js.native
  var onInit: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Unit]
  ] = js.native
  var onLast: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double, Boolean]
  ] = js.native
  var onNext: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Boolean]
  ] = js.native
  var onPrevious: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double, Boolean]
  ] = js.native
  var onShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Unit]
  ] = js.native
  var onTabClick: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.native
  var onTabShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.native
  var previousSelector: js.UndefOr[String] = js.native
  var tabClass: js.UndefOr[String] = js.native
}

object WizardOptions {
  @scala.inline
  def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  @scala.inline
  implicit class WizardOptionsOps[Self <: WizardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFirst(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirst")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLast(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLast")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLast")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevious(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevious")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabClick(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTabClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabShow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTabShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withTabClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClass")(js.undefined)
        ret
    }
  }
  
}

