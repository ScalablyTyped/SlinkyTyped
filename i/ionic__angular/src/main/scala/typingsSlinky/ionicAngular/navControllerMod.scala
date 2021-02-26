package typingsSlinky.ionicAngular

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularRouter.mod.NavigationExtras
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.angularRouter.mod.UrlSerializer
import typingsSlinky.angularRouter.mod.UrlTree
import typingsSlinky.ionicAngular.anon.Animation
import typingsSlinky.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typingsSlinky.ionicAngular.ionicAngularStrings.back
import typingsSlinky.ionicAngular.ionicAngularStrings.forward
import typingsSlinky.ionicAngular.platformMod.Platform
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navControllerMod {
  
  @JSImport("@ionic/angular/providers/nav-controller", "NavController")
  @js.native
  class NavController protected () extends StObject {
    def this(platform: Platform, location: Location, serializer: UrlSerializer) = this()
    def this(platform: Platform, location: Location, serializer: UrlSerializer, router: Router) = this()
    
    var animated: js.Any = js.native
    
    var animationBuilder: js.Any = js.native
    
    /**
      * Same as [Location](https://angular.io/api/common/Location)'s back() method.
      * It will use the standard `window.history.back()` under the hood, but featuring a `back` animation
      * by default.
      */
    def back(): Unit = js.native
    def back(options: AnimationOptions): Unit = js.native
    
    /**
      * @internal
      */
    def consumeTransition(): Animation = js.native
    
    var direction: js.Any = js.native
    
    var guessAnimation: js.Any = js.native
    
    var guessDirection: js.Any = js.native
    
    var lastNavId: js.Any = js.native
    
    var location: js.Any = js.native
    
    var navigate: js.Any = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('back');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **back** means that all the pages in the stack until the navigated page is found will be popped,
      * and that it will show a "back" animation by default.
      *
      * Navigating back can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="back">Link</a>
      * ```
      */
    def navigateBack(url: String): js.Promise[Boolean] = js.native
    def navigateBack(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[_]): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[_], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling `this.router.navigateByUrl()`, but it's explicit about the **direction** of the transition.
      *
      * Going **forward** means that a new page is going to be pushed to the stack of the outlet (ion-router-outlet),
      * and that it will show a "forward" animation by default.
      *
      * Navigating forward can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="forward">Link</a>
      * ```
      */
    def navigateForward(url: String): js.Promise[Boolean] = js.native
    def navigateForward(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[_]): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[_], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('root');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **root** means that all existing pages in the stack will be removed,
      * and the navigated page will become the single page in the stack.
      *
      * Navigating root can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="root">Link</a>
      * ```
      */
    def navigateRoot(url: String): js.Promise[Boolean] = js.native
    def navigateRoot(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[_]): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[_], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This methods goes back in the context of Ionic's stack navigation.
      *
      * It recursively finds the top active `ion-router-outlet` and calls `pop()`.
      * This is the recommended way to go back when you are using `ion-router-outlet`.
      */
    def pop(): js.Promise[Unit] = js.native
    
    var router: js.Any = js.native
    
    var serializer: js.Any = js.native
    
    /**
      * This methods specifies the direction of the next navigation performed by the Angular router.
      *
      * `setDirection()` does not trigger any transition, it just sets some flags to be consumed by `ion-router-outlet`.
      *
      * It's recommended to use `navigateForward()`, `navigateBack()` and `navigateRoot()` instead of `setDirection()`.
      */
    def setDirection(direction: RouterDirection): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: js.UndefOr[scala.Nothing],
      animationDirection: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def setDirection(direction: RouterDirection, animated: Boolean): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(direction: RouterDirection, animated: js.UndefOr[scala.Nothing], animationDirection: back): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(
      direction: RouterDirection,
      animated: js.UndefOr[scala.Nothing],
      animationDirection: back,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(direction: RouterDirection, animated: Boolean, animationDirection: back): Unit = js.native
    @JSName("setDirection")
    def setDirection_back(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: back,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(direction: RouterDirection, animated: js.UndefOr[scala.Nothing], animationDirection: forward): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(
      direction: RouterDirection,
      animated: js.UndefOr[scala.Nothing],
      animationDirection: forward,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(direction: RouterDirection, animated: Boolean, animationDirection: forward): Unit = js.native
    @JSName("setDirection")
    def setDirection_forward(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: forward,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    
    /**
      * @internal
      */
    def setTopOutlet(outlet: IonRouterOutlet): Unit = js.native
    
    var topOutlet: js.Any = js.native
  }
  
  @js.native
  trait AnimationOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[AnimationBuilder] = js.native
    
    var animationDirection: js.UndefOr[forward | back] = js.native
  }
  object AnimationOptions {
    
    @scala.inline
    def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    @scala.inline
    implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimation(
        value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => typingsSlinky.ionicCore.animationInterfaceMod.Animation
      ): Self = StObject.set(x, "animation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationDirection(value: forward | back): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    }
  }
  
  @js.native
  trait NavigationOptions
    extends NavigationExtras
       with AnimationOptions
  object NavigationOptions {
    
    @scala.inline
    def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
  }
}
