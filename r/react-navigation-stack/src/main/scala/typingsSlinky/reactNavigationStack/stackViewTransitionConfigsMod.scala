package typingsSlinky.reactNavigationStack

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
    var FadeInFromBottomAndroid: AnonScreenInterpolator = js.native
    var FadeOutToBottomAndroid: AnonScreenInterpolator = js.native
    var ModalSlideFromBottomIOS: AnonContainerStyleLight = js.native
    var NoAnimation: AnonTransitionSpec = js.native
    var SlideFromRightIOS: AnonContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: FnCall = js.native
  }
  
}

