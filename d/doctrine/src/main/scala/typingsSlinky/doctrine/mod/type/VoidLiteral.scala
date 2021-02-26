package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidLiteral extends Type_ {
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral = js.native
}
object VoidLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidLiteral]
  }
  
  @scala.inline
  implicit class VoidLiteralMutableBuilder[Self <: VoidLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.VoidLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
