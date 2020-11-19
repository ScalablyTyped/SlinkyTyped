package typingsSlinky.awesomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replace extends js.Object {
  
  def replace(arg0: js.RegExp, arg1: String): Unit = js.native
}
object Replace {
  
  @scala.inline
  def apply(replace: (js.RegExp, String) => Unit): Replace = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[Replace]
  }
  
  @scala.inline
  implicit class ReplaceOps[Self <: Replace] (val x: Self) extends AnyVal {
    
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
    def setReplace(value: (js.RegExp, String) => Unit): Self = this.set("replace", js.Any.fromFunction2(value))
  }
}
