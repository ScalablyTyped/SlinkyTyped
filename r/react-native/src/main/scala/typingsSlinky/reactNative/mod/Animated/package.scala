package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def Image: slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.reactNative.anon.TypeofImage]
    ]
  ] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("Image").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.reactNative.anon.TypeofImage]
    ]
  ]]
  
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typingsSlinky.reactNative.mod.Animated.AnimatedValue
  
  type Nullable = js.UndefOr[scala.Null]
  
  type Primitive = java.lang.String | scala.Double | scala.Boolean | js.Symbol
  
  @scala.inline
  def ScrollView: slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[
        org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod._ScrollView]
      ]
    ]
  ] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[
        org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod._ScrollView]
      ]
    ]
  ]]
  
  type TAugmentRef[T] = typingsSlinky.react.mod.Ref[js.Any | typingsSlinky.reactNative.mod.Animated.LegacyRef[js.Any]]
  
  @scala.inline
  def Text: slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod._Text]]
    ]
  ] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("Text").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod._Text]]
    ]
  ]]
  
  type ValueListenerCallback = js.Function1[/* state */ typingsSlinky.reactNative.anon.Value, scala.Unit]
  
  type ValueXYListenerCallback = js.Function1[/* value */ typingsSlinky.reactNative.anon.X, scala.Unit]
  
  @scala.inline
  def View: slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.reactNative.anon.TypeofView]
    ]
  ] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("View").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[
      typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.reactNative.anon.TypeofView]
    ]
  ]]
  
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
  
  @scala.inline
  def add(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedAddition = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedAddition]
  
  @scala.inline
  def createAnimatedComponent[T /* <: slinky.core.ReactComponentClass[_] */](component: T): slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.react.mod.ComponentPropsWithRef[T]]
  ] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.react.mod.ComponentPropsWithRef[T]]
  ]]
  
  @scala.inline
  def decay(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValueXY,
    config: typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  @scala.inline
  def decay(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValue,
    config: typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def delay(time: scala.Double): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def diffClamp(a: typingsSlinky.reactNative.mod.Animated.Animated, min: scala.Double, max: scala.Double): typingsSlinky.reactNative.mod.Animated.AnimatedDiffClamp = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedDiffClamp]
  
  @scala.inline
  def divide(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedDivision = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedDivision]
  
  @scala.inline
  def event[T](argMapping: js.Array[typingsSlinky.reactNative.mod.Animated.Mapping | scala.Null]): js.Function1[/* repeated */ js.Any, scala.Unit] = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  @scala.inline
  def event[T](
    argMapping: js.Array[typingsSlinky.reactNative.mod.Animated.Mapping | scala.Null],
    config: typingsSlinky.reactNative.mod.Animated.EventConfig[T]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  @scala.inline
  def loop(animation: typingsSlinky.reactNative.mod.Animated.CompositeAnimation): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  @scala.inline
  def loop(
    animation: typingsSlinky.reactNative.mod.Animated.CompositeAnimation,
    config: typingsSlinky.reactNative.mod.Animated.LoopAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def modulo(a: typingsSlinky.reactNative.mod.Animated.Animated, modulus: scala.Double): typingsSlinky.reactNative.mod.Animated.AnimatedModulo = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedModulo]
  
  @scala.inline
  def multiply(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedMultiplication = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedMultiplication]
  
  @scala.inline
  def parallel(animations: js.Array[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  @scala.inline
  def parallel(
    animations: js.Array[typingsSlinky.reactNative.mod.Animated.CompositeAnimation],
    config: typingsSlinky.reactNative.mod.Animated.ParallelConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def sequence(animations: js.Array[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def spring(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValueXY,
    config: typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  @scala.inline
  def spring(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValue,
    config: typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def stagger(
    time: scala.Double,
    animations: js.Array[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  
  @scala.inline
  def subtract(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedSubtraction = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.AnimatedSubtraction]
  
  @scala.inline
  def timing(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValueXY,
    config: typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
  @scala.inline
  def timing(
    value: typingsSlinky.reactNative.mod.Animated.AnimatedValue,
    config: typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
  ): typingsSlinky.reactNative.mod.Animated.CompositeAnimation = (typingsSlinky.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNative.mod.Animated.CompositeAnimation]
}
