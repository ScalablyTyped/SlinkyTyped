package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNotStartedError extends js.Object {
  
  val code_3: String = js.native
}
object TypeofNotStartedError {
  
  @scala.inline
  def apply(code_3: String): TypeofNotStartedError = {
    val __obj = js.Dynamic.literal(code_3 = code_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNotStartedError]
  }
  
  @scala.inline
  implicit class TypeofNotStartedErrorOps[Self <: TypeofNotStartedError] (val x: Self) extends AnyVal {
    
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
    def setCode_3(value: String): Self = this.set("code_3", value.asInstanceOf[js.Any])
  }
}
