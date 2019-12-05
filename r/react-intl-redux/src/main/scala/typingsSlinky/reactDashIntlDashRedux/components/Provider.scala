package typingsSlinky.reactDashIntlDashRedux.components

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
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashIntlDashRedux.reactDashIntlDashReduxMod.Provider[js.Any]
    ] {
  @JSImport("react-intl-redux", "Provider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[A /* <: Action[js.Any] */](
    store: Store[_, A],
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashIntlDashRedux.reactDashIntlDashReduxMod.Provider[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashIntlDashRedux.reactDashIntlDashReduxMod.Provider[js.Any]]]
  }
  type Props = ProviderProps[js.Any]
}

