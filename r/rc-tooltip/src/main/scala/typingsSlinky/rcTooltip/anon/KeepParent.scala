package typingsSlinky.rcTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepParent extends js.Object {
  
  var keepParent: js.UndefOr[Boolean] = js.native
}
object KeepParent {
  
  @scala.inline
  def apply(): KeepParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepParent]
  }
  
  @scala.inline
  implicit class KeepParentOps[Self <: KeepParent] (val x: Self) extends AnyVal {
    
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
    def setKeepParent(value: Boolean): Self = this.set("keepParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepParent: Self = this.set("keepParent", js.undefined)
  }
}
