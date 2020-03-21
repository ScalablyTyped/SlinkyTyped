package typingsSlinky.reactRouterDom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MemoryRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterDom.mod.MemoryRouter] {
  @JSImport("react-router-dom", "MemoryRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    initialEntries: js.Array[LocationDescriptor[LocationState]] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterDom.mod.MemoryRouter] = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactRouterDom.mod.MemoryRouter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactRouterDom.mod.MemoryRouter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MemoryRouterProps
}

