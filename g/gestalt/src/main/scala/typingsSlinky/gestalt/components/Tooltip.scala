package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import typingsSlinky.gestalt.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.mod.Tooltip] {
  @JSImport("gestalt", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    anchor: js.Any,
    onDismiss: () => Unit,
    idealDirection: up | right | down | left = null,
    positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Tooltip] = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

