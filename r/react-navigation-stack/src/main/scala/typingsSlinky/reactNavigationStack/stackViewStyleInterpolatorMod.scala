package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewStyleInterpolator", JSImport.Namespace)
@js.native
object stackViewStyleInterpolatorMod extends js.Object {
  @js.native
  object default extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacity | AnonOpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | Anon1
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | Anon1
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOverlayOpacity | AnonShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray
      ] = js.native
  }
  
}

