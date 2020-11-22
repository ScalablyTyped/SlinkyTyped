package typingsSlinky.reactSpringShared.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForEach extends js.Object {
  
  var forEach: js.UndefOr[js.Function] = js.native
}
object ForEach {
  
  @scala.inline
  def apply(): ForEach = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForEach]
  }
  
  @scala.inline
  implicit class ForEachOps[Self <: ForEach] (val x: Self) extends AnyVal {
    
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
    def setForEach(value: js.Function): Self = this.set("forEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForEach: Self = this.set("forEach", js.undefined)
  }
}
