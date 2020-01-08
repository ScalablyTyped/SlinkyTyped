package typingsSlinky.conductorDashAnimate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.conductorDashAnimate.conductorDashAnimateMod.AnimatedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Animated
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.conductorDashAnimate.conductorDashAnimateMod.Animated] {
  @JSImport("conductor-animate", "Animated")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(id: String, additional: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.conductorDashAnimate.conductorDashAnimateMod.Animated] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (additional != null) __obj.updateDynamic("additional")(additional.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnimatedProps
}

