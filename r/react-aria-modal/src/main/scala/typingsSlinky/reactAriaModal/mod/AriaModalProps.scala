package typingsSlinky.reactAriaModal.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAriaModal.reactAriaModalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaModalProps extends js.Object {
  /**
    * If true, the modal will receive a role of alertdialog,
    * instead of its default dialog.
    */
  var alert: js.UndefOr[Boolean] = js.native
  /**
    * Provide your main application node here (which the modal should
    * render outside of), and when the modal is open this application
    * node will receive the attribute `aria-hidden="true"`.
    * This can help screen readers understand what's going on.
    */
  var applicationNode: js.UndefOr[Node | Element] = js.native
  /**
    * Apply a class to the dialog in order to custom-style it.
    *
    * Be aware that, _by default_, this module does apply various
    * inline styles to the dialog element in order position it.
    * To disable _all inline styles_, see `includeDefaultStyles`.
    */
  var dialogClass: js.UndefOr[String] = js.native
  /**
    * Choose your own id attribute for the dialog element.
    *
    * Default: `react-aria-modal-dialog`.
    */
  var dialogId: js.UndefOr[String] = js.native
  /**
    * Customize properties of the style prop that is passed to the dialog.
    */
  var dialogStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * By default, the Escape key exits the modal. Pass `false`, and it won't.
    */
  var escapeExits: js.UndefOr[Boolean] = js.native
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. However, if `focusDialog` is true, the dialog itself
    * will receive initial focus — and that focus will be hidden.
    * (This is essentially what Bootstrap does with their modal.)
    */
  var focusDialog: js.UndefOr[Boolean] = js.native
  /**
    * Customize properties of the focusTrapOptions prop that is passed to the modal dialog's focus trap.
    * For example, you can use this prop if you need better control of where focus is returned.
    */
  var focusTrapOptions: js.UndefOr[js.Object] = js.native
  /**
    * If true, the modal dialog's focus trap will be paused.
    * You won't typically need to use this prop. It used to be that the typical reason for pausing a focus trap was to enable nested focus traps;
    * but as of focus-trap v4, the pausing and unpausing of hierachical traps is handled automatically.
    */
  var focusTrapPaused: js.UndefOr[Boolean] = js.native
  /**
    * Same as `applicationNode`, but a function that returns the node
    * instead of the node itself. This can be useful or necessary in
    * a variety of situations, one of which is server-side React
    * rendering. The function will not be called until after the
    * component mounts, so it is safe to use browser globals
    * and refer to DOM nodes within it (e.g. `document.getElementById(..)`),
    * without ruining your server-side rendering.
    */
  var getApplicationNode: js.UndefOr[js.Function0[Node | Element]] = js.native
  /**
    * By default, styles are applied inline to the dialog and underlay
    * portions of the component. However, you can disable all inline
    * styles by setting `includeDefaultStyles` to false. If set, you
    * must specify all styles externally, including positioning.
    * This is helpful if your project uses external CSS assets.
    *
    * _Note_: underlayStyle and dialogStyle can still be set inline,
    * but these will be the only styles applied.
    */
  var includeDefaultStyles: js.UndefOr[Boolean] = js.native
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. If, instead, you want to identify a specific element
    * that should receive initial focus, pass a selector string to this
    * prop. (That selector is passed to `document.querySelector()` to find
    * the DOM node.)
    */
  var initialFocus: js.UndefOr[String] = js.native
  /**
    * By default, the modal is active when mounted, deactivated when unmounted.
    * However, you can also control its active/inactive state by changing
    * its mounted property instead.
    */
  var mounted: js.UndefOr[Boolean] = js.native
  /**
    * This function is called in the modal's `componentDidMount()` lifecycle method.
    * You can use it to do whatever diverse and sundry things you feel like
    * doing after the modal activates.
    */
  var onEnter: js.UndefOr[js.Function0[_]] = js.native
  /**
    * This function needs to handles the state change of exiting (or deactivating) the modal.
    * Maybe it's just a wrapper around `setState()`; or maybe you use some more involved
    * Flux-inspired state management — whatever the case, this module leaves the state
    * management up to you instead of making assumptions.
    * That also makes it easier to create your own "close modal" buttons; because you
    * have the function that closes the modal right there, written by you, at your disposal.
    */
  var onExit: js.UndefOr[js.Function0[_]] = js.native
  /**
    * If true, the modal dialog will prevent any scrolling behind the modal window.
    */
  var scrollDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The `id` of the element that should be used as the modal's accessible
    * title. This value is passed to the modal's `aria-labelledby` attribute.
    * You must use either `titleId` or `titleText`, but not both.
    */
  var titleId: js.UndefOr[String] = js.native
  /**
    * A string to use as the modal's accessible title. This value is passed
    * to the modal's `aria-label` attribute. You must use either `titleId` or
    * `titleText`, but not both.
    */
  var titleText: js.UndefOr[String] = js.native
  /**
    * Apply a class to the underlay in order to custom-style it.
    * This module does apply various inline styles, though, so be aware that
    * overriding some styles might be difficult. If, for example, you want
    * to change the underlay's color, you should probably use the
    * `underlayColor` prop instead of a class.
    * If you would rather control all CSS, see `includeDefaultStyles`.
    */
  var underlayClass: js.UndefOr[String] = js.native
  /**
    * By default, a click on the underlay will exit the modal.
    * Pass `false`, and clicking on the underlay will do nothing.
    */
  var underlayClickExits: js.UndefOr[Boolean] = js.native
  /**
    * If you want to change the underlay's color, you can
    * do that with this prop. If `false`, no background color will be
    * applied with inline styles. Presumably you will apply then
    * yourself via an `underlayClass`.
    *
    * Default: rgba(0,0,0,0.5)
    */
  var underlayColor: js.UndefOr[String | `false`] = js.native
  /**
    * Customize properties of the `style` prop that is passed to the underlay.
    * The best way to add some vertical displacement to the dialog is to add
    * top & bottom padding to the underlay.
    * This is illustrated in the demo examples.
    */
  var underlayStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * If `true`, the modal's contents will be vertically (as well as horizontally) centered.
    */
  var verticallyCenter: js.UndefOr[Boolean] = js.native
}

object AriaModalProps {
  @scala.inline
  def apply(): AriaModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaModalProps]
  }
  @scala.inline
  implicit class AriaModalPropsOps[Self <: AriaModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationNodeNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationNodeElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationNode(value: Node | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogId")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeExits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeExits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeExits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeExits")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTrapOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTrapOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTrapPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTrapPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApplicationNode(value: () => Node | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplicationNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetApplicationNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplicationNode")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDefaultStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefaultStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayClickExits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayClickExits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayClickExits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayClickExits")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticallyCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticallyCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyCenter")(js.undefined)
        ret
    }
  }
  
}

