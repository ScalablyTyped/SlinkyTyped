package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.ButtonPropsautoFocusboole
import typingsSlinky.baseui.anon.ChildrenReactNode
import typingsSlinky.baseui.anon.CloseSource
import typingsSlinky.baseui.anon.SharedStylePropsArgchildrAnimate
import typingsSlinky.baseui.baseuiStrings.`100Percentsign`
import typingsSlinky.baseui.baseuiStrings.`500px`
import typingsSlinky.baseui.baseuiStrings.alertdialog
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.backdrop
import typingsSlinky.baseui.baseuiStrings.closeButton
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.dialog
import typingsSlinky.baseui.baseuiStrings.escape_
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @js.native
  trait CLOSE_SOURCE extends StObject {
    
    var backdrop: typingsSlinky.baseui.baseuiStrings.backdrop = js.native
    
    var closeButton: typingsSlinky.baseui.baseuiStrings.closeButton = js.native
    
    var escape: escape_ = js.native
  }
  object CLOSE_SOURCE {
    
    @JSImport("baseui/modal", "CLOSE_SOURCE")
    @js.native
    val ^ : CLOSE_SOURCE = js.native
    
    @scala.inline
    implicit class CLOSE_SOURCEMutableBuilder[Self <: CLOSE_SOURCE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: backdrop): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButton(value: closeButton): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscape(value: escape_): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/modal", "FocusOnce")
  @js.native
  class FocusOnce protected ()
    extends Component[ChildrenReactNode, js.Object, js.Any] {
    def this(props: ChildrenReactNode) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChildrenReactNode, context: js.Any) = this()
  }
  
  @JSImport("baseui/modal", "Modal")
  @js.native
  class Modal protected ()
    extends Component[ModalProps, ModalState, js.Any] {
    def this(props: ModalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProps, context: js.Any) = this()
    
    def addDomEvents(): Unit = js.native
    
    def animateOutComplete(): Unit = js.native
    
    def autoFocus(): Unit = js.native
    
    def captureLastFocus(): Unit = js.native
    
    def clearTimers(): Unit = js.native
    
    def didClose(): Unit = js.native
    
    def didOpen(): Unit = js.native
    
    def disableMountNodeScroll(): Unit = js.native
    
    def getChildren(): ReactElement = js.native
    
    def getMountNode(): HTMLElement = js.native
    
    def getRef(component: String): Ref[_] = js.native
    
    def getSharedProps(): SharedStylePropsArgchildrAnimate = js.native
    
    def onBackdropClick(): Unit = js.native
    
    def onCloseClick(): Unit = js.native
    
    def onDocumentKeyPress(event: KeyboardEvent): Unit = js.native
    
    def removeDomEvents(): Unit = js.native
    
    def renderModal(): ReactElement = js.native
    
    def resentMountNodeScroll(): Unit = js.native
    
    def restoreLastFocus(): Unit = js.native
    
    @JSName("triggerClose")
    def triggerClose_backdrop(source: backdrop): Unit = js.native
    @JSName("triggerClose")
    def triggerClose_closeButton(source: closeButton): Unit = js.native
    @JSName("triggerClose")
    def triggerClose_escape(source: escape_): Unit = js.native
  }
  
  @JSImport("baseui/modal", "ModalBody")
  @js.native
  val ModalBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "ModalButton")
  @js.native
  class ModalButton protected ()
    extends Component[ButtonPropsautoFocusboole, js.Object, js.Any] {
    def this(props: ButtonPropsautoFocusboole) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonPropsautoFocusboole, context: js.Any) = this()
  }
  
  @JSImport("baseui/modal", "ModalFooter")
  @js.native
  val ModalFooter: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "ModalHeader")
  @js.native
  val ModalHeader: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait ROLE extends StObject {
    
    var alertdialog: typingsSlinky.baseui.baseuiStrings.alertdialog = js.native
    
    var dialog: typingsSlinky.baseui.baseuiStrings.dialog = js.native
  }
  object ROLE {
    
    @JSImport("baseui/modal", "ROLE")
    @js.native
    val ^ : ROLE = js.native
    
    @scala.inline
    implicit class ROLEMutableBuilder[Self <: ROLE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlertdialog(value: alertdialog): Self = StObject.set(x, "alertdialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var auto: typingsSlinky.baseui.baseuiStrings.auto = js.native
    
    var full: typingsSlinky.baseui.baseuiStrings.full = js.native
  }
  object SIZE {
    
    @JSImport("baseui/modal", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: full): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE_WIDTHS extends StObject {
    
    var default: `500px` = js.native
    
    var auto: typingsSlinky.baseui.baseuiStrings.auto = js.native
    
    var full: `100Percentsign` = js.native
  }
  object SIZE_WIDTHS {
    
    @JSImport("baseui/modal", "SIZE_WIDTHS")
    @js.native
    val ^ : SIZE_WIDTHS = js.native
    
    @scala.inline
    implicit class SIZE_WIDTHSMutableBuilder[Self <: SIZE_WIDTHS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: `500px`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: `100Percentsign`): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/modal", "StyledBackdrop")
  @js.native
  val StyledBackdrop: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "StyledClose")
  @js.native
  val StyledClose: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "StyledDialog")
  @js.native
  val StyledDialog: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "StyledDialogContainer")
  @js.native
  val StyledDialogContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/modal", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait ModalOverrides extends StObject {
    
    var Backdrop: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Close: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Dialog: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var DialogContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
  }
  object ModalOverrides {
    
    @scala.inline
    def apply(): ModalOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalOverrides]
    }
    
    @scala.inline
    implicit class ModalOverridesMutableBuilder[Self <: ModalOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
      
      @scala.inline
      def setClose(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "Close", js.undefined)
      
      @scala.inline
      def setDialog(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "DialogContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogContainerUndefined: Self = StObject.set(x, "DialogContainer", js.undefined)
      
      @scala.inline
      def setDialogUndefined: Self = StObject.set(x, "Dialog", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait ModalProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autofocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var closeable: js.UndefOr[Boolean] = js.native
    
    var focusLock: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* args */ CloseSource, _]] = js.native
    
    var overrides: js.UndefOr[ModalOverrides] = js.native
    
    var role: js.UndefOr[dialog | alertdialog] = js.native
    
    var size: js.UndefOr[default_ | full | auto] = js.native
    
    var unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      @scala.inline
      def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* args */ CloseSource => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOverrides(value: ModalOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRole(value: dialog | alertdialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSize(value: default_ | full | auto): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUnstable_ModalBackdropScroll(value: Boolean): Self = StObject.set(x, "unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_ModalBackdropScrollUndefined: Self = StObject.set(x, "unstable_ModalBackdropScroll", js.undefined)
    }
  }
  
  @js.native
  trait ModalState extends StObject {
    
    var isVisible: Boolean = js.native
    
    var mounted: Boolean = js.native
  }
  object ModalState {
    
    @scala.inline
    def apply(isVisible: Boolean, mounted: Boolean): ModalState = {
      val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalState]
    }
    
    @scala.inline
    implicit class ModalStateMutableBuilder[Self <: ModalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$animate")
    var $animate: js.UndefOr[Boolean] = js.native
    
    @JSName("$closeable")
    var $closeable: js.UndefOr[Boolean] = js.native
    
    @JSName("$isOpen")
    var $isOpen: js.UndefOr[Boolean] = js.native
    
    @JSName("$isVisible")
    var $isVisible: js.UndefOr[Boolean] = js.native
    
    @JSName("$role")
    var $role: js.UndefOr[dialog | alertdialog] = js.native
    
    @JSName("$size")
    var $size: js.UndefOr[default_ | full | auto] = js.native
    
    @JSName("$unstable_ModalBackdropScroll")
    var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object SharedStylePropsArg {
    
    @scala.inline
    def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgMutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$animate(value: Boolean): Self = StObject.set(x, "$animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$animateUndefined: Self = StObject.set(x, "$animate", js.undefined)
      
      @scala.inline
      def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
      
      @scala.inline
      def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
      
      @scala.inline
      def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
      
      @scala.inline
      def set$role(value: dialog | alertdialog): Self = StObject.set(x, "$role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$roleUndefined: Self = StObject.set(x, "$role", js.undefined)
      
      @scala.inline
      def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      @scala.inline
      def set$unstable_ModalBackdropScroll(value: Boolean): Self = StObject.set(x, "$unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$unstable_ModalBackdropScrollUndefined: Self = StObject.set(x, "$unstable_ModalBackdropScroll", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
