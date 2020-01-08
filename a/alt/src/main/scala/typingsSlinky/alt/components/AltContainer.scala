package typingsSlinky.alt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.alt.AltJS.Alt
import typingsSlinky.alt.AltJS.AltStore
import typingsSlinky.alt.altContainerMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AltContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    actions: StringDictionary[js.Object] = null,
    component: ReactComponentClass[_] = null,
    flux: Alt = null,
    inject: StringDictionary[js.Any] = null,
    render: /* repeated */ js.Any => ReactElement = null,
    shouldComponentUpdate: /* props */ js.Any => Boolean = null,
    store: AltStore[_] = null,
    stores: js.Array[AltStore[_]] = null,
    transform: (/* store */ AltStore[_], /* actions */ js.Any) => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (flux != null) __obj.updateDynamic("flux")(flux.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction1(shouldComponentUpdate))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ContainerProps
}

