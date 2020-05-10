package typingsSlinky.officeUiFabricReact.dialogTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogBaseMod.DialogBase
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogProps
  extends ClassAttributes[DialogBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
  /**
    * Optional id for aria-DescribedBy
    * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
    */
  var ariaDescribedById: js.UndefOr[String] = js.native
  /**
    * Optional id for aria-LabelledBy
    * @deprecated Pass through via `modalProps.titleAriaId` instead.
    */
  var ariaLabelledById: js.UndefOr[String] = js.native
  /**
    * Optional class name to be added to the root class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IDialog interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    * @deprecated Unused, returns no value
    */
  var componentRef: js.UndefOr[IRefObject[IDialog]] = js.native
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * Props to be passed through to Dialog Content
    */
  var dialogContentProps: js.UndefOr[IDialogContentProps] = js.native
  /**
    * Whether the dialog is hidden.
    * @defaultvalue true
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    * @deprecated Pass through via `modalProps` instead
    */
  var isBlocking: js.UndefOr[Boolean] = js.native
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
    * @deprecated Pass through via `modalProps` instead
    */
  var isDarkOverlay: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dialog is displayed.
    * Deprecated, use `hidden` instead.
    * @defaultvalue false
    * @deprecated Use `hidden` instead
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Sets the maximum width for the dialog. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the minimum width of the dialog. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Props to be passed through to Modal
    */
  var modalProps: js.UndefOr[IModalProps] = js.native
  /**
    * A callback function for when the Dialog is dismissed from the close button or light dismiss.
    * Can also be specified separately in content and modal.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]], _]] = js.native
  /**
    * A callback function which is called after the Dialog is dismissed and the animation is complete.
    * @deprecated Pass through via `modalProps` instead
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.native
  /**
    * A callback function for when the Dialog content is mounted on the overlay layer
    * @deprecated Pass through via `modalProps.layerProps` instead
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Deprecated at 0.81.2, use `onLayerDidMount` instead.
    * @deprecated Use `onLayerDidMount` instead.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]] = js.native
  /**
    * The subtext to display in the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var subText: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The title text to display at the top of the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  /**
    * Other top buttons that will show up next to the close button
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.native
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var `type`: js.UndefOr[DialogType] = js.native
}

object IDialogProps {
  @scala.inline
  def apply(): IDialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogProps]
  }
  @scala.inline
  implicit class IDialogPropsOps[Self <: IDialogProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaDescribedById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedById")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledById")(js.undefined)
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
    def withComponentRefFunction1(value: /* ref */ IDialog | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IDialog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IDialog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
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
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogContentProps(value: IDialogContentProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogContentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBlocking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDarkOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDarkOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDarkOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDarkOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModalProps(value: IModalProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismissed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismissed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayerDidMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayerMounted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDialogStyleProps => Partial[IDialogStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withSubText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subText")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTopButtonsProps(value: js.Array[IButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topButtonsProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopButtonsProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topButtonsProps")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DialogType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

