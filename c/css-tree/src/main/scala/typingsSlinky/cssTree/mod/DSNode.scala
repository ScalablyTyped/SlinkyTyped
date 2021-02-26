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
import org.scalablytyped.runtime.StObject
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
trait DSNode extends StObject
object DSNode {
  
  @scala.inline
  def DSNodeAtWord(name: String, `type`: AtKeyword): typingsSlinky.cssTree.mod.DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeAtWord]
  }
  
  @scala.inline
  def DSNodeComma(`type`: Comma): typingsSlinky.cssTree.mod.DSNodeComma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeComma]
  }
  
  @scala.inline
  def DSNodeFunction(name: String, `type`: Function): typingsSlinky.cssTree.mod.DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeFunction]
  }
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): typingsSlinky.cssTree.mod.DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeGroup]
  }
  
  @scala.inline
  def DSNodeKeyword(name: String, `type`: Keyword): typingsSlinky.cssTree.mod.DSNodeKeyword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeKeyword]
  }
  
  @scala.inline
  def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied, `type`: Multiplier): typingsSlinky.cssTree.mod.DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeMultiplier]
  }
  
  @scala.inline
  def DSNodeProperty(name: String, `type`: Property): typingsSlinky.cssTree.mod.DSNodeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeProperty]
  }
  
  @scala.inline
  def DSNodeString(`type`: typingsSlinky.cssTree.cssTreeStrings.String, value: String): typingsSlinky.cssTree.mod.DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeString]
  }
  
  @scala.inline
  def DSNodeToken(`type`: Token, value: String): typingsSlinky.cssTree.mod.DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeToken]
  }
  
  @scala.inline
  def DSNodeType(name: String, `type`: Type): typingsSlinky.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssTree.mod.DSNodeType]
  }
}
