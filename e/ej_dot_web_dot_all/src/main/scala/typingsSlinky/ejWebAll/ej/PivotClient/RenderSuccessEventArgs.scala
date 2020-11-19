package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderSuccessEventArgs extends js.Object {
  
  /** returns the object of PivotClient control at that instant.
    */
  var args: js.UndefOr[js.Any] = js.native
}
object RenderSuccessEventArgs {
  
  @scala.inline
  def apply(): RenderSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSuccessEventArgs]
  }
  
  @scala.inline
  implicit class RenderSuccessEventArgsOps[Self <: RenderSuccessEventArgs] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
}
