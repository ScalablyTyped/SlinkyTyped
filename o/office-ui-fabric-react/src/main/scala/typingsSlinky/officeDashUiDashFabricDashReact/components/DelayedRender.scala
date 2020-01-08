package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libDelayedRenderMod.IDelayedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DelayedRender
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.DelayedRender
    ] {
  @JSImport("office-ui-fabric-react/lib/Utilities", "DelayedRender")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(delay: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.DelayedRender
  ] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.DelayedRender
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.DelayedRender](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDelayedRenderProps
}

