package typingsSlinky.reactNativeAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typingsSlinky.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = typingsSlinky.reactNativeAnimatable.mod._Easing | typingsSlinky.reactNativeAnimatable.mod.EasingFunction
  
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  
  type GetPropertyType[B, K /* <: /* keyof B */ java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  
  type Image = typingsSlinky.reactNativeAnimatable.mod.AnimatableComponent[
    typingsSlinky.reactNative.mod.ImageProperties, 
    typingsSlinky.reactNative.mod.ImageStyle
  ]
  
  type Text = typingsSlinky.reactNativeAnimatable.mod.AnimatableComponent[
    typingsSlinky.reactNative.mod.TextProperties, 
    typingsSlinky.reactNative.mod.TextStyle
  ]
  
  type View = typingsSlinky.reactNativeAnimatable.mod.AnimatableComponent[
    typingsSlinky.reactNative.mod.ViewProperties, 
    typingsSlinky.reactNative.mod.ViewStyle
  ]
}
