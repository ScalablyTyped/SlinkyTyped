package typingsSlinky.officeUiFabricReact.dialogContentTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogContentBaseMod.DialogContentBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogContentProps extends ClassAttributes[DialogContentBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Label to be passed to to aria-label of close button
    * @defaultvalue Close
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IDialogContent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IDialogContent]] = js.native
  /**
    * The classname for when the header is draggable
    */
  var draggableHeaderClassName: js.UndefOr[String] = js.native
  /**
    * Is inside a multiline wrapper
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * Callback for when the Dialog is dismissed from the close button or light dismiss, before the animation completes.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]], _]] = js.native
  /**
    * Responsive mode passed in from decorator.
    */
  var responsiveMode: js.UndefOr[typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
  /**
    * Show an 'x' close button in the upper-right corner
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]] = js.native
  /**
    * The subtext to display in the dialog
    */
  var subText: js.UndefOr[String] = js.native
  /**
    * The Id for subText container
    */
  var subTextId: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The title text to display at the top of the dialog.
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  /**
    * The Id for title container
    *
    * @deprecated use the `id` attribute in `titleProps` instead.
    */
  var titleId: js.UndefOr[String] = js.native
  /**
    * The props for title container.
    */
  var titleProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    * Other top buttons that will show up next to the close button
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.native
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    */
  var `type`: js.UndefOr[DialogType] = js.native
}

object IDialogContentProps {
  @scala.inline
  def apply(): IDialogContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogContentProps]
  }
  @scala.inline
  implicit class IDialogContentPropsOps[Self <: IDialogContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCloseButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IDialogContent | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IDialogContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IDialogContent]): Self = {
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
    def withDraggableHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableHeaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableHeaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(js.undefined)
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
    def withResponsiveMode(value: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDialogContentStyleProps => Partial[IDialogContentStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]): Self = {
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
    def withSubTextId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTextId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTextId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTextId")(js.undefined)
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
    def withTitleProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
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

