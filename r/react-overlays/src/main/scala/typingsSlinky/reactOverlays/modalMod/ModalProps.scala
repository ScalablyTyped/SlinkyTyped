package typingsSlinky.reactOverlays.modalMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactOverlays.mod.TransitionCallbacks
import typingsSlinky.reactOverlays.portalMod.PortalProps
import typingsSlinky.reactOverlays.reactOverlaysStrings.static
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * When `true` The modal will automatically shift focus to itself when it opens, and
    * replace it to the last focused element when it closes. This also
    * works correctly with any Modal children that have the `autoFocus` prop.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Include a backdrop component.
    */
  var backdrop: js.UndefOr[Boolean | static] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the backdrop components.
    */
  var backdropTransition: js.UndefOr[ReactComponentClass[TransitionProps]] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * A css class or set of classes applied to the modal container when the modal is open,
    * and removed when it is closed.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * When `true` The modal will prevent focus from leaving the Modal while open.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * Close the modal when escape key is pressed
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * A ModalManager instance used to track and manage the state of open
    * Modals. Useful when customizing how modals interact within a container
    */
  var manager: js.UndefOr[typingsSlinky.reactOverlays.modalManagerMod.^] = js.native
  /**
    * A callback fired when the backdrop, if specified, is clicked.
    */
  var onBackdropClick: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when the escape key, if specified in `keyboard`, is pressed.
    */
  var onEscapeKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when either the backdrop is clicked, or the escape key is pressed.
    *
    * The `onHide` callback only signals intent from the Modal,
    * you must actually set the `show` prop to `false` for the Modal to close.
    */
  var onHide: js.UndefOr[js.Function] = js.native
  /**
    * A callback fired when the Modal is opening.
    */
  var onShow: js.UndefOr[js.Function] = js.native
  /**
    * A function that returns a backdrop component. Useful for custom
    * backdrop rendering.
    *
    * ```js
    *  renderBackdrop={props => <MyBackdrop {...props} />}
    * ```
    */
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ js.Any, TagMod[Any]]] = js.native
  /**
    * A function that returns the dialog component. Useful for custom
    * rendering. **Note:** the component should make sure to apply the provided ref.
    *
    * ```js
    *  renderDialog={props => <MyDialog {...props} />}
    * ```
    */
  var renderDialog: js.UndefOr[js.Function1[/* props */ js.Any, TagMod[Any]]] = js.native
  /**
    * When `true` The modal will restore focus to previously focused element once
    * modal is hidden
    */
  var restoreFocus: js.UndefOr[Boolean] = js.native
  /**
    * Set the visibility of the Modal
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the dialog component.
    */
  var transition: js.UndefOr[ReactComponentClass[TransitionProps]] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdrop(value: Boolean | static): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropTransitionFunctionComponent(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransitionComponentClass(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransition(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
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
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: typingsSlinky.reactOverlays.modalManagerMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackdropClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBackdropClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscapeKeyDown(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEscapeKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBackdrop(value: /* props */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBackdrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDialog(value: /* props */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionFunctionComponent(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionComponentClass(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

