package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableType extends Type_ {
  
  var expression: Type_ = js.native
  
  var prefix: Boolean = js.native
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.NullableType = js.native
}
object NullableType {
  
  @scala.inline
  def apply(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NullableType): NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableType]
  }
  
  @scala.inline
  implicit class NullableTypeOps[Self <: NullableType] (val x: Self) extends AnyVal {
    
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
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.NullableType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
