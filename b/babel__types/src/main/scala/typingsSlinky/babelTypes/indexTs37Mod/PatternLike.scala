package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrayPattern
import typingsSlinky.babelTypes.babelTypesStrings.AssignmentPattern
import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.ObjectPattern
import typingsSlinky.babelTypes.babelTypesStrings.RestElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.Identifier_
  - typingsSlinky.babelTypes.indexTs37Mod.RestElement_
  - typingsSlinky.babelTypes.indexTs37Mod.AssignmentPattern_
  - typingsSlinky.babelTypes.indexTs37Mod.ArrayPattern_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectPattern_
*/
trait PatternLike extends _Node
object PatternLike {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike], `type`: ArrayPattern): typingsSlinky.babelTypes.indexTs37Mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): typingsSlinky.babelTypes.indexTs37Mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): typingsSlinky.babelTypes.indexTs37Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.Identifier_]
  }
  
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): typingsSlinky.babelTypes.indexTs37Mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal, `type`: RestElement): typingsSlinky.babelTypes.indexTs37Mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.RestElement_]
  }
}
