package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlReact.mod.MjmlBreakpointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlBreakpoint
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlBreakpoint] {
  @JSImport("mjml-react", "MjmlBreakpoint")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(width: String | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlBreakpoint] = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlBreakpoint] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlBreakpoint](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlBreakpointProps
}

