package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.AtKeyword
import typingsSlinky.cssTree.cssTreeStrings.Comma
import typingsSlinky.cssTree.cssTreeStrings.Function
import typingsSlinky.cssTree.cssTreeStrings.Group
import typingsSlinky.cssTree.cssTreeStrings.Keyword
import typingsSlinky.cssTree.cssTreeStrings.Multiplier
import typingsSlinky.cssTree.cssTreeStrings.Property
import typingsSlinky.cssTree.cssTreeStrings.Token
import typingsSlinky.cssTree.cssTreeStrings.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssTree.mod.DSNodeAtWord
  - typingsSlinky.cssTree.mod.DSNodeComma
  - typingsSlinky.cssTree.mod.DSNodeFunction
  - typingsSlinky.cssTree.mod.DSNodeGroup
  - typingsSlinky.cssTree.mod.DSNodeKeyword
  - typingsSlinky.cssTree.mod.DSNodeMultiplier
  - typingsSlinky.cssTree.mod.DSNodeProperty
  - typingsSlinky.cssTree.mod.DSNodeString
  - typingsSlinky.cssTree.mod.DSNodeToken
  - typingsSlinky.cssTree.mod.DSNodeType
*/
trait DSNode extends js.Object
object DSNode {
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNode = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeComma(`type`: Comma): DSNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeProperty(name: String, `type`: Property): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeKeyword(name: String, `type`: Keyword): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeAtWord(name: String, `type`: AtKeyword): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeString(`type`: typingsSlinky.cssTree.cssTreeStrings.String, value: String): DSNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeType(name: String, `type`: Type): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeToken(`type`: Token, value: String): DSNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied, `type`: Multiplier): DSNode = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeFunction(name: String, `type`: Function): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
}
