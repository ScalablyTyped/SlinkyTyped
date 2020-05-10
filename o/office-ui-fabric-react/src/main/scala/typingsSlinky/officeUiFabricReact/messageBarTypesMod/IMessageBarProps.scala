package typingsSlinky.officeUiFabricReact.messageBarTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.libButtonMod.BaseButton
import typingsSlinky.officeUiFabricReact.libButtonMod.Button
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarProps extends HTMLAttributes[HTMLElement] {
  /**
    * The actions you want to show on the other side.
    */
  var actions: js.UndefOr[ReactElement] = js.native
  /**
    * A description of the message bar for the benefit of screen readers.
    * @deprecated Use native prop `aria-label` instead.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMessageBar]] = js.native
  /**
    * Aria label on dismiss button if onDismiss is defined.
    */
  var dismissButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Custom icon prop to replace the dismiss icon.
    * If unset, default will be the Fabric Clear icon.
    */
  var dismissIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Determines if the message bar is multi lined.
    * If false, and the text overflows over buttons or to another line, it is clipped.
    * @defaultvalue true
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * Custom icon prop to replace the message bar icon.
    * If unset, default will be the icon set by messageBarType.
    */
  var messageBarIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * The type of MessageBar to render.
    * @defaultvalue MessageBarType.info
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.native
  /**
    * Whether the message bar has a dismiss button and its callback.
    * If null, we don't show a dismiss button.
    * @defaultvalue null
    */
  var onDismiss: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement | BaseButton | Button]], _]
  ] = js.native
  /**
    * Aria label on overflow button if truncated is defined.
    */
  var overflowButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]] = js.native
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Determines if the message bar text is truncated.
    * If true, a button will render to toggle between a single line view and multiline view.
    * This prop is for single line message bars with no buttons only in a limited space scenario.
    * @defaultvalue false
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object IMessageBarProps {
  @scala.inline
  def apply(): IMessageBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarProps]
  }
  @scala.inline
  implicit class IMessageBarPropsOps[Self <: IMessageBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IMessageBar | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IMessageBar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IMessageBar]): Self = {
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
    def withDismissButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissIconProps")(js.undefined)
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
    def withMessageBarIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBarIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBarType(value: MessageBarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement | BaseButton | Button]] => _): Self = {
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
    def withOverflowButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IMessageBarStyleProps => Partial[IMessageBarStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]): Self = {
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
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
  }
  
}

