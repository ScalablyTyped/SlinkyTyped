package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastNumbers.`1`
import typingsSlinky.mdast.mdastNumbers.`2`
import typingsSlinky.mdast.mdastNumbers.`3`
import typingsSlinky.mdast.mdastNumbers.`4`
import typingsSlinky.mdast.mdastNumbers.`5`
import typingsSlinky.mdast.mdastNumbers.`6`
import typingsSlinky.mdast.mdastStrings.blockquote
import typingsSlinky.mdast.mdastStrings.code
import typingsSlinky.mdast.mdastStrings.heading
import typingsSlinky.mdast.mdastStrings.html
import typingsSlinky.mdast.mdastStrings.list
import typingsSlinky.mdast.mdastStrings.paragraph
import typingsSlinky.mdast.mdastStrings.table
import typingsSlinky.mdast.mdastStrings.thematicBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait BlockContent extends _TopLevelContent
object BlockContent {
  
  @scala.inline
  def Paragraph(children: js.Array[PhrasingContent], `type`: paragraph): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def ThematicBreak(`type`: thematicBreak): BlockContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def List(children: js.Array[ListContent], `type`: list): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def Heading(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`, `type`: heading): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def Table(children: js.Array[TableContent], `type`: table): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  
  @scala.inline
  def Code(`type`: code, value: js.Any): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
}
