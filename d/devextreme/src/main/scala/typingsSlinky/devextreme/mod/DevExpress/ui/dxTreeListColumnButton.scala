package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ColumnComponentElement
import typingsSlinky.devextreme.anon.KeyRow
import typingsSlinky.devextreme.anon.`15`
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeListColumnButton extends GridBaseColumnButton {
  
  /**
    * [descr:dxTreeListColumnButton.name]
    */
  var name: js.UndefOr[add | cancel | delete | edit | save | undelete | String] = js.native
  
  /**
    * [descr:dxTreeListColumnButton.onClick]
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ ColumnComponentElement, _]) | String] = js.native
  
  /**
    * [descr:dxTreeListColumnButton.template]
    */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxTreeListColumnButton.visible]
    */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ `15`, Boolean])] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: add | cancel | delete | edit | save | undelete | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnClickFunction1(value: /* e */ ColumnComponentElement => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ ColumnComponentElement, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ KeyRow) => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateElement(value: Element): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setVisibleFunction1(value: /* options */ `15` => Boolean): Self = this.set("visible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Boolean | (js.Function1[/* options */ `15`, Boolean])): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
