package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonItemOptions extends js.Object {
  /**
    * Emitted when the item has been fully swiped.
    */
  var onIonSwipe: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: js.UndefOr[Side] = js.native
}

object IonItemOptions {
  @scala.inline
  def apply(): IonItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemOptions]
  }
  @scala.inline
  implicit class IonItemOptionsOps[Self <: IonItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnIonSwipe(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSwipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
  }
  
}

