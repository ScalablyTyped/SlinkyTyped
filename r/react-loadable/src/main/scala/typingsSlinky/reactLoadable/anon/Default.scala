package typingsSlinky.reactLoadable.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default[Props] extends js.Object {
  
  var default: ReactComponentClass[Props] = js.native
}
object Default {
  
  @scala.inline
  def apply[Props](default: ReactComponentClass[Props]): Default[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[Props]]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default[_], Props] (val x: Self with Default[Props]) extends AnyVal {
    
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
    def setDefault(value: ReactComponentClass[Props]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
}
