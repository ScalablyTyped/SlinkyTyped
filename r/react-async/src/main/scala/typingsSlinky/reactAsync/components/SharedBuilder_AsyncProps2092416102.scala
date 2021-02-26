package typingsSlinky.reactAsync.components

import org.scalajs.dom.experimental.AbortController
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncAction
import typingsSlinky.reactAsync.mod.AsyncChildren
import typingsSlinky.reactAsync.mod.AsyncProps
import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.ReducerAsyncState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_AsyncProps2092416102[R <: js.Object, T] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def children(value: AsyncChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  
  @scala.inline
  def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def debugLabel(value: String): this.type = set("debugLabel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def deferFn(
    value: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
  ): this.type = set("deferFn", js.Any.fromFunction3(value))
  
  @scala.inline
  def dispatcher(
    value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit
  ): this.type = set("dispatcher", js.Any.fromFunction3(value))
  
  @scala.inline
  def initialValue(value: T): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onReject(value: /* error */ js.Error => Unit): this.type = set("onReject", js.Any.fromFunction1(value))
  
  @scala.inline
  def onResolve(value: T => Unit): this.type = set("onResolve", js.Any.fromFunction1(value))
  
  @scala.inline
  def promise(value: js.Promise[T]): this.type = set("promise", value.asInstanceOf[js.Any])
  
  @scala.inline
  def promiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): this.type = set("promiseFn", js.Any.fromFunction2(value))
  
  @scala.inline
  def reducer(
    value: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]]
  ): this.type = set("reducer", js.Any.fromFunction3(value))
  
  @scala.inline
  def watch(value: js.Any): this.type = set("watch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def watchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _): this.type = set("watchFn", js.Any.fromFunction2(value))
}
