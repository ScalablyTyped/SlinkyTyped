package typingsSlinky.reactNativeAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
