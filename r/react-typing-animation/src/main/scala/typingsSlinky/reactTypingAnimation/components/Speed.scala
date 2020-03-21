package typingsSlinky.reactTypingAnimation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactTypingAnimation.mod.Typing.SpeedProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Speed
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] {
  @JSImport("react-typing-animation", "default.Speed")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(ms: Double, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpeedProperties
}

