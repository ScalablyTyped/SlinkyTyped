package typingsSlinky.reactDashRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashRedux.reactDashReduxMod.ProviderProps
import typingsSlinky.reactDashRedux.reactDashReduxMod.ReactReduxContextValue
import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRedux.reactDashReduxMod.Provider[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRedux.reactDashReduxMod.Provider[js.Any]].asInstanceOf[String | js.Object]
  def apply(
    store: Store[_, Action[_]],
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRedux.reactDashReduxMod.Provider[js.Any]] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProviderProps[js.Any]
}

