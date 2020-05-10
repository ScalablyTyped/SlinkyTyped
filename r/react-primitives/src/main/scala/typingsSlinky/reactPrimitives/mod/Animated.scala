package typingsSlinky.reactPrimitives.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactNative.AnonY
import typingsSlinky.reactNative.mod.Animated.AnimatedComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedValue
import typingsSlinky.reactNative.mod.Animated.AnimatedValueXY
import typingsSlinky.reactNative.mod.Animated.ComponentProps
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
import typingsSlinky.reactNative.mod.Animated.EventConfig
import typingsSlinky.reactNative.mod.Animated.LoopAnimationConfig
import typingsSlinky.reactNative.mod.Animated.Mapping
import typingsSlinky.reactNative.mod.Animated.ParallelConfig
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object Animated extends js.Object {
  @js.native
  class Animated ()
    extends typingsSlinky.reactNative.mod.Animated.Animated
  
  @js.native
  class AnimatedAddition ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDiffClamp ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDivision ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedInterpolation ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedMultiplication ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedSubtraction ()
    extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedWithChildren ()
    extends typingsSlinky.reactNative.mod.Animated.Animated
  
  @js.native
  class Value protected ()
    extends typingsSlinky.reactNative.mod.Animated.Value {
    def this(value: Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends typingsSlinky.reactNative.mod.Animated.ValueXY {
    def this(valueIn: AnonY) = this()
  }
  
  val FlatList: AnimatedComponent[typingsSlinky.reactNative.mod.FlatList[js.Any]] = js.native
  val Image: AnimatedComponent[typingsSlinky.reactNative.mod.Image] = js.native
  val ScrollView: AnimatedComponent[typingsSlinky.reactNative.mod.ScrollView] = js.native
  val SectionList: AnimatedComponent[typingsSlinky.reactNative.mod.SectionList[js.Any]] = js.native
  val Text: AnimatedComponent[typingsSlinky.reactNative.mod.Text] = js.native
  val View: AnimatedComponent[typingsSlinky.reactNative.mod.View] = js.native
  def add(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedAddition = js.native
  def createAnimatedComponent(component: ComponentClass[ComponentProps[_], js.Object]): AnimatedComponent[
    ReactComponentClass[ComponentProps[_]] | InstanceType[ReactComponentClass[ComponentProps[_]]]
  ] = js.native
  def createAnimatedComponent(component: FunctionComponent[ComponentProps[_]]): AnimatedComponent[
    ReactComponentClass[ComponentProps[_]] | InstanceType[ReactComponentClass[ComponentProps[_]]]
  ] = js.native
  def createAnimatedComponent[T /* <: ReactComponentClass[ComponentProps[T]] */](component: T): AnimatedComponent[T | InstanceType[T]] = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: typingsSlinky.reactNative.mod.Animated.Animated, min: Double, max: Double): typingsSlinky.reactNative.mod.Animated.AnimatedDiffClamp = js.native
  def divide(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: typingsSlinky.reactNative.mod.Animated.Animated, modulus: Double): typingsSlinky.reactNative.mod.Animated.AnimatedModulo = js.native
  def multiply(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(
    a: typingsSlinky.reactNative.mod.Animated.Animated,
    b: typingsSlinky.reactNative.mod.Animated.Animated
  ): typingsSlinky.reactNative.mod.Animated.AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}

