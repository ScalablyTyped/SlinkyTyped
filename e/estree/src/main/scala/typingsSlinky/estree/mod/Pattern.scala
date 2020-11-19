package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.ObjectPattern
  - typingsSlinky.estree.mod.ArrayPattern
  - typingsSlinky.estree.mod.RestElement
  - typingsSlinky.estree.mod.AssignmentPattern
  - typingsSlinky.estree.mod.MemberExpression
*/
trait Pattern extends Node
object Pattern {
  
  @scala.inline
  def ArrayPattern(elements: js.Array[Pattern], `type`: typingsSlinky.estree.estreeStrings.ArrayPattern): Pattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectPattern
  ): Pattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typingsSlinky.estree.estreeStrings.RestElement): Pattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typingsSlinky.estree.estreeStrings.AssignmentPattern): Pattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.estree.estreeStrings.Identifier): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typingsSlinky.estree.estreeStrings.MemberExpression
  ): Pattern = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}
