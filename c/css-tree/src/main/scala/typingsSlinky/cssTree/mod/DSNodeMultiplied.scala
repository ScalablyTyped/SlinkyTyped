package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.Function
import typingsSlinky.cssTree.cssTreeStrings.Group
import typingsSlinky.cssTree.cssTreeStrings.Keyword
import typingsSlinky.cssTree.cssTreeStrings.Property
import typingsSlinky.cssTree.cssTreeStrings.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssTree.mod.DSNodeFunction
  - typingsSlinky.cssTree.mod.DSNodeGroup
  - typingsSlinky.cssTree.mod.DSNodeKeyword
  - typingsSlinky.cssTree.mod.DSNodeProperty
  - typingsSlinky.cssTree.mod.DSNodeString
  - typingsSlinky.cssTree.mod.DSNodeType
*/
trait DSNodeMultiplied extends js.Object
object DSNodeMultiplied {
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeProperty(name: String, `type`: Property): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeKeyword(name: String, `type`: Keyword): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeString(`type`: typingsSlinky.cssTree.cssTreeStrings.String, value: String): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeType(name: String, `type`: Type): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeFunction(name: String, `type`: Function): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
}
