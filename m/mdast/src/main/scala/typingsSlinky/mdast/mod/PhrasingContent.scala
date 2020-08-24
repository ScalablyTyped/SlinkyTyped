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
import typingsSlinky.mdast.mdastStrings.link
import typingsSlinky.mdast.mdastStrings.linkReference
import typingsSlinky.mdast.mdastStrings.strong
import typingsSlinky.mdast.mdastStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.StaticPhrasingContent
  - typingsSlinky.mdast.mod.Link
  - typingsSlinky.mdast.mod.LinkReference
*/
trait PhrasingContent extends _Content

object PhrasingContent {
  @scala.inline
  def Link(children: js.Array[StaticPhrasingContent], `type`: link, url: String): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def LinkReference(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Image(`type`: image, url: String): PhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Break(`type`: break): PhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
}

