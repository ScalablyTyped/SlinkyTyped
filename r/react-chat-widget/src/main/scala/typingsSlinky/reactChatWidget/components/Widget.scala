package typingsSlinky.reactChatWidget.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactChatWidget.AnonAutofocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Widget
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactChatWidget.mod.Widget] {
  @JSImport("react-chat-widget", "Widget")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    handleNewUserMessage: String => Unit,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    badge: Int | Double = null,
    customLauncher: ReactComponentClass[js.Function0[Unit]] = null,
    fullScreenMode: js.UndefOr[Boolean] = js.undefined,
    handleQuickButtonClicked: /* value */ String => Unit = null,
    profileAvatar: String = null,
    senderPlaceHolder: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    subtitle: String = null,
    titleAvatar: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactChatWidget.mod.Widget] = {
    val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (customLauncher != null) __obj.updateDynamic("customLauncher")(customLauncher.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenMode)) __obj.updateDynamic("fullScreenMode")(fullScreenMode.asInstanceOf[js.Any])
    if (handleQuickButtonClicked != null) __obj.updateDynamic("handleQuickButtonClicked")(js.Any.fromFunction1(handleQuickButtonClicked))
    if (profileAvatar != null) __obj.updateDynamic("profileAvatar")(profileAvatar.asInstanceOf[js.Any])
    if (senderPlaceHolder != null) __obj.updateDynamic("senderPlaceHolder")(senderPlaceHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (titleAvatar != null) __obj.updateDynamic("titleAvatar")(titleAvatar.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonAutofocus
}

