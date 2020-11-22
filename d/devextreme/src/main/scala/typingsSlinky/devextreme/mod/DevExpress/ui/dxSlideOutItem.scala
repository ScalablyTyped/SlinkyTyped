package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOutItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxSlideOutItem.menuTemplate]
    */
  var menuTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
}
object dxSlideOutItem {
  
  @scala.inline
  def apply(): dxSlideOutItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutItem]
  }
  
  @scala.inline
  implicit class dxSlideOutItemOps[Self <: dxSlideOutItem] (val x: Self) extends AnyVal {
    
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
    def setMenuTemplateElement(value: Element): Self = this.set("menuTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuTemplateFunction0(value: () => String | Element | JQuery): Self = this.set("menuTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMenuTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
    ): Self = this.set("menuTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuTemplate: Self = this.set("menuTemplate", js.undefined)
  }
}
