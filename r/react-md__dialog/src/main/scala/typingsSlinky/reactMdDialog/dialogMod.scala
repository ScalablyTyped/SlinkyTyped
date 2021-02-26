package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactMdDialog.anon.PickBaseDialogPropshidden
import typingsSlinky.reactMdDialog.anon.PickBaseDialogPropshiddenAbout
import typingsSlinky.reactMdDialog.reactMdDialogStrings.`full-page`
import typingsSlinky.reactMdDialog.reactMdDialogStrings.alertdialog
import typingsSlinky.reactMdDialog.reactMdDialogStrings.centered
import typingsSlinky.reactMdDialog.reactMdDialogStrings.custom
import typingsSlinky.reactMdDialog.reactMdDialogStrings.dialog
import typingsSlinky.reactMdDialog.reactMdDialogStrings.div
import typingsSlinky.reactMdDialog.reactMdDialogStrings.first
import typingsSlinky.reactMdDialog.reactMdDialogStrings.last
import typingsSlinky.reactMdDialog.reactMdDialogStrings.menu
import typingsSlinky.reactMdDialog.reactMdDialogStrings.nav
import typingsSlinky.reactMdDialog.reactMdDialogStrings.none
import typingsSlinky.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typingsSlinky.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typingsSlinky.reactMdUtils.focusContainerMod.FocusContainerOptionsProps
import typingsSlinky.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@react-md/dialog/types/Dialog", "Dialog")
  @js.native
  val Dialog: ForwardRefExoticComponent[PickBaseDialogPropshidden | PickBaseDialogPropshiddenAbout] = js.native
  
  @js.native
  trait BaseDialogProps
    extends HTMLAttributes[HTMLDivElement]
       with OverridableCSSTransitionProps
       with RenderConditionalPortalProps
       with FocusContainerOptionsProps {
    
    /**
      * The component to render the dialog as. This really shouldn't be used
      * outside of the `@react-md/layout` and `@react-md/sheet` packages to
      * conditionally render a navigation panel.
      */
    var component: js.UndefOr[div | nav] = js.native
    
    /**
      * An optional className to apply to the dialog container when the `type` is
      * set to `"centered"` or when the `forceContainer` prop is enabled. You
      * probably don't want to use this prop in most cases.
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to apply to the dialog container when the `type` is set
      * to `"centered"` or when the `forceContainer` prop is enabled. You probably
      * don't want to use this prop in most cases.
      */
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Either the "first" or "last" string to focus the first or last focusable
      * element within the container or a query selector string to find a focusable
      * element within the container.
      */
    @JSName("defaultFocus")
    var defaultFocus_BaseDialogProps: js.UndefOr[first | last | String] = js.native
    
    /**
      * Boolean if the ability to close the dialog via the escape key should be
      * disabled. You should really not be using this as it breaks accessibility in
      * most cases.
      *
      * Note: When the `modal` prop is enabled, this flag will be considered `true`
      * as well so that the escape keypress no longer closes the dialog.
      */
    var disableEscapeClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the dialog's focus container logic should be disabled. This
      * should normally be kept at the default of `false` unless implementing a
      * custom dialog that does not require consistent user focus.
      */
    var disableFocusContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * The Dialog component will attempt to automatically fix nested dialogs
      * behind the scenes using the `NestedDialogContextProvider` component. This
      * prop will disable that feature if it does not seem to be working as
      * expected.
      */
    var disableNestedDialogFixes: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the dialog should no longer add scroll locking to the page when
      * visible. You normally want this prop to stay `false`, but it is useful when
      * using custom dialogs that are more for popovers and don't require full user
      * attention.
      */
    var disableScrollLock: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the `appear`, `enter`, and `exit` transitions should be disabled
      * for the dialog.  This is just a shortcut so all three of those props don't
      * need to be disabled.
      */
    var disableTransition: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the dialog should be "forcefully" wrapped in the
      * `.md-dialog-container` element. You probably don't want to use this in most
      * cases, but the container element will be used when the `type` prop is set
      * to `"centered"`.
      */
    var forceContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * An id required for a11y for the dialog.
      */
    @JSName("id")
    var id_BaseDialogProps: String = js.native
    
    /**
      * Boolean if the dialog should act as a modal. This means that the user will
      * no longer be able to close the dialog by pressing the escape key or by
      * clicking on the overlay. You will be required to update the dialog to have
      * an action that closes the dialog instead.
      */
    var modal: js.UndefOr[Boolean] = js.native
    
    /**
      * A function used to close the dialog when the overlay is clicked or the
      * escape key is pressed when the `modal` prop is not enabled.
      */
    def onRequestClose(): Unit = js.native
    
    /**
      * Boolean if there should be an overlay displayed with the sheet. This is
      * recommended/required on mobile devices.
      */
    var overlay: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional className to apply to the overlay.
      */
    var overlayClassName: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the overlay should be "hidden" from the user once it's visible
      * be keeping the opacity set to `0`. This is really only used for custom
      * dialogs like the `FixedDialog`.
      */
    var overlayHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional style to apply to the overlay.
      */
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * The role for the dialog component. This should normally stay as the default
      * of `"dialog"` **unless** you want the screen reader to interrupt the normal
      * workflow for this message. It is good to set this value to `"alertdialog"`
      * error message confirmations or general confirmation prompts.
      *
      * Note: The `dialog` technically supports being rendered as a `menu`, but
      * this is really only for mobile sheet support and will not provide the menu
      * keyboard functionality automatically.
      */
    @JSName("role")
    var role_BaseDialogProps: js.UndefOr[dialog | alertdialog | menu | none] = js.native
    
    /**
      * The display type for the modal. If you would like to position the modal in
      * different locations within the page, you should set this prop to `"custom"`
      * and add custom styles to position it instead.
      */
    var `type`: js.UndefOr[`full-page` | centered | custom] = js.native
    
    /**
      * Boolean if the dialog is currently visible.
      */
    var visible: Boolean = js.native
  }
  object BaseDialogProps {
    
    @scala.inline
    def apply(id: String, onRequestClose: () => Unit, visible: Boolean): BaseDialogProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDialogProps]
    }
    
    @scala.inline
    implicit class BaseDialogPropsMutableBuilder[Self <: BaseDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: div | nav): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      @scala.inline
      def setDisableEscapeClose(value: Boolean): Self = StObject.set(x, "disableEscapeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEscapeCloseUndefined: Self = StObject.set(x, "disableEscapeClose", js.undefined)
      
      @scala.inline
      def setDisableFocusContainer(value: Boolean): Self = StObject.set(x, "disableFocusContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusContainerUndefined: Self = StObject.set(x, "disableFocusContainer", js.undefined)
      
      @scala.inline
      def setDisableNestedDialogFixes(value: Boolean): Self = StObject.set(x, "disableNestedDialogFixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNestedDialogFixesUndefined: Self = StObject.set(x, "disableNestedDialogFixes", js.undefined)
      
      @scala.inline
      def setDisableScrollLock(value: Boolean): Self = StObject.set(x, "disableScrollLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollLockUndefined: Self = StObject.set(x, "disableScrollLock", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setForceContainer(value: Boolean): Self = StObject.set(x, "forceContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceContainerUndefined: Self = StObject.set(x, "forceContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayHidden(value: Boolean): Self = StObject.set(x, "overlayHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayHiddenUndefined: Self = StObject.set(x, "overlayHidden", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setRole(value: dialog | alertdialog | menu | none): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setType(value: `full-page` | centered | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type DialogProps = LabelRequiredForA11y[BaseDialogProps]
}
