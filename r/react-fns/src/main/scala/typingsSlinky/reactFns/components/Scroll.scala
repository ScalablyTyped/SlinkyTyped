package typingsSlinky.reactFns.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactFns.scrollScrollMod.ScrollConfig
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scroll
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactFns.mod.Scroll] {
  @JSImport("react-fns", "Scroll")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    component: ReactComponentClass[ScrollProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: ScrollProps => TagMod[Any] = null,
    throttle: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactFns.mod.Scroll] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactFns.mod.Scroll] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactFns.mod.Scroll](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollConfig with SharedRenderProps[ScrollProps]
}

