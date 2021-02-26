package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndefinedLiteral extends Type_ {
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral = js.native
}
object UndefinedLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  @scala.inline
  implicit class UndefinedLiteralMutableBuilder[Self <: UndefinedLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
