package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonBackdrop extends js.Object {
  /**
    * Emitted when the backdrop is tapped.
    */
  var onIonBackdropTap: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IonBackdrop {
  @scala.inline
  def apply(): IonBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonBackdrop]
  }
  @scala.inline
  implicit class IonBackdropOps[Self <: IonBackdrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnIonBackdropTap(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonBackdropTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonBackdropTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonBackdropTap")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withTappable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTappable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappable")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

