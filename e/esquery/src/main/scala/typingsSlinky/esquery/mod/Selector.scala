package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.Asterisk
import typingsSlinky.esquery.esqueryStrings.`class`
import typingsSlinky.esquery.esqueryStrings.`nth-child`
import typingsSlinky.esquery.esqueryStrings.`nth-last-child`
import typingsSlinky.esquery.esqueryStrings.`type`
import typingsSlinky.esquery.esqueryStrings.adjacent
import typingsSlinky.esquery.esqueryStrings.attribute
import typingsSlinky.esquery.esqueryStrings.child
import typingsSlinky.esquery.esqueryStrings.compound
import typingsSlinky.esquery.esqueryStrings.declaration
import typingsSlinky.esquery.esqueryStrings.descendant
import typingsSlinky.esquery.esqueryStrings.expression
import typingsSlinky.esquery.esqueryStrings.field
import typingsSlinky.esquery.esqueryStrings.function
import typingsSlinky.esquery.esqueryStrings.has
import typingsSlinky.esquery.esqueryStrings.identifier
import typingsSlinky.esquery.esqueryStrings.not
import typingsSlinky.esquery.esqueryStrings.pattern
import typingsSlinky.esquery.esqueryStrings.sibling
import typingsSlinky.esquery.esqueryStrings.statement
import typingsSlinky.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Field
  - typingsSlinky.esquery.mod.Type
  - typingsSlinky.esquery.mod.Sequence
  - typingsSlinky.esquery.mod.Identifier
  - typingsSlinky.esquery.mod.Wildcard
  - typingsSlinky.esquery.mod.Attribute
  - typingsSlinky.esquery.mod.NthChild
  - typingsSlinky.esquery.mod.NthLastChild
  - typingsSlinky.esquery.mod.Descendant
  - typingsSlinky.esquery.mod.Child
  - typingsSlinky.esquery.mod.Sibling
  - typingsSlinky.esquery.mod.Adjacent
  - typingsSlinky.esquery.mod.Negation
  - typingsSlinky.esquery.mod.Matches_
  - typingsSlinky.esquery.mod.Has
  - typingsSlinky.esquery.mod.Class
*/
trait Selector extends js.Object
object Selector {
  
  @scala.inline
  def Type(`type`: `type`, value: String): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Class(name: declaration | expression | function | pattern | statement, `type`: `class`): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Attribute(name: String, `type`: attribute): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Field(name: String, `type`: field): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector], `type`: typingsSlinky.esquery.esqueryStrings.matches): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Identifier(`type`: identifier, value: String): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}
