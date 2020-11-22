package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.back
import typingsSlinky.devextreme.devextremeStrings.danger
import typingsSlinky.devextreme.devextremeStrings.default
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxButtonGroupItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxButtonGroupItem.hint]
    */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxButtonGroupItem.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxButtonGroupItem.type]
    */
  var `type`: js.UndefOr[back | danger | default | normal | success] = js.native
}
object dxButtonGroupItem {
  
  @scala.inline
  def apply(): dxButtonGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupItem]
  }
  
  @scala.inline
  implicit class dxButtonGroupItemOps[Self <: dxButtonGroupItem] (val x: Self) extends AnyVal {
    
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
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setType(value: back | danger | default | normal | success): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
