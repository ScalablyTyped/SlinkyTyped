package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.anon.ContainerStyleDark
import typingsSlinky.reactNavigationStack.anon.ContainerStyleLight
import typingsSlinky.reactNavigationStack.anon.FnCall
import typingsSlinky.reactNavigationStack.anon.ScreenInterpolator
import typingsSlinky.reactNavigationStack.anon.TransitionSpec
import typingsSlinky.reactNavigationStack.typesMod.TransitionConfig
import typingsSlinky.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewTransitionConfigs", JSImport.Namespace)
@js.native
object stackViewTransitionConfigsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var FadeInFromBottomAndroid: ScreenInterpolator = js.native
    var FadeOutToBottomAndroid: ScreenInterpolator = js.native
    var ModalSlideFromBottomIOS: ContainerStyleLight = js.native
    var NoAnimation: TransitionSpec = js.native
    var SlideFromRightIOS: ContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: FnCall = js.native
  }
  
}

