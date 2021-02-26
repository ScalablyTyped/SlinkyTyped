package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
*/
trait LiteralKind extends StObject
object LiteralKind {
  
  @scala.inline
  def BigIntLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  @scala.inline
  def JSXText(`type`: typingsSlinky.astTypes.astTypesStrings.JSXText, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  @scala.inline
  def Literal(`type`: typingsSlinky.astTypes.astTypesStrings.Literal): typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  @scala.inline
  def NullLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NullLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral, value: Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
}
