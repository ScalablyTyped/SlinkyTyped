package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.Anon_CloseButton
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typingsSlinky.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import typingsSlinky.fundamentalDashReact.libModalModalMod.ModalProps
import typingsSlinky.fundamentalDashReact.libModalModalMod.default
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
    bodyProps: StringDictionary[js.Any] = null,
    closeProps: StringDictionary[js.Any] = null,
    contentProps: StringDictionary[js.Any] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    footerProps: StringDictionary[js.Any] = null,
    headerProps: StringDictionary[js.Any] = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    localizedText: Anon_CloseButton = null,
    onClose: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    show: js.UndefOr[Boolean] = js.undefined,
    titleProps: StringDictionary[js.Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps.asInstanceOf[js.Any])
    if (closeProps != null) __obj.updateDynamic("closeProps")(closeProps.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

