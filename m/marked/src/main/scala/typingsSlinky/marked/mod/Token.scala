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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Token extends js.Object

object Token {
  @scala.inline
  def Hr(raw: String, `type`: hr): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Link(href: String, raw: String, text: String, title: String, `type`: link): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def List(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): Token = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Del(raw: String, text: String, `type`: del): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Paragraph(raw: String, text: String, `type`: paragraph): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Em(raw: String, text: String, `type`: em): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String,
    `type`: table
  ): Token = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Br(raw: String, `type`: br): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Token = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Code(raw: String, text: String, `type`: code): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Codespan(raw: String, text: String, `type`: codespan): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Blockquote(raw: String, text: String, `type`: blockquote): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Escape(raw: String, text: String, `type`: escape): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Space(raw: String, `type`: space): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Def(href: String, raw: String, title: String): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Image(href: String, raw: String, text: String, title: String, `type`: image): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Strong(raw: String, text: String, `type`: strong): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteStart(raw: String, `type`: blockquote_start): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItem(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): Token = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteEnd(raw: String, `type`: blockquote_end): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Heading(depth: Double, raw: String, text: String, `type`: heading): Token = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def HTML(pre: Boolean, raw: String, text: String, `type`: html): Token = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Text(raw: String, text: String, `type`: text): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

