package typingsSlinky.divaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivaState extends js.Object {
  
  var toolbar: Null = js.native
  
  var viewerCore: typingsSlinky.divaJs.viewerCoreMod.default = js.native
}
object DivaState {
  
  @scala.inline
  def apply(toolbar: Null, viewerCore: typingsSlinky.divaJs.viewerCoreMod.default): DivaState = {
    val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any], viewerCore = viewerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivaState]
  }
  
  @scala.inline
  implicit class DivaStateOps[Self <: DivaState] (val x: Self) extends AnyVal {
    
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
    def setToolbar(value: Null): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerCore(value: typingsSlinky.divaJs.viewerCoreMod.default): Self = this.set("viewerCore", value.asInstanceOf[js.Any])
  }
}
