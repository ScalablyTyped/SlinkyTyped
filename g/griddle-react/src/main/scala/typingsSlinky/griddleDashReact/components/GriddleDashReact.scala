package typingsSlinky.griddleDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleDashReact.Anon_FilterPlaceholder
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleComponents
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleEvents
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleInitialState
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddlePageProperties
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddlePlugin
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleProps
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleRenderProperties
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleSortKey
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleStyleConfig
import typingsSlinky.griddleDashReact.griddleDashReactMod.Listener
import typingsSlinky.griddleDashReact.griddleDashReactMod.PropertyBag
import typingsSlinky.griddleDashReact.griddleDashReactMod.Reducer
import typingsSlinky.griddleDashReact.griddleDashReactMod.Selector
import typingsSlinky.griddleDashReact.griddleDashReactMod.SettingsComponentObject
import typingsSlinky.griddleDashReact.griddleDashReactMod.default
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GriddleDashReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("griddle-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    components: GriddleComponents = null,
    core: GriddlePlugin = null,
    data: js.Array[T] = null,
    enableSettings: js.UndefOr[Boolean] = js.undefined,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[Listener] = null,
    pageProperties: GriddlePageProperties = null,
    plugins: js.Array[GriddlePlugin] = null,
    reducer: PropertyBag[Reducer] = null,
    reduxMiddleware: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    sortMethod: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    storeKey: String = null,
    styleConfig: GriddleStyleConfig = null,
    textProperties: Anon_FilterPlaceholder = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(reducer.asInstanceOf[js.Any])
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware.asInstanceOf[js.Any])
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties.asInstanceOf[js.Any])
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig.asInstanceOf[js.Any])
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleDashReact.griddleDashReactMod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleDashReact.griddleDashReactMod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GriddleProps[js.Any]
}

