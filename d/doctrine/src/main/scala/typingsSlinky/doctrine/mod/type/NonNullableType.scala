package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonNullableType extends Type_ {
  
  var expression: Type_ = js.native
  
  var prefix: Boolean = js.native
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType = js.native
}
object NonNullableType {
  
  @scala.inline
  def apply(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType): NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullableType]
  }
  
  @scala.inline
  implicit class NonNullableTypeMutableBuilder[Self <: NonNullableType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.NonNullableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
