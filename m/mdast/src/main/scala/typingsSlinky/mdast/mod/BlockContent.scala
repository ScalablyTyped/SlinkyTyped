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
import org.scalablytyped.runtime.StObject
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
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote): typingsSlinky.mdast.mod.Blockquote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Blockquote]
  }
  
  @scala.inline
  def Code(`type`: code, value: js.Any): typingsSlinky.mdast.mod.Code = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Code]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): typingsSlinky.mdast.mod.HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.HTML]
  }
  
  @scala.inline
  def Heading(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`, `type`: heading): typingsSlinky.mdast.mod.Heading = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Heading]
  }
  
  @scala.inline
  def List(children: js.Array[ListContent], `type`: list): typingsSlinky.mdast.mod.List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.List]
  }
  
  @scala.inline
  def Paragraph(children: js.Array[PhrasingContent], `type`: paragraph): typingsSlinky.mdast.mod.Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Paragraph]
  }
  
  @scala.inline
  def Table(children: js.Array[TableContent], `type`: table): typingsSlinky.mdast.mod.Table = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.Table]
  }
  
  @scala.inline
  def ThematicBreak(`type`: thematicBreak): typingsSlinky.mdast.mod.ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mdast.mod.ThematicBreak]
  }
}
