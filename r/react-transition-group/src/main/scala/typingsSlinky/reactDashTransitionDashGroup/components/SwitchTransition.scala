package typingsSlinky.reactDashTransitionDashGroup.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`in-out`
import typingsSlinky.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`out-in`
import typingsSlinky.reactDashTransitionDashGroup.switchTransitionMod.SwitchTransitionProps
import typingsSlinky.reactDashTransitionDashGroup.switchTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchTransition
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-transition-group/SwitchTransition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(mode: `out-in` | `in-out` = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashTransitionDashGroup.switchTransitionMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwitchTransitionProps
}

