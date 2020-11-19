package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivergentArrayError
  extends typingsSlinky.mongoose.mod.Error {
  
  @JSName("name")
  var name_DivergentArrayError: typingsSlinky.mongoose.mongooseStrings.DivergentArrayError = js.native
}
object DivergentArrayError {
  
  @scala.inline
  def apply(name: typingsSlinky.mongoose.mongooseStrings.DivergentArrayError): DivergentArrayError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivergentArrayError]
  }
  
  @scala.inline
  implicit class DivergentArrayErrorOps[Self <: DivergentArrayError] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.mongoose.mongooseStrings.DivergentArrayError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
