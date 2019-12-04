package typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod

import slinky.core.TagMod
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      TransitionSpec
    ]
  ] = js.native
  var descriptors: SceneDescriptorMap = js.native
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def render(current: TransitionProps): TagMod[Any] = js.native
  def render(current: TransitionProps, previous: TransitionProps): TagMod[Any] = js.native
}

