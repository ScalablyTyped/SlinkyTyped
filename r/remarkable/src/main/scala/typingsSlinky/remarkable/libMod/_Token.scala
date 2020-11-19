package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableBooleans.`false`
import typingsSlinky.remarkable.remarkableStrings.abbr_close
import typingsSlinky.remarkable.remarkableStrings.abbr_open
import typingsSlinky.remarkable.remarkableStrings.blockquote_close
import typingsSlinky.remarkable.remarkableStrings.blockquote_open
import typingsSlinky.remarkable.remarkableStrings.bullet_list_close
import typingsSlinky.remarkable.remarkableStrings.bullet_list_open
import typingsSlinky.remarkable.remarkableStrings.code
import typingsSlinky.remarkable.remarkableStrings.dd_close
import typingsSlinky.remarkable.remarkableStrings.dd_open
import typingsSlinky.remarkable.remarkableStrings.del_open
import typingsSlinky.remarkable.remarkableStrings.dl_close
import typingsSlinky.remarkable.remarkableStrings.dl_open
import typingsSlinky.remarkable.remarkableStrings.dt_close
import typingsSlinky.remarkable.remarkableStrings.dt_open
import typingsSlinky.remarkable.remarkableStrings.em_close
import typingsSlinky.remarkable.remarkableStrings.em_open
import typingsSlinky.remarkable.remarkableStrings.fence
import typingsSlinky.remarkable.remarkableStrings.footnote_anchor
import typingsSlinky.remarkable.remarkableStrings.footnote_block_close
import typingsSlinky.remarkable.remarkableStrings.footnote_block_open
import typingsSlinky.remarkable.remarkableStrings.footnote_close
import typingsSlinky.remarkable.remarkableStrings.footnote_open
import typingsSlinky.remarkable.remarkableStrings.footnote_ref
import typingsSlinky.remarkable.remarkableStrings.footnote_reference_close
import typingsSlinky.remarkable.remarkableStrings.footnote_reference_open
import typingsSlinky.remarkable.remarkableStrings.hardbreak
import typingsSlinky.remarkable.remarkableStrings.heading_close
import typingsSlinky.remarkable.remarkableStrings.heading_open
import typingsSlinky.remarkable.remarkableStrings.hr
import typingsSlinky.remarkable.remarkableStrings.htmlblock
import typingsSlinky.remarkable.remarkableStrings.htmltag
import typingsSlinky.remarkable.remarkableStrings.image
import typingsSlinky.remarkable.remarkableStrings.ins_close
import typingsSlinky.remarkable.remarkableStrings.ins_open
import typingsSlinky.remarkable.remarkableStrings.link_close
import typingsSlinky.remarkable.remarkableStrings.link_open
import typingsSlinky.remarkable.remarkableStrings.list_item_close
import typingsSlinky.remarkable.remarkableStrings.list_item_open
import typingsSlinky.remarkable.remarkableStrings.mark_close
import typingsSlinky.remarkable.remarkableStrings.mark_open
import typingsSlinky.remarkable.remarkableStrings.ordered_list_close
import typingsSlinky.remarkable.remarkableStrings.ordered_list_open
import typingsSlinky.remarkable.remarkableStrings.paragraph_close
import typingsSlinky.remarkable.remarkableStrings.paragraph_open
import typingsSlinky.remarkable.remarkableStrings.softbreak
import typingsSlinky.remarkable.remarkableStrings.strong_close
import typingsSlinky.remarkable.remarkableStrings.strong_open
import typingsSlinky.remarkable.remarkableStrings.sub
import typingsSlinky.remarkable.remarkableStrings.sup
import typingsSlinky.remarkable.remarkableStrings.table_close
import typingsSlinky.remarkable.remarkableStrings.table_open
import typingsSlinky.remarkable.remarkableStrings.tbody_close
import typingsSlinky.remarkable.remarkableStrings.tbody_open
import typingsSlinky.remarkable.remarkableStrings.td_close
import typingsSlinky.remarkable.remarkableStrings.td_open
import typingsSlinky.remarkable.remarkableStrings.text
import typingsSlinky.remarkable.remarkableStrings.th_close
import typingsSlinky.remarkable.remarkableStrings.th_open
import typingsSlinky.remarkable.remarkableStrings.thead_close
import typingsSlinky.remarkable.remarkableStrings.thead_open
import typingsSlinky.remarkable.remarkableStrings.tr_close
import typingsSlinky.remarkable.remarkableStrings.tr_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends js.Object
object _Token {
  
