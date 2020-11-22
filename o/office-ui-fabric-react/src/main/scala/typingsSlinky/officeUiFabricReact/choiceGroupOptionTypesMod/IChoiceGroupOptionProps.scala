package typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
      /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IChoiceGroupOption | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IChoiceGroupOption]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[IChoiceGroupOption]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setOnBlur(
      value: (/* ev */ SyntheticFocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit
    ): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(
      value: (/* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit]
    ): Self = this.set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
