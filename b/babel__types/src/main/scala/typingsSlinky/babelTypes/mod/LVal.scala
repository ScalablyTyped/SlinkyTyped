package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrayPattern
import typingsSlinky.babelTypes.babelTypesStrings.AssignmentPattern
import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.MemberExpression
import typingsSlinky.babelTypes.babelTypesStrings.ObjectPattern
import typingsSlinky.babelTypes.babelTypesStrings.RestElement
import typingsSlinky.babelTypes.babelTypesStrings.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.MemberExpression_
  - typingsSlinky.babelTypes.mod.RestElement_
  - typingsSlinky.babelTypes.mod.AssignmentPattern_
  - typingsSlinky.babelTypes.mod.ArrayPattern_
  - typingsSlinky.babelTypes.mod.ObjectPattern_
  - typingsSlinky.babelTypes.mod.TSParameterProperty_
*/
trait LVal extends _Node
object LVal {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike], `type`: ArrayPattern): typingsSlinky.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): typingsSlinky.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): typingsSlinky.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.Identifier_]
  }
  
  @scala.inline
  def MemberExpression_(
    computed: Boolean,
    `object`: Expression,
    property: Expression | Identifier_ | PrivateName_,
    `type`: MemberExpression
  ): typingsSlinky.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.MemberExpression_]
  }
  
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): typingsSlinky.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal, `type`: RestElement): typingsSlinky.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.RestElement_]
  }
  
  @scala.inline
  def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): typingsSlinky.babelTypes.mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TSParameterProperty_]
  }
}
