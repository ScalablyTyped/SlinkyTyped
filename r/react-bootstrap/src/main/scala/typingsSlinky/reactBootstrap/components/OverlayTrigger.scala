package typingsSlinky.reactBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrap.overlayTriggerMod.OverlayTriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverlayTrigger
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrap.mod.OverlayTrigger] {
  @JSImport("react-bootstrap", "OverlayTrigger")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    overlay: js.Any,
    animation: js.Any = null,
    container: js.Any = null,
    containerPadding: Int | Double = null,
    defaultOverlayShown: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    delayHide: Int | Double = null,
    delayShow: Int | Double = null,
    onEnter: js.Function = null,
    onEntered: js.Function = null,
    onEntering: js.Function = null,
    onExit: js.Function = null,
    onExited: js.Function = null,
    onExiting: js.Function = null,
    placement: String = null,
    rootClose: js.UndefOr[Boolean] = js.undefined,
    trigger: String | js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.OverlayTrigger] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOverlayShown)) __obj.updateDynamic("defaultOverlayShown")(defaultOverlayShown.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (delayHide != null) __obj.updateDynamic("delayHide")(delayHide.asInstanceOf[js.Any])
    if (delayShow != null) __obj.updateDynamic("delayShow")(delayShow.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OverlayTriggerProps
}

