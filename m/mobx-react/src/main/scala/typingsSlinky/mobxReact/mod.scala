package typingsSlinky.mobxReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.mobxReact.disposeOnUnmountMod.Disposer
import typingsSlinky.mobxReact.ireactcomponentMod.IReactComponent
import typingsSlinky.mobxReact.istorestopropsMod.IStoresToProps
import typingsSlinky.mobxReact.iwrappedcomponentMod.IWrappedComponent
import typingsSlinky.mobxReact.providerMod.ProviderProps
import typingsSlinky.mobxReactLite.observerBatchingMod.IBatchedUpdates
import typingsSlinky.mobxReactLite.useObserverMod.IUseObserverOptions
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val MobXProviderContext: Context[Record[String, js.Any]] = js.native
  def disposeOnUnmount(target: ReactComponentClass[_], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: ReactComponentClass[_], fn: TF): TF = js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def isObserverBatched(): js.Any = js.native
  def isUsingStaticRendering(): Boolean = js.native
  def observer[T /* <: IReactComponent[_] */](component: T): T = js.native
  def observerBatching(): Unit = js.native
  def observerBatching(reactionScheduler: IBatchedUpdates): Unit = js.native
  def observerBatchingOptOut(): Unit = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: js.UndefOr[scala.Nothing], options: IUseObserverOptions): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
  @js.native
  object PropTypes extends js.Object {
    var arrayOrObservableArray: Requireable[_] = js.native
    var objectOrObservableObject: Requireable[_] = js.native
    var observableArray: Requireable[_] = js.native
    var observableMap: Requireable[_] = js.native
    var observableObject: Requireable[_] = js.native
    def arrayOrObservableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    def observableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
  }
  
  @js.native
  object Provider extends js.Object {
    var displayName: String = js.native
    def apply(props: ProviderProps): ReactElement = js.native
  }
  
}

