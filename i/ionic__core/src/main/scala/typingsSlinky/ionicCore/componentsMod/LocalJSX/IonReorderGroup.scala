package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonReorderGroup extends js.Object {
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Event that needs to be listened to in order to complete the reorder action. Once the event has been emitted, the `complete()` method then needs to be called in order to finalize the reorder action.
    */
  var onIonItemReorder: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
}

object IonReorderGroup {
  @scala.inline
  def apply(): IonReorderGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonReorderGroup]
  }
  @scala.inline
  implicit class IonReorderGroupOps[Self <: IonReorderGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonItemReorder(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonItemReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonItemReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonItemReorder")(js.undefined)
        ret
    }
  }
  
}

