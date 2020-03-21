package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon1
import typingsSlinky.gestalt.AnonEventSyntheticEvent
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.rounded
import typingsSlinky.gestalt.gestaltStrings.roundedBottom
import typingsSlinky.gestalt.gestaltStrings.roundedLeft
import typingsSlinky.gestalt.gestaltStrings.roundedRight
import typingsSlinky.gestalt.gestaltStrings.roundedTop
import typingsSlinky.gestalt.gestaltStrings.square
import typingsSlinky.gestalt.gestaltStrings.zoomIn
import typingsSlinky.gestalt.gestaltStrings.zoomOut
import typingsSlinky.gestalt.mod.TouchableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Touchable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.mod.Touchable] {
  @JSImport("gestalt", "Touchable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onTouch: Anon1 => Unit,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Unit = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Unit = null,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Touchable] = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TouchableProps
}

