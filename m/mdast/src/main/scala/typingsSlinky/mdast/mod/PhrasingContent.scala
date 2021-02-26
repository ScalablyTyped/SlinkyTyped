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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.StaticPhrasingContent
  - typingsSlinky.mdast.mod.Link
  - typingsSlinky.mdast.mod.LinkReference
*/
trait PhrasingContent extends _Content
object PhrasingContent {
  
  @scala.inline
  def Break(`type`: break): typingsSlinky.mdast.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Break]
  }
  
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): typingsSlinky.mdast.mod.Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Delete]
  }
  
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): typingsSlinky.mdast.mod.Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Emphasis]
  }
  
  @scala.inline
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): typingsSlinky.mdast.mod.Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Footnote]
  }
  
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): typingsSlinky.mdast.mod.FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.FootnoteReference]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): typingsSlinky.mdast.mod.HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.HTML]
  }
  
  @scala.inline
  def Image(`type`: image, url: String): typingsSlinky.mdast.mod.Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Image]
  }
  
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): typingsSlinky.mdast.mod.ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.ImageReference]
  }
  
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): typingsSlinky.mdast.mod.InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.InlineCode]
  }
  
  @scala.inline
  def Link(children: js.Array[StaticPhrasingContent], `type`: link, url: String): typingsSlinky.mdast.mod.Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Link]
  }
  
  @scala.inline
  def LinkReference(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference
  ): typingsSlinky.mdast.mod.LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.LinkReference]
  }
  
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): typingsSlinky.mdast.mod.Strong = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Strong]
  }
  
  @scala.inline
  def Text(`type`: text, value: js.Any): typingsSlinky.mdast.mod.Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Text]
  }
}
