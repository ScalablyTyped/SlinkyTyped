package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonNav extends js.Object {
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Event fired when the nav has changed components
    */
  var onIonNavDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Event fired when the nav will change components
    */
  var onIonNavWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.native
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.native
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
}

object IonNav {
  @scala.inline
  def apply(): IonNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonNav]
  }
  @scala.inline
  implicit class IonNavOps[Self <: IonNav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonNavDidChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonNavDidChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonNavDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonNavDidChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonNavWillChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonNavWillChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonNavWillChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonNavWillChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRootHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: NavComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withRootParams(value: ComponentProps[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootParams")(js.undefined)
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
  }
  
}

