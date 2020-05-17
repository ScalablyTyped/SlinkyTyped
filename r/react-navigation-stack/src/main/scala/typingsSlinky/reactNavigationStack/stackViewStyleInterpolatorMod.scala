package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.anon.Opacity
import typingsSlinky.reactNavigationStack.anon.OpacityAnimatedInterpolation
import typingsSlinky.reactNavigationStack.anon.OpacityNumber
import typingsSlinky.reactNavigationStack.anon.OpacityTransform
import typingsSlinky.reactNavigationStack.anon.OpacityUndefinedTransformArray
import typingsSlinky.reactNavigationStack.anon.OverlayOpacity
import typingsSlinky.reactNavigationStack.anon.ShadowOpacity
import typingsSlinky.reactNavigationStack.anon.`1`
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
        OpacityNumber | Opacity | OpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OpacityTransform | `1`] = js.native
    var forFadeToBottomAndroid: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OpacityTransform | `1`] = js.native
    var forHorizontal: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OverlayOpacity | ShadowOpacity] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray
      ] = js.native
  }
  
}

