package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ColumnComponentElement
import typingsSlinky.devextreme.anon.ColumnDxTreeListColumn
import typingsSlinky.devextreme.anon.KeyRow
import typingsSlinky.devextreme.devextremeStrings.add
import typingsSlinky.devextreme.devextremeStrings.cancel
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.edit
import typingsSlinky.devextreme.devextremeStrings.save
import typingsSlinky.devextreme.devextremeStrings.undelete
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListColumnButton extends GridBaseColumnButton {
  /** The name used to identify a built-in button. */
  var name: js.UndefOr[add | cancel | delete | edit | save | undelete | String] = js.native
  /** A function that is executed when the button is clicked or tapped. Not executed if a template is used. */
  var onClick: js.UndefOr[(js.Function1[/* e */ ColumnComponentElement, _]) | String] = js.native
  /** Specifies a custom button template. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery])
  ] = js.native
  /** Specifies the button's visibility. */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ ColumnDxTreeListColumn, Boolean])] = js.native
}

object dxTreeListColumnButton {
  @scala.inline
  def apply(): dxTreeListColumnButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListColumnButton]
  }
  @scala.inline
  implicit class dxTreeListColumnButtonOps[Self <: dxTreeListColumnButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: add | cancel | delete | edit | save | undelete | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* e */ ColumnComponentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: (js.Function1[/* e */ ColumnComponentElement, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ KeyRow) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleFunction1(value: /* options */ ColumnDxTreeListColumn => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean | (js.Function1[/* options */ ColumnDxTreeListColumn, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

