package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.Definition
  - typingsSlinky.mdast.mod.FootnoteDefinition
*/
trait DefinitionContent extends TopLevelContent

object DefinitionContent {
  @scala.inline
  implicit def apply(value: Definition): DefinitionContent = value.asInstanceOf[DefinitionContent]
  @scala.inline
  implicit def apply(value: FootnoteDefinition): DefinitionContent = value.asInstanceOf[DefinitionContent]
}

