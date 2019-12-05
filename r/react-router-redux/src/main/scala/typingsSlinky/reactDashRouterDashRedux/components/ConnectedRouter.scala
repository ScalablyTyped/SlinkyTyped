package typingsSlinky.reactDashRouterDashRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouterProps
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConnectedRouter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouter[js.Any]
    ] {
  @JSImport("react-router-redux", "ConnectedRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[State](
    history: History[LocationState],
    store: Store[State, AnyAction] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouter[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouter[js.Any]]]
  }
  type Props = ConnectedRouterProps[js.Any]
}