  @scala.inline
  def DtOpenToken(level: Double, `type`: dt_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def EmCloseToken(level: Double, `type`: em_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HrToken(level: Double, `type`: hr): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def CodeToken(block: Boolean, level: Double, `type`: code): _Token = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ListItemOpenToken(level: Double, `type`: list_item_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def BulletListCloseToken(level: Double, `type`: bullet_list_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DlOpenToken(level: Double, `type`: dl_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TextToken(level: Double, `type`: text): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteReferenceOpenToken(id: Double, label: String, level: Double, `type`: footnote_reference_open): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TRCloseToken(level: Double, `type`: tr_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def AbbrOpenToken(level: Double, title: String, `type`: abbr_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TBodyCloseToken(level: Double, `type`: tbody_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteGenericToken(id: Double, level: Double, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HeadingCloseToken(hLevel: HeadingValue, level: Double, `type`: heading_close): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteOpenToken(id: Double, level: Double, `type`: footnote_open): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HardbreakToken(level: Double, `type`: hardbreak): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ParagraphCloseToken(level: Double, tight: Boolean, `type`: paragraph_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FenceToken(content: String, level: Double, params: String, `type`: fence): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def InsCloseToken(level: Double, `type`: ins_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def LinkOpenToken(href: String, level: Double, `type`: link_open): _Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def StrongOpenToken(level: Double, `type`: strong_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def SupToken(content: String, level: Double, `type`: sup): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DdCloseToken(level: Double, `type`: dd_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def SoftbreakToken(level: Double, `type`: softbreak): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DelCloseToken(level: Double, `type`: del_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TDOpenToken(level: Double, `type`: td_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteBlockCloseToken(level: Double, `type`: footnote_block_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ContentToken(level: Double, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ParagraphToken(level: Double, tight: Boolean, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DelOpenToken(level: Double, `type`: del_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def BlockContentToken(level: Double, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DtCloseToken(level: Double, `type`: dt_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TDCloseToken(level: Double, `type`: td_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteCloseToken(id: Double, level: Double, `type`: footnote_close): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def THeadCloseToken(level: Double, `type`: thead_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HtmlTagToken(content: String, level: Double, `type`: htmltag): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TableOpenToken(level: Double, `type`: table_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TableCloseToken(level: Double, `type`: table_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def THOpenToken(level: Double, `type`: th_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def MarkCloseToken(level: Double, `type`: mark_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def LinkCloseToken(level: Double, `type`: link_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def OrderedListOpenToken(level: Double, order: Double, `type`: ordered_list_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ImageToken(alt: String, level: Double, src: String, title: String, `type`: image): _Token = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def OrderedListCloseToken(level: Double, `type`: ordered_list_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def THeadOpenToken(level: Double, `type`: thead_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HtmlBlockToken(block: `false`, content: String, level: Double, `type`: htmlblock): _Token = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteInlineToken(id: Double, level: Double, `type`: footnote_ref): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def BlockquoteCloseToken(level: Double, `type`: blockquote_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DdOpenToken(level: Double, `type`: dd_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def SubToken(content: String, level: Double, `type`: sub): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def StrongCloseToken(level: Double, `type`: strong_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def BlockquoteOpenToken(level: Double, `type`: blockquote_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def DlCloseToken(level: Double, `type`: dl_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def BulletListOpenToken(level: Double, `type`: bullet_list_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteBlockOpenToken(level: Double, `type`: footnote_block_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TagToken(level: Double, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def AbbrCloseToken(level: Double, `type`: abbr_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def MarkOpenToken(level: Double, `type`: mark_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def EmOpenToken(level: Double, `type`: em_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ListItemCloseToken(level: Double, `type`: list_item_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def THCloseToken(level: Double, `type`: th_close): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def InsOpenToken(level: Double, `type`: ins_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TBodyOpenToken(level: Double, `type`: tbody_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteAnchorToken(id: Double, level: Double, `type`: footnote_anchor): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def FootnoteReferenceCloseToken(id: Double, level: Double, `type`: footnote_reference_close): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def TROpenToken(level: Double, `type`: tr_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HeadingToken(hLevel: HeadingValue, level: Double, `type`: String): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def ParagraphOpenToken(level: Double, tight: Boolean, `type`: paragraph_open): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  
  @scala.inline
  def HeadingOpenToken(hLevel: HeadingValue, level: Double, `type`: heading_open): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
}
