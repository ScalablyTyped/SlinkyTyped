package typingsSlinky.reactTypingAnimation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactTypingAnimation.mod.Typing.ResetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reset
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset] {
  @JSImport("react-typing-animation", "default.Reset")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    count: Int | Double = null,
    delay: Int | Double = null,
    speed: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset] = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ResetProperties
}

