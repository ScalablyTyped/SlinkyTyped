package typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption
import typingsSlinky.std.Event_
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOptionProps extends IChoiceGroupOption {
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IChoiceGroupOption]] = js.native
  /**
    * Indicates if the ChoiceGroupOption should appear focused, visually
    */
  var focused: js.UndefOr[Boolean] = js.native
  /**
    * A callback for receiving a notification when the choice has lost focus.
    */
  @JSName("onBlur")
  var onBlur_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* ev */ SyntheticFocusEvent[HTMLElement], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ] = js.native
  /**
    * A callback for receiving a notification when the choice has been changed.
    */
  @JSName("onChange")
  var onChange_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event_]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ] = js.native
  /**
    * A callback for receiving a notification when the choice has received focus.
    */
  @JSName("onFocus")
  var onFocus_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement | HTMLInputElement]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      js.UndefOr[Unit]
    ]
  ] = js.native
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IChoiceGroupOptionProps {
  @scala.inline
  def apply(key: String, text: String): IChoiceGroupOptionProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionProps]
  }
  @scala.inline
  implicit class IChoiceGroupOptionPropsOps[Self <: IChoiceGroupOptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IChoiceGroupOption | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IChoiceGroupOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IChoiceGroupOption]): Self = {
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
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(
      value: (/* ev */ SyntheticFocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event_]], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit
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
    def withOnFocus(
      value: (/* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
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

