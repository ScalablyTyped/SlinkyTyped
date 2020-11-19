package typingsSlinky.lodashDecorators

import typingsSlinky.lodashDecorators.applicatorsMod.Applicator
import typingsSlinky.lodashDecorators.commonMod.BiTypedDecorator
import typingsSlinky.lodashDecorators.commonMod.BiTypedDecorator1
import typingsSlinky.lodashDecorators.commonMod.BiTypedDecorator2
import typingsSlinky.lodashDecorators.commonMod.BiTypedDecoratorN
import typingsSlinky.lodashDecorators.commonMod.BiTypedMethodDecorator
import typingsSlinky.lodashDecorators.commonMod.BiTypedMethodDecorator1
import typingsSlinky.lodashDecorators.commonMod.InstanceChainData
import typingsSlinky.lodashDecorators.commonMod.LodashDecorator
import typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
import typingsSlinky.lodashDecorators.commonMod.ResolvableFunction
import typingsSlinky.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typingsSlinky.lodashDecorators.sharedMod.DebounceOptions
import typingsSlinky.lodashDecorators.sharedMod.MemoizeConfig
import typingsSlinky.lodashDecorators.sharedMod.ThrottleOptions
import typingsSlinky.lodashDecorators.utilsMod.CompositeKeyWeakMap
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("AfterAll")
  def AfterAll_(n: Double): LodashDecorator = js.native
  
  @JSName("After")
  def After_(n: Double): LodashDecorator = js.native
  
  @JSName("Ary")
  def Ary_(n: Double): LodashMethodDecorator = js.native
  
  @JSName("Attempt")
  val Attempt_ : BiTypedMethodDecorator = js.native
  
  @JSName("BeforeAll")
  def BeforeAll_(n: Double): LodashDecorator = js.native
  
  @JSName("Before")
  def Before_(n: Double): LodashDecorator = js.native
  
  @JSName("BindAll")
  def BindAll_(): ClassDecorator = js.native
  @JSName("BindAll")
  def BindAll_(methods: js.Array[String]): ClassDecorator = js.native
  
  @JSName("Bind")
  val Bind_ : BiTypedMethodDecorator1[js.Any] = js.native
  
  @JSName("CurryAll")
  val CurryAll_ : BiTypedDecorator1[Double] = js.native
  
  @JSName("CurryRightAll")
  val CurryRightAll_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSName("CurryRight")
  val CurryRight_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSName("Curry")
  val Curry_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSName("DebounceAll")
  def DebounceAll_(): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  
  @JSName("Debounce")
  def Debounce_(): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double): LodashDecorator = js.native
  @JSName("Debounce")
  def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  
  val DecoratorFactory: typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSName("Defer")
  val Defer_ : BiTypedDecoratorN = js.native
  
  @JSName("Delay")
  def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  
  @JSName("Flip")
  def Flip_(): LodashDecorator = js.native
  @JSName("Flip")
  def Flip_(fn: ResolvableFunction): LodashDecorator = js.native
  
  @JSName("FlowRight")
  def FlowRight_(fns: ResolvableFunction*): LodashDecorator = js.native
  
  @JSName("Flow")
  def Flow_(fns: ResolvableFunction*): LodashDecorator = js.native
  
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSName("MemoizeAll")
  val MemoizeAll_ : BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSName("Memoize")
  val Memoize_ : BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  @JSName("Mixin")
  def Mixin_(srcs: js.Object*): ClassDecorator = js.native
  
  @JSName("Negate")
  val Negate_ : BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSName("Once")
  val Once_ : BiTypedDecorator = js.native
  
  @JSName("OverArgs")
  def OverArgs_(transforms: js.Function*): LodashMethodDecorator = js.native
  
  @JSName("PartialRight")
  def PartialRight_(partials: js.Any*): PropertyDecorator = js.native
  
  @JSName("Partial")
  def Partial_(partials: js.Any*): PropertyDecorator = js.native
  
  @JSName("Rearg")
  def Rearg_(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSName("Rearg")
  def Rearg_(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSName("Rearg")
  def Rearg_(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  
  @JSName("Rest")
  val Rest_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSName("Spread")
  val Spread_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSName("Tap")
  val Tap_ : BiTypedMethodDecorator = js.native
  
  @JSName("ThrottleAll")
  def ThrottleAll_(): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  
  @JSName("ThrottleGetter")
  val ThrottleGetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSName("ThrottleSetter")
  val ThrottleSetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSName("Throttle")
  val Throttle_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSName("Unary")
  val Unary_ : BiTypedMethodDecorator = js.native
  
  @JSName("Wrap")
  def Wrap_(): LodashMethodDecorator = js.native
  @JSName("Wrap")
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  
  def after(n: Double): LodashDecorator = js.native
  
  def afterAll(n: Double): LodashDecorator = js.native
  
  def ary(n: Double): LodashMethodDecorator = js.native
  
  val attempt: BiTypedMethodDecorator = js.native
  
  def before(n: Double): LodashDecorator = js.native
  
  def beforeAll(n: Double): LodashDecorator = js.native
  
  val bind: BiTypedMethodDecorator1[js.Any] = js.native
  
  def bindAll(): ClassDecorator = js.native
  def bindAll(methods: js.Array[String]): ClassDecorator = js.native
  
  val curry: BiTypedMethodDecorator1[Double] = js.native
  
  val curryAll: BiTypedDecorator1[Double] = js.native
  
  val curryRight: BiTypedMethodDecorator1[Double] = js.native
  
  val curryRightAll: BiTypedMethodDecorator1[Double] = js.native
  
  def debounce(): LodashDecorator = js.native
  def debounce(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashDecorator = js.native
  def debounce(wait: Double): LodashDecorator = js.native
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = js.native
  
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: js.UndefOr[scala.Nothing], options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  
  val defer: BiTypedDecoratorN = js.native
  
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  
  def flip(): LodashDecorator = js.native
  def flip(fn: ResolvableFunction): LodashDecorator = js.native
  
  def flow(fns: ResolvableFunction*): LodashDecorator = js.native
  
  def flowRight(fns: ResolvableFunction*): LodashDecorator = js.native
  
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  val memoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  
  def mixin(srcs: js.Object*): ClassDecorator = js.native
  
  val negate: BiTypedDecorator1[ResolvableFunction] = js.native
  
  val once: BiTypedDecorator = js.native
  
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  
  def partial(partials: js.Any*): PropertyDecorator = js.native
  
  def partialRight(partials: js.Any*): PropertyDecorator = js.native
  
  def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  
  val rest: BiTypedMethodDecorator1[Double] = js.native
  
  val spread: BiTypedMethodDecorator1[Double] = js.native
  
  val tap: BiTypedMethodDecorator = js.native
  
  val throttle: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  def throttleAll(): LodashMethodDecorator = js.native
  def throttleAll(wait: js.UndefOr[scala.Nothing], options: ThrottleOptions): LodashMethodDecorator = js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  
  val throttleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  val throttleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  val unary: BiTypedMethodDecorator = js.native
  
  def wrap(): LodashMethodDecorator = js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  
  @js.native
  class DecoratorConfig protected ()
    extends typingsSlinky.lodashDecorators.factoryMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typingsSlinky.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
}
