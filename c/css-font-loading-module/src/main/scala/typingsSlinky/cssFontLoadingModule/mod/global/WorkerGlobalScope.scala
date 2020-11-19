package typingsSlinky.cssFontLoadingModule.mod.global

import typingsSlinky.cssFontLoadingModule.mod.FontFaceSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerGlobalScope extends js.Object {
  
  var fonts: FontFaceSet = js.native
}
object WorkerGlobalScope {
  
  @scala.inline
  def apply(fonts: FontFaceSet): WorkerGlobalScope = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerGlobalScope]
  }
  
  @scala.inline
  implicit class WorkerGlobalScopeOps[Self <: WorkerGlobalScope] (val x: Self) extends AnyVal {
    
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
    def setFonts(value: FontFaceSet): Self = this.set("fonts", value.asInstanceOf[js.Any])
  }
}
