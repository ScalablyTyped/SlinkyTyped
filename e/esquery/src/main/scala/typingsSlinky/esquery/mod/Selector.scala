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
import org.scalablytyped.runtime.StObject
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
trait Selector extends StObject
object Selector {
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): typingsSlinky.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Adjacent]
  }
  
  @scala.inline
  def Attribute(name: String, `type`: attribute): typingsSlinky.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Attribute]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): typingsSlinky.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Child]
  }
  
  @scala.inline
  def Class(name: declaration | expression | function | pattern | statement, `type`: `class`): typingsSlinky.esquery.mod.Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Class]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): typingsSlinky.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Descendant]
  }
  
  @scala.inline
  def Field(name: String, `type`: field): typingsSlinky.esquery.mod.Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Field]
  }
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): typingsSlinky.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Has]
  }
  
  @scala.inline
  def Identifier(`type`: identifier, value: String): typingsSlinky.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Identifier]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector], `type`: typingsSlinky.esquery.esqueryStrings.matches): typingsSlinky.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Matches_]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not): typingsSlinky.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Negation]
  }
  
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`): typingsSlinky.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.NthChild]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`): typingsSlinky.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.NthLastChild]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): typingsSlinky.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Sequence]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): typingsSlinky.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Sibling]
  }
  
  @scala.inline
  def Type(`type`: `type`, value: String): typingsSlinky.esquery.mod.Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Type]
  }
  
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk): typingsSlinky.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Wildcard]
  }
}
