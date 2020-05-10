package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonComponentT
import typingsSlinky.devextreme.AnonIcon
import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.dropDown
import typingsSlinky.devextreme.devextremeStrings.instantly
import typingsSlinky.devextreme.devextremeStrings.useButtons
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownEditorOptions[T] extends dxTextBoxOptions[T] {
  /** Specifies whether or not the widget allows an end-user to enter a custom value. */
  var acceptCustomValue: js.UndefOr[Boolean] = js.native
  /** Specifies the way an end-user applies the selected value. */
  var applyValueMode: js.UndefOr[instantly | useButtons] = js.native
  /** Allows you to add custom buttons to the input text field. */
  @JSName("buttons")
  var buttons_dxDropDownEditorOptions: js.UndefOr[js.Array[clear | dropDown | dxTextEditorButton]] = js.native
  /** Specifies whether to render the drop-down field's content when it is displayed. If false, the content is rendered immediately. */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for the drop-down button. */
  var dropDownButtonTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** A function that is executed once the drop-down editor is closed. */
  var onClosed: js.UndefOr[js.Function1[/* e */ AnonComponentT[T], _]] = js.native
  /** A function that is executed once the drop-down editor is opened. */
  var onOpened: js.UndefOr[js.Function1[/* e */ AnonComponentT[T], _]] = js.native
  /** Specifies whether a user can open the drop-down list by clicking a text field. */
  var openOnFieldClick: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the drop-down editor is displayed. */
  var opened: js.UndefOr[Boolean] = js.native
  /** Specifies whether the drop-down button is visible. */
  var showDropDownButton: js.UndefOr[Boolean] = js.native
}

object dxDropDownEditorOptions {
  @scala.inline
  def apply[T](): dxDropDownEditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownEditorOptions[T]]
  }
  @scala.inline
  implicit class dxDropDownEditorOptionsOps[Self[t] <: dxDropDownEditorOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAcceptCustomValue(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCustomValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptCustomValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCustomValue")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyValueMode(value: instantly | useButtons): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyValueMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyValueMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyValueMode")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[clear | dropDown | dxTextEditorButton]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferRendering(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRendering: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownButtonTemplateFunction2(value: (/* buttonData */ AnonIcon, /* contentElement */ dxElement) => String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDropDownButtonTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDownButtonTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownButtonTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: /* e */ AnonComponentT[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpened(value: /* e */ AnonComponentT[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnFieldClick(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFieldClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnFieldClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFieldClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpened: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDropDownButton(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropDownButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDropDownButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropDownButton")(js.undefined)
        ret
    }
  }
  
}

