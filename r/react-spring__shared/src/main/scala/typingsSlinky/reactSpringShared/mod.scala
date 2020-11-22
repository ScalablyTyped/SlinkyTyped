package typingsSlinky.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.allocTypes.mod.OneOrMore
import typingsSlinky.fluids.mod.FluidConfig
import typingsSlinky.fluids.mod.FluidEvent
import typingsSlinky.fluids.mod.FluidObserver
import typingsSlinky.fluids.mod.GetFluidConfig_
import typingsSlinky.reactSpringShared.anon.ForEach
import typingsSlinky.reactSpringShared.frameLoopMod.OpaqueAnimation
import typingsSlinky.reactSpringShared.frameLoopMod.RequestFrameFn
import typingsSlinky.reactSpringShared.globalsMod.AnimatedGlobals
import typingsSlinky.reactSpringShared.helpersMod.InferKey
import typingsSlinky.reactSpringShared.helpersMod.InferValue
import typingsSlinky.reactSpringShared.helpersMod.IsArray
import typingsSlinky.reactSpringShared.hooksMod.UseOnce_
import typingsSlinky.reactSpringShared.typesMod.InterpolatorArgs
import typingsSlinky.reactSpringShared.typesMod.InterpolatorConfig
import typingsSlinky.reactSpringShared.typesMod.InterpolatorFactory
import typingsSlinky.std.Exclude
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/esm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addFluidObserver(target: js.Object, observer: FluidObserver[_]): js.UndefOr[js.Function0[Unit]] = js.native
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  def addFluidObserver[E /* <: FluidEvent[_] */](target: typingsSlinky.fluids.mod.FluidValue[_, E], observer: FluidObserver[E]): js.Function0[Unit] = js.native
  
  val createInterpolator: InterpolatorFactory = js.native
  
  def defineHidden(obj: js.Any, key: js.Any, value: js.Any): js.Any = js.native
  
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit]
  ): Unit = js.native
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit],
    ctx: This
  ): Unit = js.native
  
  def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = js.native
  def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = js.native
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  def getFluidConfig[T](arg: T): GetFluidConfig_[T] = js.native
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  def getFluidValue[T, U](target: T): (Exclude[T, typingsSlinky.fluids.mod.FluidValue[_, _]]) | U = js.native
  def getFluidValue[T, U](target: typingsSlinky.fluids.mod.FluidValue[U, _]): (Exclude[T, typingsSlinky.fluids.mod.FluidValue[_, _]]) | U = js.native
  
  /** Does the given value have a `FluidConfig` object? */
  def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = js.native
  
  def isAnimatedString(value: js.Any): /* is string */ Boolean = js.native
  
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  def noop(): Unit = js.native
  
  /** Set the methods for observing the given object. */
  def setFluidConfig(target: js.Object, config: FluidConfig[_, _]): Unit = js.native
  
  def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[_] with (Exclude[T, Unit])) = js.native
  
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  val useOnce: UseOnce_ = js.native
  
  def usePrev[T](value: T): js.UndefOr[T] = js.native
  
  @js.native
  class Any ()
    extends typingsSlinky.allocTypes.mod.Any
  
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] ()
    extends typingsSlinky.fluids.mod.FluidValue[T, Event]
  
  @js.native
  class FrameLoop ()
    extends typingsSlinky.reactSpringShared.frameLoopMod.FrameLoop {
    def this(raf: RequestFrameFn) = this()
  }
  
  @js.native
  object Globals extends js.Object {
    
    def assign(globals: AnimatedGlobals): AnimatedGlobals = js.native
    
    var batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    
    var colorNames: StringDictionary[Double] | Null = js.native
    
    var createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
    
    var frameLoop: typingsSlinky.reactSpringShared.frameLoopMod.FrameLoop = js.native
    
    var now: js.Function0[Double] = js.native
    
    var requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
    
    var skipAnimation: Boolean = js.native
    
    var to: js.Function2[
        /* source */ OneOrMore[typingsSlinky.fluids.mod.FluidValue[js.Any, js.Any]], 
        /* args */ InterpolatorArgs[js.Any, js.Any], 
        typingsSlinky.fluids.mod.FluidValue[js.Any, js.Any]
      ] = js.native
    
    var willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
  }
  
  @js.native
  object is extends js.Object {
    
    var arr: IsArray = js.native
    
    def fun(a: js.Any): /* is std.Function */ Boolean = js.native
    
    def num(a: js.Any): /* is number */ Boolean = js.native
    
    def obj[T /* <: js.Any */](a: T): /* is std.Exclude<T & @alloc/types.@alloc/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean = js.native
    
    def str(a: js.Any): /* is string */ Boolean = js.native
    
    def und(a: js.Any): /* is undefined */ Boolean = js.native
  }
}
