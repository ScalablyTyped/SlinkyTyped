package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.BlockContent
  - typingsSlinky.mdast.mod.FrontmatterContent
  - typingsSlinky.mdast.mod.DefinitionContent
*/
trait TopLevelContent extends Content

object TopLevelContent {
  @scala.inline
  implicit def apply(value: BlockContent): TopLevelContent = value.asInstanceOf[TopLevelContent]
  @scala.inline
  implicit def apply(value: DefinitionContent): TopLevelContent = value.asInstanceOf[TopLevelContent]
  @scala.inline
  implicit def apply(value: FrontmatterContent): TopLevelContent = value.asInstanceOf[TopLevelContent]
}

