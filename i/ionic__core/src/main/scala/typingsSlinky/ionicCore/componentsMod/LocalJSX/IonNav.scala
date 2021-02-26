package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonNav extends StObject {
  
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
  implicit class IonNavMutableBuilder[Self <: IonNav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "animation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setOnIonNavDidChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonNavDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonNavDidChangeUndefined: Self = StObject.set(x, "onIonNavDidChange", js.undefined)
    
    @scala.inline
    def setOnIonNavWillChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonNavWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonNavWillChangeUndefined: Self = StObject.set(x, "onIonNavWillChange", js.undefined)
    
    @scala.inline
    def setRoot(value: NavComponent): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootHTMLElement(value: HTMLElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootParams(value: ComponentProps[Null]): Self = StObject.set(x, "rootParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootParamsUndefined: Self = StObject.set(x, "rootParams", js.undefined)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeGestureUndefined: Self = StObject.set(x, "swipeGesture", js.undefined)
  }
}
