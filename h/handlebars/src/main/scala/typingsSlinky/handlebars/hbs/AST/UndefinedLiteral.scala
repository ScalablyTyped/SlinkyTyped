package typingsSlinky.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndefinedLiteral extends Node {
  
  @JSName("type")
  var type_UndefinedLiteral: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral = js.native
}
object UndefinedLiteral {
  
  @scala.inline
  def apply(loc: SourceLocation, `type`: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  @scala.inline
  implicit class UndefinedLiteralMutableBuilder[Self <: UndefinedLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.handlebars.handlebarsStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
