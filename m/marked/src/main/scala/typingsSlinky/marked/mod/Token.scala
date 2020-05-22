package typingsSlinky.marked.mod

import typingsSlinky.marked.markedStrings.blockquote_end
import typingsSlinky.marked.markedStrings.blockquote_start
import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.code
import typingsSlinky.marked.markedStrings.heading
import typingsSlinky.marked.markedStrings.hr
import typingsSlinky.marked.markedStrings.html
import typingsSlinky.marked.markedStrings.indented
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.list_end
import typingsSlinky.marked.markedStrings.list_item_end
import typingsSlinky.marked.markedStrings.list_item_start
import typingsSlinky.marked.markedStrings.list_start
import typingsSlinky.marked.markedStrings.loose_item_start
import typingsSlinky.marked.markedStrings.paragraph
import typingsSlinky.marked.markedStrings.right
import typingsSlinky.marked.markedStrings.space
import typingsSlinky.marked.markedStrings.table
import typingsSlinky.marked.markedStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.marked.mod.Tokens.Space
  - typingsSlinky.marked.mod.Tokens.Code
  - typingsSlinky.marked.mod.Tokens.Heading
  - typingsSlinky.marked.mod.Tokens.Table
  - typingsSlinky.marked.mod.Tokens.Hr
  - typingsSlinky.marked.mod.Tokens.BlockquoteStart
  - typingsSlinky.marked.mod.Tokens.BlockquoteEnd
  - typingsSlinky.marked.mod.Tokens.ListStart
  - typingsSlinky.marked.mod.Tokens.LooseItemStart
  - typingsSlinky.marked.mod.Tokens.ListItemStart
  - typingsSlinky.marked.mod.Tokens.ListItemEnd
  - typingsSlinky.marked.mod.Tokens.ListEnd
  - typingsSlinky.marked.mod.Tokens.Paragraph
  - typingsSlinky.marked.mod.Tokens.HTML
  - typingsSlinky.marked.mod.Tokens.Text
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def Hr(`type`: hr): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Paragraph(text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Token = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListEnd(`type`: list_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListStart(ordered: Boolean, `type`: list_start): Token = {
    val __obj = js.Dynamic.literal(ordered = ordered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Code(text: String, `type`: code, codeBlockStyle: indented = null, lang: String = null): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemEnd(`type`: list_item_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Space(`type`: space): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteStart(`type`: blockquote_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteEnd(`type`: blockquote_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Heading(depth: Double, text: String, `type`: heading): Token = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemStart(`type`: list_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def HTML(pre: Boolean, text: String, `type`: html): Token = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Text(text: String, `type`: text): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def LooseItemStart(`type`: loose_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

