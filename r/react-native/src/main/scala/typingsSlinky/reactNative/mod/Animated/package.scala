package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Animated {
  type AnimatedComponent[T /* <: slinky.core.ReactComponentClass[_] */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.ComponentProps[T] | typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.react.mod.ComponentPropsWithRef[T]]
  ]
  type AnimatedProps[T] = typingsSlinky.reactNative.reactNativeStrings.AnimatedProps with org.scalablytyped.runtime.TopLevel[T] with (js.Object | typingsSlinky.reactNative.anon.`2`)
  type AnimatedValue = typingsSlinky.reactNative.mod.Animated.Value
  type AnimatedValueXY = typingsSlinky.reactNative.mod.Animated.ValueXY
  type ComponentProps[T] = js.Any
  type EndCallback = js.Function1[/* result */ typingsSlinky.reactNative.mod.Animated.EndResult, scala.Unit]
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typingsSlinky.reactNative.mod.Animated.AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ typingsSlinky.reactNative.anon.Value, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ typingsSlinky.reactNative.anon.X, scala.Unit]
}
