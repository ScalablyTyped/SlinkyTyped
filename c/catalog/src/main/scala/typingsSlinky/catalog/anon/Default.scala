package typingsSlinky.catalog.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends js.Object {
  
  var default: ReactComponentClass[js.Object] = js.native
}
object Default {
  
  @scala.inline
  def apply(default: ReactComponentClass[js.Object]): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: ReactComponentClass[js.Object]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
}
