package typingsSlinky.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnOptions extends js.Object {
  
  var customAlignment: js.Any = js.native
  
  var customWidth: js.Any = js.native
}
object ColumnOptions {
  
  @scala.inline
  def apply(customAlignment: js.Any, customWidth: js.Any): ColumnOptions = {
    val __obj = js.Dynamic.literal(customAlignment = customAlignment.asInstanceOf[js.Any], customWidth = customWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOptions]
  }
  
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomAlignment(value: js.Any): Self = this.set("customAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomWidth(value: js.Any): Self = this.set("customWidth", value.asInstanceOf[js.Any])
  }
}
