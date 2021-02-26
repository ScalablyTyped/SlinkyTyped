package typingsSlinky.marked.mod

import typingsSlinky.marked.markedStrings.blockquote
import typingsSlinky.marked.markedStrings.blockquote_end
import typingsSlinky.marked.markedStrings.blockquote_start
import typingsSlinky.marked.markedStrings.br
import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.code
import typingsSlinky.marked.markedStrings.codespan
import typingsSlinky.marked.markedStrings.del
import typingsSlinky.marked.markedStrings.em
import typingsSlinky.marked.markedStrings.escape
import typingsSlinky.marked.markedStrings.heading
import typingsSlinky.marked.markedStrings.hr
import typingsSlinky.marked.markedStrings.html
import typingsSlinky.marked.markedStrings.image
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.link
import typingsSlinky.marked.markedStrings.list_item
import typingsSlinky.marked.markedStrings.list_start
import typingsSlinky.marked.markedStrings.paragraph
import typingsSlinky.marked.markedStrings.right
import typingsSlinky.marked.markedStrings.space
import typingsSlinky.marked.markedStrings.strong
import typingsSlinky.marked.markedStrings.table
import typingsSlinky.marked.markedStrings.text
import typingsSlinky.marked.mod.Tokens.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.marked.mod.Tokens.Space
  - typingsSlinky.marked.mod.Tokens.Code
  - typingsSlinky.marked.mod.Tokens.Heading
  - typingsSlinky.marked.mod.Tokens.Table
  - typingsSlinky.marked.mod.Tokens.Hr
  - typingsSlinky.marked.mod.Tokens.Blockquote
  - typingsSlinky.marked.mod.Tokens.BlockquoteStart
  - typingsSlinky.marked.mod.Tokens.BlockquoteEnd
  - typingsSlinky.marked.mod.Tokens.List
  - typingsSlinky.marked.mod.Tokens.ListItem
  - typingsSlinky.marked.mod.Tokens.Paragraph
  - typingsSlinky.marked.mod.Tokens.HTML
  - typingsSlinky.marked.mod.Tokens.Text
  - typingsSlinky.marked.mod.Tokens.Def
  - typingsSlinky.marked.mod.Tokens.Escape
  - typingsSlinky.marked.mod.Tokens.Tag
  - typingsSlinky.marked.mod.Tokens.Image
  - typingsSlinky.marked.mod.Tokens.Link
  - typingsSlinky.marked.mod.Tokens.Strong
  - typingsSlinky.marked.mod.Tokens.Em
  - typingsSlinky.marked.mod.Tokens.Codespan
  - typingsSlinky.marked.mod.Tokens.Br
  - typingsSlinky.marked.mod.Tokens.Del
*/
trait Token extends StObject
object Token {
  
  @scala.inline
  def Blockquote(raw: String, text: String, `type`: blockquote): typingsSlinky.marked.mod.Tokens.Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Blockquote]
  }
  
  @scala.inline
  def BlockquoteEnd(raw: String, `type`: blockquote_end): typingsSlinky.marked.mod.Tokens.BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.BlockquoteEnd]
  }
  
  @scala.inline
  def BlockquoteStart(raw: String, `type`: blockquote_start): typingsSlinky.marked.mod.Tokens.BlockquoteStart = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.BlockquoteStart]
  }
  
  @scala.inline
  def Br(raw: String, `type`: br): typingsSlinky.marked.mod.Tokens.Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Br]
  }
  
  @scala.inline
  def Code(raw: String, text: String, `type`: code): typingsSlinky.marked.mod.Tokens.Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Code]
  }
  
  @scala.inline
  def Codespan(raw: String, text: String, `type`: codespan): typingsSlinky.marked.mod.Tokens.Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Codespan]
  }
  
  @scala.inline
  def Def(href: String, raw: String, title: String): typingsSlinky.marked.mod.Tokens.Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Def]
  }
  
  @scala.inline
  def Del(raw: String, text: String, `type`: del): typingsSlinky.marked.mod.Tokens.Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Del]
  }
  
  @scala.inline
  def Em(raw: String, text: String, `type`: em): typingsSlinky.marked.mod.Tokens.Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Em]
  }
  
  @scala.inline
  def Escape(raw: String, text: String, `type`: escape): typingsSlinky.marked.mod.Tokens.Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Escape]
  }
  
  @scala.inline
  def HTML(pre: Boolean, raw: String, text: String, `type`: html): typingsSlinky.marked.mod.Tokens.HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.HTML]
  }
  
  @scala.inline
  def Heading(depth: Double, raw: String, text: String, `type`: heading): typingsSlinky.marked.mod.Tokens.Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Heading]
  }
  
  @scala.inline
  def Hr(raw: String, `type`: hr): typingsSlinky.marked.mod.Tokens.Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Hr]
  }
  
  @scala.inline
  def Image(href: String, raw: String, text: String, title: String, `type`: image): typingsSlinky.marked.mod.Tokens.Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Image]
  }
  
  @scala.inline
  def Link(href: String, raw: String, text: String, title: String, `type`: link): typingsSlinky.marked.mod.Tokens.Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Link]
  }
  
  @scala.inline
  def List(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): typingsSlinky.marked.mod.Tokens.List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.List]
  }
  
  @scala.inline
  def ListItem(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): typingsSlinky.marked.mod.Tokens.ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.ListItem]
  }
  
  @scala.inline
  def Paragraph(raw: String, text: String, `type`: paragraph): typingsSlinky.marked.mod.Tokens.Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Paragraph]
  }
  
  @scala.inline
  def Space(raw: String, `type`: space): typingsSlinky.marked.mod.Tokens.Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Space]
  }
  
  @scala.inline
  def Strong(raw: String, text: String, `type`: strong): typingsSlinky.marked.mod.Tokens.Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Strong]
  }
  
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String,
    `type`: table
  ): typingsSlinky.marked.mod.Tokens.Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Table]
  }
  
  @scala.inline
  def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): typingsSlinky.marked.mod.Tokens.Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Tag]
  }
  
  @scala.inline
  def Text(raw: String, text: String, `type`: text): typingsSlinky.marked.mod.Tokens.Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.marked.mod.Tokens.Text]
  }
}
