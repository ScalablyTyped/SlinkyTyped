package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.definition
import typingsSlinky.mdast.mdastStrings.footnoteDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.Definition
  - typingsSlinky.mdast.mod.FootnoteDefinition
*/
trait DefinitionContent extends _TopLevelContent

object DefinitionContent {
  @scala.inline
  def Definition(identifier: String, `type`: definition, url: String): DefinitionContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionContent]
  }
  @scala.inline
  def FootnoteDefinition(children: js.Array[BlockContent], identifier: String, `type`: footnoteDefinition): DefinitionContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionContent]
  }
}

