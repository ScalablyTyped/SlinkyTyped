package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrayPattern
import typingsSlinky.babelTypes.babelTypesStrings.AssignmentPattern
import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.MemberExpression
import typingsSlinky.babelTypes.babelTypesStrings.ObjectPattern
import typingsSlinky.babelTypes.babelTypesStrings.RestElement
import typingsSlinky.babelTypes.babelTypesStrings.TSParameterProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def Identifier_(name: js.Any, `type`: Identifier): LVal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): LVal = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def MemberExpression_(computed: Boolean, `object`: Expression, property: js.Any, `type`: MemberExpression): LVal = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike], `type`: ArrayPattern): LVal = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): LVal = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def RestElement_(argument: LVal, `type`: RestElement): LVal = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): LVal = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
}

