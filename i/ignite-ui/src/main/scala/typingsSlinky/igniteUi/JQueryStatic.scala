package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  var ig: IgniteUIStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(ig: IgniteUIStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(ig = ig.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
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
    def setIg(value: IgniteUIStatic): Self = this.set("ig", value.asInstanceOf[js.Any])
  }
}
