package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
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
  def ArrayPattern(elements: js.Array[Pattern], `type`: typingsSlinky.estree.estreeStrings.ArrayPattern): typingsSlinky.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ArrayPattern]
  }
  
  @scala.inline
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typingsSlinky.estree.estreeStrings.AssignmentPattern): typingsSlinky.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.AssignmentPattern]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.estree.estreeStrings.Identifier): typingsSlinky.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.Identifier]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typingsSlinky.estree.estreeStrings.MemberExpression
  ): typingsSlinky.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.MemberExpression]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectPattern
  ): typingsSlinky.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ObjectPattern]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typingsSlinky.estree.estreeStrings.RestElement): typingsSlinky.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.RestElement]
  }
}
