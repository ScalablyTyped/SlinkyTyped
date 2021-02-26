package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.definition
import typingsSlinky.mdast.mdastStrings.footnoteDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.Definition
  - typingsSlinky.mdast.mod.FootnoteDefinition
*/
trait DefinitionContent extends _TopLevelContent
object DefinitionContent {
  
  @scala.inline
  def Definition(identifier: String, `type`: definition, url: String): typingsSlinky.mdast.mod.Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Definition]
  }
  
  @scala.inline
  def FootnoteDefinition(children: js.Array[BlockContent], identifier: String, `type`: footnoteDefinition): typingsSlinky.mdast.mod.FootnoteDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.FootnoteDefinition]
  }
}
