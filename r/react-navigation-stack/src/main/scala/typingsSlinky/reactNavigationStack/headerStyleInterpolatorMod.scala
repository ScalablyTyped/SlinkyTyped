package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.anon.Opacity
import typingsSlinky.reactNavigationStack.anon.OpacityAnimatedInterpolation
import typingsSlinky.reactNavigationStack.anon.OpacityAnimatedInterpolationTransformArray
import typingsSlinky.reactNavigationStack.anon.OpacityTransform
import typingsSlinky.reactNavigationStack.anon.OpacityUndefined
import typingsSlinky.reactNavigationStack.anon.Transform
import typingsSlinky.reactNavigationStack.anon.TransformArray
import typingsSlinky.reactNavigationStack.anon.`0`
import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderStyleInterpolator", JSImport.Namespace)
@js.native
object headerStyleInterpolatorMod extends js.Object {
  @js.native
  object default extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Opacity] = js.native
    var forBackgroundWithFade: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Opacity] = js.native
    var forBackgroundWithTranslation: js.Function1[/* props */ SceneInterpolatorProps, OpacityTransform | OpacityUndefined] = js.native
    var forCenter: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityTransform | OpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forLayout: js.Function1[/* props */ SceneInterpolatorProps, Transform | TransformArray | `0`] = js.native
    var forLeft: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forLeftButton: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityTransform | OpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forRight: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
  }
  
}

