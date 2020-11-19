package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastNumbers.`1`
import typingsSlinky.mdast.mdastNumbers.`2`
import typingsSlinky.mdast.mdastNumbers.`3`
import typingsSlinky.mdast.mdastNumbers.`4`
import typingsSlinky.mdast.mdastNumbers.`5`
import typingsSlinky.mdast.mdastNumbers.`6`
import typingsSlinky.mdast.mdastStrings.blockquote
import typingsSlinky.mdast.mdastStrings.code
import typingsSlinky.mdast.mdastStrings.definition
import typingsSlinky.mdast.mdastStrings.footnoteDefinition
import typingsSlinky.mdast.mdastStrings.heading
import typingsSlinky.mdast.mdastStrings.html
import typingsSlinky.mdast.mdastStrings.list
import typingsSlinky.mdast.mdastStrings.paragraph
import typingsSlinky.mdast.mdastStrings.table
import typingsSlinky.mdast.mdastStrings.thematicBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TopLevelContent extends _Content
object _TopLevelContent {
  
  @scala.inline
  def Paragraph(children: js.Array[PhrasingContent], `type`: paragraph): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def Definition(identifier: String, `type`: definition, url: String): _TopLevelContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): _TopLevelContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def ThematicBreak(`type`: thematicBreak): _TopLevelContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def List(children: js.Array[ListContent], `type`: list): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def FootnoteDefinition(children: js.Array[BlockContent], identifier: String, `type`: footnoteDefinition): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def Heading(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`, `type`: heading): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def Table(children: js.Array[TableContent], `type`: table): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  
  @scala.inline
  def Code(`type`: code, value: js.Any): _TopLevelContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
}
