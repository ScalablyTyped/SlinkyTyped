package typingsSlinky.mobxReactLite

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReactLite.observerMod.IObserverOptions
import typingsSlinky.mobxReactLite.optimizeSchedulerMod.IBatchedUpdates
import typingsSlinky.mobxReactLite.useDisposableMod.TDisposable
import typingsSlinky.mobxReactLite.useObservableMod.SupportedValues
import typingsSlinky.mobxReactLite.useObserverMod.IUseObserverOptions
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.RefForwardingComponent
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isUsingStaticRendering(): Boolean = js.native
  def observer[P /* <: js.Object */](baseComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): ReactComponentClass[P] = js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  def optimizeScheduler(reactionScheduler: IBatchedUpdates): Unit = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useComputed[T](func: js.Function0[T]): T = js.native
  def useComputed[T](func: js.Function0[T], inputs: js.Array[_]): T = js.native
  def useDisposable[D /* <: TDisposable */](disposerGenerator: js.Function0[D]): D = js.native
  def useDisposable[D /* <: TDisposable */](disposerGenerator: js.Function0[D], inputs: js.Array[_]): D = js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObservable[T /* <: SupportedValues */](initialValue: T): T = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
}

