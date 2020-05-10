package typingsSlinky.reactAlbus.mod

import slinky.core.TagMod
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardProps extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var history: js.UndefOr[History[LocationState]] = js.native
  var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, TagMod[Any]]] = js.native
}

object WizardProps {
  @scala.inline
  def apply(): WizardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardProps]
  }
  @scala.inline
  implicit class WizardPropsOps[Self <: WizardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: History[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: /* wizard */ WizardContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* wizard */ WizardContext => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

