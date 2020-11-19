package typingsSlinky.activexOffice.anon

import typingsSlinky.activexOffice.Office.CustomTaskPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTaskPaneInst extends js.Object {
  
  val CustomTaskPaneInst: CustomTaskPane = js.native
}
object CustomTaskPaneInst {
  
  @scala.inline
  def apply(CustomTaskPaneInst: CustomTaskPane): CustomTaskPaneInst = {
    val __obj = js.Dynamic.literal(CustomTaskPaneInst = CustomTaskPaneInst.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTaskPaneInst]
  }
  
  @scala.inline
  implicit class CustomTaskPaneInstOps[Self <: CustomTaskPaneInst] (val x: Self) extends AnyVal {
    
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
    def setCustomTaskPaneInst(value: CustomTaskPane): Self = this.set("CustomTaskPaneInst", value.asInstanceOf[js.Any])
  }
}
