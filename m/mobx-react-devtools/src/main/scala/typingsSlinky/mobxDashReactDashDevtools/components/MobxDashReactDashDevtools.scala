package typingsSlinky.mobxDashReactDashDevtools.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.mobxDashReactDashDevtools.Anon_Bottom
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.IDevToolProps
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.default
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.bottomLeft
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.bottomRight
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.topLeft
import typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.topRight
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MobxDashReactDashDevtools
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("mobx-react-devtools", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    highlightTimeout: Int | Double = null,
    noPanel: js.UndefOr[Boolean] = js.undefined,
    position: topRight | bottomRight | bottomLeft | topLeft | Anon_Bottom = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noPanel)) __obj.updateDynamic("noPanel")(noPanel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDevToolProps
}

