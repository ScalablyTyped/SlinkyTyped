package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenu extends js.Object {
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[String] = js.native
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: js.UndefOr[Double] = js.native
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.native
  /**
    * Emitted when the menu is closed.
    */
  var onIonDidClose: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the menu is open.
    */
  var onIonDidOpen: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the menu is about to be closed.
    */
  var onIonWillClose: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the menu is about to be opened.
    */
  var onIonWillOpen: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Which side of the view the menu should be placed.
    */
  var side: js.UndefOr[Side] = js.native
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object IonMenu {
  @scala.inline
  def apply(): IonMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenu]
  }
  @scala.inline
  implicit class IonMenuOps[Self <: IonMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(js.undefined)
        ret
    }
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
    def withMaxEdgeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEdgeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEdgeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEdgeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonDidClose(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDidClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonDidClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDidClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonDidOpen(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDidOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonDidOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonDidOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonWillClose(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonWillClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonWillClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonWillClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonWillOpen(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonWillOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonWillOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonWillOpen")(js.undefined)
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
    @scala.inline
    def withSwipeGesture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

