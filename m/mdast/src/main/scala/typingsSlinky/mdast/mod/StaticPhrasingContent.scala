package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.Text
  - typingsSlinky.mdast.mod.Emphasis
  - typingsSlinky.mdast.mod.Strong
  - typingsSlinky.mdast.mod.Delete
  - typingsSlinky.mdast.mod.HTML
  - typingsSlinky.mdast.mod.InlineCode
  - typingsSlinky.mdast.mod.Break
  - typingsSlinky.mdast.mod.Image
  - typingsSlinky.mdast.mod.ImageReference
  - typingsSlinky.mdast.mod.Footnote
  - typingsSlinky.mdast.mod.FootnoteReference
*/
trait StaticPhrasingContent extends PhrasingContent

object StaticPhrasingContent {
  @scala.inline
  implicit def apply(value: Break): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Delete): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Emphasis): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Footnote): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: FootnoteReference): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: HTML): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Image): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: ImageReference): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: InlineCode): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Strong): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
  @scala.inline
  implicit def apply(value: Text): StaticPhrasingContent = value.asInstanceOf[StaticPhrasingContent]
}

