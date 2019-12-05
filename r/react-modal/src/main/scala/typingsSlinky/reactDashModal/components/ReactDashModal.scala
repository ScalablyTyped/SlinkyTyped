package typingsSlinky.reactDashModal.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashModal.reactDashModalMod.Aria
import typingsSlinky.reactDashModal.reactDashModalMod.Classes
import typingsSlinky.reactDashModal.reactDashModalMod.Styles
import typingsSlinky.reactDashModal.reactDashModalMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashModal
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isOpen: Boolean,
    appElement: HTMLElement | js.Object = null,
    aria: Aria = null,
    ariaHideApp: js.UndefOr[Boolean] = js.undefined,
    bodyOpenClassName: String = null,
    className: String | Classes = null,
    closeTimeoutMS: Int | Double = null,
    contentLabel: String = null,
    contentRef: /* instance */ HTMLDivElement => Unit = null,
    data: js.Any = null,
    htmlOpenClassName: String = null,
    onAfterClose: () => Unit = null,
    onAfterOpen: () => Unit = null,
    onRequestClose: /* event */ SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element] => Unit = null,
    overlayClassName: String | Classes = null,
    overlayRef: /* instance */ HTMLDivElement => Unit = null,
    parentSelector: () => HTMLElement = null,
    portalClassName: String = null,
    role: String = null,
    shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined,
    shouldFocusAfterRender: js.UndefOr[Boolean] = js.undefined,
    shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.undefined,
    style: Styles = null,
    testId: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (appElement != null) __obj.updateDynamic("appElement")(appElement.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHideApp)) __obj.updateDynamic("ariaHideApp")(ariaHideApp.asInstanceOf[js.Any])
    if (bodyOpenClassName != null) __obj.updateDynamic("bodyOpenClassName")(bodyOpenClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeTimeoutMS != null) __obj.updateDynamic("closeTimeoutMS")(closeTimeoutMS.asInstanceOf[js.Any])
    if (contentLabel != null) __obj.updateDynamic("contentLabel")(contentLabel.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction1(contentRef))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (htmlOpenClassName != null) __obj.updateDynamic("htmlOpenClassName")(htmlOpenClassName.asInstanceOf[js.Any])
    if (onAfterClose != null) __obj.updateDynamic("onAfterClose")(js.Any.fromFunction0(onAfterClose))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction0(onAfterOpen))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayRef != null) __obj.updateDynamic("overlayRef")(js.Any.fromFunction1(overlayRef))
    if (parentSelector != null) __obj.updateDynamic("parentSelector")(js.Any.fromFunction0(parentSelector))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnEsc)) __obj.updateDynamic("shouldCloseOnEsc")(shouldCloseOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnOverlayClick)) __obj.updateDynamic("shouldCloseOnOverlayClick")(shouldCloseOnOverlayClick.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusAfterRender)) __obj.updateDynamic("shouldFocusAfterRender")(shouldFocusAfterRender.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldReturnFocusAfterClose)) __obj.updateDynamic("shouldReturnFocusAfterClose")(shouldReturnFocusAfterClose.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashModal.reactDashModalMod.Props
}

