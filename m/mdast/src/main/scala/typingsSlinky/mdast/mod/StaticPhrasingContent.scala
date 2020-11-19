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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def HTML(`type`: html, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Text(`type`: text, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Image(`type`: image, url: String): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Break(`type`: break): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  
  @scala.inline
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
}
