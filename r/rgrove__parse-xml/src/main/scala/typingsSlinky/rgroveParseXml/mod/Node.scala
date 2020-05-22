package typingsSlinky.rgroveParseXml.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rgroveParseXml.rgroveParseXmlStrings.cdata
import typingsSlinky.rgroveParseXml.rgroveParseXmlStrings.comment
import typingsSlinky.rgroveParseXml.rgroveParseXmlStrings.element
import typingsSlinky.rgroveParseXml.rgroveParseXmlStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rgroveParseXml.mod.CData
  - typingsSlinky.rgroveParseXml.mod.Comment
  - typingsSlinky.rgroveParseXml.mod.Element
  - typingsSlinky.rgroveParseXml.mod.Text
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def CData(text: String, `type`: cdata, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Comment(content: String, `type`: comment, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Element(
    attributes: StringDictionary[String],
    children: js.Array[NodeBase],
    name: String,
    `type`: element,
    parent: NodeBase = null,
    preserveWhitespace: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Text(text: String, `type`: text, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

