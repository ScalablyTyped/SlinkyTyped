package typingsSlinky.officeUiFabricReact.choiceGroupTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupProps extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * ID of an element to use as the aria label for this ChoiceGroup.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IChoiceGroup]] = js.native
  /**
    * The key of the option that will be initially checked.
    */
  var defaultSelectedKey: js.UndefOr[String | Double] = js.native
  /**
    * Descriptive label for the choice group.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A callback for receiving a notification when the choice has been changed.
    */
  @JSName("onChange")
  var onChange_IChoiceGroupProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
      /* option */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ] = js.native
  /**
    * Deprecated and will be removed by 07/17/2017. Use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[
    js.Function2[
      /* option */ IChoiceGroupOption, 
      /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
      Unit
    ]
  ] = js.native
  /**
    * The options for the choice group.
    */
  var options: js.UndefOr[js.Array[IChoiceGroupOption]] = js.native
  /**
    * The key of the selected option. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    */
  var selectedKey: js.UndefOr[String | Double] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IChoiceGroupProps {
  @scala.inline
  def apply(): IChoiceGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupProps]
  }
  @scala.inline
  implicit class IChoiceGroupPropsOps[Self <: IChoiceGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IChoiceGroup | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IChoiceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IChoiceGroup]): Self = {
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
    def withDefaultSelectedKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], /* option */ js.UndefOr[IChoiceGroupOption]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(
      value: (/* option */ IChoiceGroupOption, /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[IChoiceGroupOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IChoiceGroupStyleProps => Partial[IChoiceGroupStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]): Self = {
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
  }
  
}

