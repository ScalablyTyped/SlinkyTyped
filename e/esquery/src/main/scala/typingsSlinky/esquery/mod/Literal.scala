package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.StringLiteral
  - typingsSlinky.esquery.mod.NumericLiteral
*/
trait Literal extends StObject
object Literal {
  
  @scala.inline
  def NumericLiteral(`type`: literal, value: Double): typingsSlinky.esquery.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.NumericLiteral]
  }
  
  @scala.inline
  def StringLiteral(`type`: literal, value: String): typingsSlinky.esquery.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.StringLiteral]
  }
}
