package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Animated {
  type AnimatedProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: react-native.react-native.Animated.WithAnimatedValue<T[key]>}
    */ typingsSlinky.reactNative.reactNativeStrings.AnimatedProps with org.scalablytyped.runtime.TopLevel[T]
  type AnimatedValue = typingsSlinky.reactNative.mod.Animated.Value
  type AnimatedValueXY = typingsSlinky.reactNative.mod.Animated.ValueXY
  type Base = typingsSlinky.reactNative.mod.Animated.Animated
  type ComponentProps[T] = js.Any
  type EndCallback = js.Function1[/* result */ typingsSlinky.reactNative.mod.Animated.EndResult, scala.Unit]
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typingsSlinky.reactNative.mod.Animated.AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ typingsSlinky.reactNative.AnonValue, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ typingsSlinky.reactNative.AnonX, scala.Unit]
}
