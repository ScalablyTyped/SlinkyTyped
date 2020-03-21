package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.handleMod.IInternalHandleProps
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Handle
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.handleMod.Handle] {
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    label: ReactChild,
    value: Double,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* newValue */ Double => Unit = null,
    onRelease: /* newValue */ Double => Unit = null,
    stepSize: Int | Double = null,
    tickSize: Int | Double = null,
    tickSizeRatio: Int | Double = null,
    `type`: HandleType = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.handleMod.Handle] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter.asInstanceOf[js.Any])
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickSizeRatio != null) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IInternalHandleProps
}

