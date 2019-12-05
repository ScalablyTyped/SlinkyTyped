package typingsSlinky.reactDashSticky.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSticky.reactDashStickyMod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSticky.reactDashStickyMod.Sticky] {
  @JSImport("react-sticky", "Sticky")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    bottomOffset: Int | Double = null,
    disableCompensation: js.UndefOr[Boolean] = js.undefined,
    disableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    onStickyStateChange: /* isSticky */ Boolean => Unit = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    stickyClassName: String = null,
    stickyStyle: js.Any = null,
    style: js.Any = null,
    topOffset: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSticky.reactDashStickyMod.Sticky] = {
    val __obj = js.Dynamic.literal()
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCompensation)) __obj.updateDynamic("disableCompensation")(disableCompensation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHardwareAcceleration)) __obj.updateDynamic("disableHardwareAcceleration")(disableHardwareAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (onStickyStateChange != null) __obj.updateDynamic("onStickyStateChange")(js.Any.fromFunction1(onStickyStateChange))
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyStyle != null) __obj.updateDynamic("stickyStyle")(stickyStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StickyProps
}

