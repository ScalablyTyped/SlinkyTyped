package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.break
import typingsSlinky.mdast.mdastStrings.delete
import typingsSlinky.mdast.mdastStrings.emphasis
import typingsSlinky.mdast.mdastStrings.footnote
import typingsSlinky.mdast.mdastStrings.footnoteReference
import typingsSlinky.mdast.mdastStrings.html
import typingsSlinky.mdast.mdastStrings.image
import typingsSlinky.mdast.mdastStrings.imageReference
import typingsSlinky.mdast.mdastStrings.inlineCode
import typingsSlinky.mdast.mdastStrings.strong
import typingsSlinky.mdast.mdastStrings.text
import typingsSlinky.unist.mod.Data
import typingsSlinky.unist.mod.Position
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
  def HTML(`type`: html, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Emphasis(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def FootnoteReference(
    identifier: String,
    `type`: footnoteReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Image(
    `type`: image,
    url: String,
    alt: String = null,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Break(`type`: break, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def ImageReference(
    identifier: String,
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Footnote(
    children: js.Array[PhrasingContent],
    `type`: footnote,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
}

