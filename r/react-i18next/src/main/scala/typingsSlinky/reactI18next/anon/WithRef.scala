package typingsSlinky.reactI18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithRef extends js.Object {
  
  var withRef: js.UndefOr[Boolean] = js.native
}
object WithRef {
  
  @scala.inline
  def apply(): WithRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithRef]
  }
  
  @scala.inline
  implicit class WithRefOps[Self <: WithRef] (val x: Self) extends AnyVal {
    
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
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
}
