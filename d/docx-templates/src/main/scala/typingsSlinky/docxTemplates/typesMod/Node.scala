package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.anon.Dictkey
import typingsSlinky.docxTemplates.docxTemplatesBooleans.`false`
import typingsSlinky.docxTemplates.docxTemplatesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.docxTemplates.typesMod.TextNode
  - typingsSlinky.docxTemplates.typesMod.NonTextNode
*/
trait Node extends StObject
object Node {
  
  @scala.inline
  def NonTextNode(_attrs: Dictkey, _children: js.Array[Node], _fTextNode: `false`, _tag: String): typingsSlinky.docxTemplates.typesMod.NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.docxTemplates.typesMod.NonTextNode]
  }
  
  @scala.inline
  def TextNode(_children: js.Array[Node], _fTextNode: `true`, _text: String): typingsSlinky.docxTemplates.typesMod.TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.docxTemplates.typesMod.TextNode]
  }
}
