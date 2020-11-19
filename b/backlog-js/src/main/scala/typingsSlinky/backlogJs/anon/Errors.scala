package typingsSlinky.backlogJs.anon

import typingsSlinky.backlogJs.mod.Error.BacklogErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends js.Object {
  
  var errors: js.Array[BacklogErrorMessage] = js.native
}
object Errors {
  
  @scala.inline
  def apply(errors: js.Array[BacklogErrorMessage]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: BacklogErrorMessage*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[BacklogErrorMessage]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
}
