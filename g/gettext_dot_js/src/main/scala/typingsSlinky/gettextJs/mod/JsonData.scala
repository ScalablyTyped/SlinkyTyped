package typingsSlinky.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonData extends JsonDataMessages {
  
  @JSName("")
  var _empty: JsonDataHeader = js.native
}
object JsonData {
  
  @scala.inline
  def apply(_empty: JsonDataHeader): JsonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonData]
  }
  
  @scala.inline
  implicit class JsonDataOps[Self <: JsonData] (val x: Self) extends AnyVal {
    
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
    def set_empty(value: JsonDataHeader): Self = this.set("", value.asInstanceOf[js.Any])
  }
}
