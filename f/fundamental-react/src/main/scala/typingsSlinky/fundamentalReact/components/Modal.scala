package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.fundamentalReact.AnonCloseButton
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.modalMod.ModalProps
import typingsSlinky.fundamentalReact.modalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/Modal/Modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    title: String,
    actions: TagMod[Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    localizedText: AnonCloseButton = null,
    onClose: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    show: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

