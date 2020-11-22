package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Animated {
  
  type AnimatedComponent[T /* <: slinky.core.ReactComponentClass[_] */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.react.mod.ComponentPropsWithRef[T]]
  ]
  
  type AnimatedProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: key extends react-native.react-native.Animated.NonAnimatedProps? key extends 'ref'? react-native.react-native.Animated.TAugmentRef<T[key]> : T[key] : react-native.react-native.Animated.WithAnimatedValue<T[key]>}
    */ typingsSlinky.reactNative.reactNativeStrings.AnimatedProps with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type AnimatedValue = typingsSlinky.reactNative.mod.Animated.Value
  
  type AnimatedValueXY = typingsSlinky.reactNative.mod.Animated.ValueXY
  
  type Builtin = js.Function | js.Date | js.Error | js.RegExp
  
  type ComponentProps[T] = js.Any
  
  type EndCallback = js.Function1[/* result */ typingsSlinky.reactNative.mod.Animated.EndResult, scala.Unit]
  
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typingsSlinky.reactNative.mod.Animated.AnimatedValue
  
  type Nullable = js.UndefOr[scala.Null]
  
  type Primitive = java.lang.String | scala.Double | scala.Boolean | js.Symbol
  
  type TAugmentRef[T] = typingsSlinky.react.mod.Ref[js.Any | typingsSlinky.reactNative.mod.Animated.LegacyRef[js.Any]]
  
  type ValueListenerCallback = js.Function1[/* state */ typingsSlinky.reactNative.anon.Value, scala.Unit]
  
  type ValueXYListenerCallback = js.Function1[/* value */ typingsSlinky.reactNative.anon.X, scala.Unit]
  
  type WithAnimatedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-native.react-native.Animated.WithAnimatedValue<T[K]>}
    */ typingsSlinky.reactNative.reactNativeStrings.WithAnimatedObject with org.scalablytyped.runtime.TopLevel[T]
  
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.reactNative.mod.Animated.WithAnimatedObject[T]
    - typingsSlinky.reactNative.mod.Animated.WithAnimatedArray[js.Any]
    - typingsSlinky.reactNative.mod.Animated.Value
    - typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  */
  type WithAnimatedValue[T] = typingsSlinky.reactNative.mod.Animated._WithAnimatedValue[T] | typingsSlinky.reactNative.mod.Animated.WithAnimatedArray[js.Any] | T | typingsSlinky.reactNative.mod.Animated.WithAnimatedObject[T]
}
