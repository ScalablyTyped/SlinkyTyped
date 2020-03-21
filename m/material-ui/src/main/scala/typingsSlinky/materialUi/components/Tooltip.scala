package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typingsSlinky.materialUi.MaterialUI.propTypes.vertical
import typingsSlinky.materialUi.tooltipMod.TooltipProps
import typingsSlinky.materialUi.tooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    label: js.Any,
    horizontalPosition: tooltipHorizontal = null,
    show: js.UndefOr[Boolean] = js.undefined,
    touch: js.UndefOr[Boolean] = js.undefined,
    verticalPosition: vertical = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

