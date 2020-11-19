package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalType extends Type_ {
  
  var expression: Type_ = js.native
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType = js.native
}
object OptionalType {
  
  @scala.inline
  def apply(expression: Type_, `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
  
  @scala.inline
  implicit class OptionalTypeOps[Self <: OptionalType] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: Type_): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.OptionalType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
