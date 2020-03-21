package typingsSlinky.reactAriaLive.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactAriaLive.AnonArialive
import typingsSlinky.reactAriaLive.reactAriaLiveStrings.assertive
import typingsSlinky.reactAriaLive.reactAriaLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveMessage
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-aria-live", "LiveMessage")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    message: String,
    `aria-live`: assertive | polite,
    clearOnUnmount: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnUnmount)) __obj.updateDynamic("clearOnUnmount")(clearOnUnmount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonArialive
}

