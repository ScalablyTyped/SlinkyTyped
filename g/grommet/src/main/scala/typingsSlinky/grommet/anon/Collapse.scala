package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapse extends js.Object {
  
  var collapse: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var expand: js.UndefOr[js.Any] = js.native
}
object Collapse {
  
  @scala.inline
  def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  
  @scala.inline
  implicit class CollapseOps[Self <: Collapse] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: js.Any): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setExpand(value: js.Any): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
  }
}
