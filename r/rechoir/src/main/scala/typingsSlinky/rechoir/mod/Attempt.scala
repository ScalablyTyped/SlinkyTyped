package typingsSlinky.rechoir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attempt extends js.Object {
  
  var error: js.Error | Null = js.native
  
  var module: js.Any = js.native
  
  var moduleName: String = js.native
}
object Attempt {
  
  @scala.inline
  def apply(module: js.Any, moduleName: String): Attempt = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
  
  @scala.inline
  implicit class AttemptOps[Self <: Attempt] (val x: Self) extends AnyVal {
    
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
    def setModule(value: js.Any): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
