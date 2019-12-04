package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.tooltipHorizontal
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.vertical
import typingsSlinky.materialDashUi.internalTooltipMod.TooltipProps
import typingsSlinky.materialDashUi.internalTooltipMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    label: js.Any,
    horizontalPosition: tooltipHorizontal = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    verticalPosition: vertical = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

