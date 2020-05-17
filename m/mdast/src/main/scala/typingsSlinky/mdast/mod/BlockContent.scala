package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.Paragraph
  - typingsSlinky.mdast.mod.Heading
  - typingsSlinky.mdast.mod.ThematicBreak
  - typingsSlinky.mdast.mod.Blockquote
  - typingsSlinky.mdast.mod.List
  - typingsSlinky.mdast.mod.Table
  - typingsSlinky.mdast.mod.HTML
  - typingsSlinky.mdast.mod.Code
*/
trait BlockContent extends TopLevelContent

object BlockContent {
  @scala.inline
  implicit def apply(value: Blockquote): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: Code): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: HTML): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: Heading): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: List): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: Paragraph): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: Table): BlockContent = value.asInstanceOf[BlockContent]
  @scala.inline
  implicit def apply(value: ThematicBreak): BlockContent = value.asInstanceOf[BlockContent]
}

