package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllLiteral extends Type_ {
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral = js.native
}
object AllLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral): AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllLiteral]
  }
  
  @scala.inline
  implicit class AllLiteralMutableBuilder[Self <: AllLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.AllLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
