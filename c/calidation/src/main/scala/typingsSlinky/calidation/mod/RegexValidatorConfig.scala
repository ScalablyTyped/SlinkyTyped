package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  
  var regex: js.RegExp = js.native
}
object RegexValidatorConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](message: String, regex: js.RegExp): RegexValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class RegexValidatorConfigOps[Self <: RegexValidatorConfig[_], T /* <: js.Object */] (val x: Self with RegexValidatorConfig[T]) extends AnyVal {
    
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
    def setRegex(value: js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
