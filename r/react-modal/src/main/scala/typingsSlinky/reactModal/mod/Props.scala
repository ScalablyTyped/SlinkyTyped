package typingsSlinky.reactModal.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /* Set this to properly hide your application from assistive screenreaders and other assistive technologies while the modal is open. */
  var appElement: js.UndefOr[HTMLElement | js.Object] = js.native
  /* Additional aria attributes. */
  var aria: js.UndefOr[Aria] = js.native
  /* Boolean indicating if the appElement should be hidden. Defaults to true. */
  var ariaHideApp: js.UndefOr[Boolean] = js.native
  /* String className to be applied to the document.body (must be a constant string). When set to null it doesn't add any class to document.body. */
  var bodyOpenClassName: js.UndefOr[String | Null] = js.native
  /* String or object className to be applied to the modal content. */
  var className: js.UndefOr[String | Classes] = js.native
  /* Number indicating the milliseconds to wait before closing the modal. Defaults to zero (no timeout). */
  var closeTimeoutMS: js.UndefOr[Double] = js.native
  /* String indicating how the content container should be announced to screenreaders. */
  var contentLabel: js.UndefOr[String] = js.native
  /* Function accepting the ref for the content */
  var contentRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.native
  /* Additional data attributes to be applied to to the modal content in the form of "data-*" */
  var data: js.UndefOr[js.Any] = js.native
  /* String className to be applied to the document.html (must be a constant string). Defaults to null. */
  var htmlOpenClassName: js.UndefOr[String | Null] = js.native
  /* String value of an id attribute to be applied to the modal content */
  var id: js.UndefOr[String] = js.native
  /* Boolean describing if the modal should be shown or not. Defaults to false. */
  var isOpen: Boolean = js.native
  /* Function that will be run after the modal has closed. */
  var onAfterClose: js.UndefOr[js.Function0[Unit]] = js.native
  /* Function that will be run after the modal has opened. */
  var onAfterOpen: js.UndefOr[OnAfterOpenCallback] = js.native
  /* Function that will be run when the modal is requested to be closed, prior to actually closing. */
  var onRequestClose: js.UndefOr[
    js.Function1[/* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], Unit]
  ] = js.native
  /* String or object className to be applied to the overlay. */
  var overlayClassName: js.UndefOr[String | Classes] = js.native
  /* Function accepting the ref for the overlay */
  var overlayRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.native
  /* Function that will be called to get the parent element that the modal will be attached to. */
  var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /* String className to be applied to the portal. Defaults to "ReactModalPortal". */
  var portalClassName: js.UndefOr[String] = js.native
  /* String indicating the role of the modal, allowing the 'dialog' role to be applied if desired. Defaults to "dialog". */
  var role: js.UndefOr[String | Null] = js.native
  /* Boolean indicating if pressing the esc key should close the modal */
  var shouldCloseOnEsc: js.UndefOr[Boolean] = js.native
  /* Boolean indicating if the overlay should close the modal. Defaults to true. */
  var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.native
  /* Boolean indicating if the modal should be focused after render */
  var shouldFocusAfterRender: js.UndefOr[Boolean] = js.native
  /* Boolean indicating if the modal should restore focus to the element that had focus prior to its display. */
  var shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.native
  /* Object indicating styles to be used for the modal, divided into overlay and content styles. */
  var style: js.UndefOr[Styles] = js.native
  /* String value of data-test-id attibute to be applied to to the modal content. */
  var testId: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(isOpen: Boolean): Props = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppElement(value: HTMLElement | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appElement")(js.undefined)
        ret
    }
    @scala.inline
    def withAria(value: Aria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaHideApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHideApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHideApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHideApp")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyOpenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOpenClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyOpenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOpenClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyOpenClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOpenClassName")(null)
        ret
    }
    @scala.inline
    def withClassName(value: String | Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimeoutMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeoutMS")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRef(value: /* instance */ HTMLDivElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlOpenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOpenClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlOpenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOpenClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlOpenClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOpenClassName")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestClose(value: /* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRequestClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String | Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayRef(value: /* instance */ HTMLDivElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverlayRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRef")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSelector(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutParentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(null)
        ret
    }
    @scala.inline
    def withShouldCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCloseOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCloseOnOverlayClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCloseOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusAfterRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusAfterRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusAfterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldReturnFocusAfterClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReturnFocusAfterClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldReturnFocusAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReturnFocusAfterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Styles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(js.undefined)
        ret
    }
  }
  
}

