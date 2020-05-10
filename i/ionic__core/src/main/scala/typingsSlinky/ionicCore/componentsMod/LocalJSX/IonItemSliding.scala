package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonItemSliding extends js.Object {
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
}

object IonItemSliding {
  @scala.inline
  def apply(): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemSliding]
  }
  @scala.inline
  implicit class IonItemSlidingOps[Self <: IonItemSliding] (val x: Self) extends AnyVal {
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
    def withOnIonDrag(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDrag")(js.undefined)
        ret
    }
  }
  
}

