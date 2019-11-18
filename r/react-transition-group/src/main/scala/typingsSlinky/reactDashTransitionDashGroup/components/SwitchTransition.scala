package typingsSlinky.reactDashTransitionDashGroup.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
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
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashTransitionDashGroup.switchTransitionMod.default].asInstanceOf[String | js.Object]
  def apply(mode: `out-in` | `in-out` = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchTransitionProps
}

