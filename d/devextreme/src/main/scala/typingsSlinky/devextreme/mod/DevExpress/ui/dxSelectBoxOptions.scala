package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.CustomItem
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSelectBoxOptions[T] extends dxDropDownListOptions[T] {
  /** Specifies a custom template for the text field. Must contain the TextBox widget. */
  var fieldTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** A function that is executed when a user adds a custom item. Requires acceptCustomValue to be set to true. */
  var onCustomItemCreating: js.UndefOr[js.Function1[/* e */ CustomItem[T], _]] = js.native
  /** Specifies whether or not to display selection controls. */
  var showSelectionControls: js.UndefOr[Boolean] = js.native
}

object dxSelectBoxOptions {
  @scala.inline
  def apply[T](): dxSelectBoxOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSelectBoxOptions[T]]
  }
  @scala.inline
  implicit class dxSelectBoxOptionsOps[Self[t] <: dxSelectBoxOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFieldTemplateFunction2(value: (/* selectedItem */ js.Any, /* fieldElement */ dxElement) => String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFieldTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCustomItemCreating(value: /* e */ CustomItem[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomItemCreating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCustomItemCreating: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomItemCreating")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectionControls(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectionControls: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionControls")(js.undefined)
        ret
    }
  }
  
}

