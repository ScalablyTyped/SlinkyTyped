package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonTabs extends js.Object {
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
}

object IonTabs {
  @scala.inline
  def apply(): IonTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTabs]
  }
  @scala.inline
  implicit class IonTabsOps[Self <: IonTabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnIonTabsDidChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonTabsDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonTabsDidChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonTabsWillChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonTabsWillChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonTabsWillChange")(js.undefined)
        ret
    }
  }
  
}

