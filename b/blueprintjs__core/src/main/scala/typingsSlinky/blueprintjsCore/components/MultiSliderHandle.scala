package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.handlePropsMod.IHandleProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSliderHandle
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@blueprintjs/core", "MultiSlider.Handle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    value: Double,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    onChange: /* newValue */ Double => Unit = null,
    onRelease: /* newValue */ Double => Unit = null,
    `type`: HandleType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter.asInstanceOf[js.Any])
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IHandleProps
}

