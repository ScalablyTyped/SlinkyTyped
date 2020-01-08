package typingsSlinky.reactDashAsync.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortController
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAsync.reactDashAsyncMod.AsyncAction
import typingsSlinky.reactDashAsync.reactDashAsyncMod.AsyncProps
import typingsSlinky.reactDashAsync.reactDashAsyncMod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AsyncProps154051112[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply[T](
    debugLabel: String = null,
    deferFn: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    dispatcher: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit = null,
    initialValue: T = null,
    onReject: /* error */ js.Error => Unit = null,
    onResolve: T => Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T] = null,
    reducer: (/* state */ AsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]]) => AsyncState[T] = null,
    watch: js.Any = null,
    watchFn: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (debugLabel != null) __obj.updateDynamic("debugLabel")(debugLabel.asInstanceOf[js.Any])
    if (deferFn != null) __obj.updateDynamic("deferFn")(js.Any.fromFunction3(deferFn))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(js.Any.fromFunction3(dispatcher))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2(promiseFn))
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3(reducer))
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AsyncProps[js.Any]
}

