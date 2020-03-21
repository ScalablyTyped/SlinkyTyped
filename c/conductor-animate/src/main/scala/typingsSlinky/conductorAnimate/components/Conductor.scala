package typingsSlinky.conductorAnimate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.conductorAnimate.mod.Animations
import typingsSlinky.conductorAnimate.mod.ConductorProps
import typingsSlinky.conductorAnimate.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Conductor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.conductorAnimate.mod.Conductor] {
  @JSImport("conductor-animate", "Conductor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config]),
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.conductorAnimate.mod.Conductor] = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConductorProps
}

