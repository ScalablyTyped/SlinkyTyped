package typingsSlinky.mobxReactLite

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReactLite.anon.DisplayName
import typingsSlinky.mobxReactLite.anon.IObserverOptionsforwardRe
import typingsSlinky.mobxReactLite.observerMod.IObserverOptions
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.RefForwardingComponent
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-react-lite", "enableStaticRendering")
  @js.native
  def enableStaticRendering(enable: Boolean): Unit = js.native
  
  @JSImport("mobx-react-lite", "isObserverBatched")
  @js.native
  def isObserverBatched(): Boolean = js.native
  
  @JSImport("mobx-react-lite", "isUsingStaticRendering")
  @js.native
  def isUsingStaticRendering(): Boolean = js.native
  
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): ReactComponentClass[P] = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  
  @JSImport("mobx-react-lite", "observerBatching")
  @js.native
  def observerBatching(reactionScheduler: js.Any): Unit = js.native
  
  @JSImport("mobx-react-lite", "useAsObservableSource")
  @js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  
  @JSImport("mobx-react-lite", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react-lite", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = js.native
  
  @JSImport("mobx-react-lite", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react-lite", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  
  @JSImport("mobx-react-lite", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  @JSImport("mobx-react-lite", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  
  @JSImport("mobx-react-lite", "useStaticRendering")
  @js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
}
