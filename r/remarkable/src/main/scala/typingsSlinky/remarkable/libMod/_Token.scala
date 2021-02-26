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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  @scala.inline
  def AbbrCloseToken(level: Double, `type`: abbr_close): typingsSlinky.remarkable.libMod.AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.AbbrCloseToken]
  }
  
  @scala.inline
  def AbbrOpenToken(level: Double, title: String, `type`: abbr_open): typingsSlinky.remarkable.libMod.AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.AbbrOpenToken]
  }
  
  @scala.inline
  def BlockContentToken(level: Double, `type`: String): typingsSlinky.remarkable.libMod.BlockContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.BlockContentToken]
  }
  
  @scala.inline
  def BlockquoteCloseToken(level: Double, `type`: blockquote_close): typingsSlinky.remarkable.libMod.BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.BlockquoteCloseToken]
  }
  
  @scala.inline
  def BlockquoteOpenToken(level: Double, `type`: blockquote_open): typingsSlinky.remarkable.libMod.BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.BlockquoteOpenToken]
  }
  
  @scala.inline
  def BulletListCloseToken(level: Double, `type`: bullet_list_close): typingsSlinky.remarkable.libMod.BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.BulletListCloseToken]
  }
  
  @scala.inline
  def BulletListOpenToken(level: Double, `type`: bullet_list_open): typingsSlinky.remarkable.libMod.BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.BulletListOpenToken]
  }
  
  @scala.inline
  def CodeToken(block: Boolean, level: Double, `type`: code): typingsSlinky.remarkable.libMod.CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.CodeToken]
  }
  
  @scala.inline
  def ContentToken(level: Double, `type`: String): typingsSlinky.remarkable.libMod.ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ContentToken]
  }
  
  @scala.inline
  def DdCloseToken(level: Double, `type`: dd_close): typingsSlinky.remarkable.libMod.DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DdCloseToken]
  }
  
  @scala.inline
  def DdOpenToken(level: Double, `type`: dd_open): typingsSlinky.remarkable.libMod.DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DdOpenToken]
  }
  
  @scala.inline
  def DelCloseToken(level: Double, `type`: del_open): typingsSlinky.remarkable.libMod.DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DelCloseToken]
  }
  
  @scala.inline
  def DelOpenToken(level: Double, `type`: del_open): typingsSlinky.remarkable.libMod.DelOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DelOpenToken]
  }
  
  @scala.inline
  def DlCloseToken(level: Double, `type`: dl_close): typingsSlinky.remarkable.libMod.DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DlCloseToken]
  }
  
  @scala.inline
  def DlOpenToken(level: Double, `type`: dl_open): typingsSlinky.remarkable.libMod.DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DlOpenToken]
  }
  
  @scala.inline
  def DtCloseToken(level: Double, `type`: dt_close): typingsSlinky.remarkable.libMod.DtCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DtCloseToken]
  }
  
  @scala.inline
  def DtOpenToken(level: Double, `type`: dt_open): typingsSlinky.remarkable.libMod.DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.DtOpenToken]
  }
  
  @scala.inline
  def EmCloseToken(level: Double, `type`: em_close): typingsSlinky.remarkable.libMod.EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.EmCloseToken]
  }
  
  @scala.inline
  def EmOpenToken(level: Double, `type`: em_open): typingsSlinky.remarkable.libMod.EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.EmOpenToken]
  }
  
  @scala.inline
  def FenceToken(content: String, level: Double, params: String, `type`: fence): typingsSlinky.remarkable.libMod.FenceToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FenceToken]
  }
  
  @scala.inline
  def FootnoteAnchorToken(id: Double, level: Double, `type`: footnote_anchor): typingsSlinky.remarkable.libMod.FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteAnchorToken]
  }
  
  @scala.inline
  def FootnoteBlockCloseToken(level: Double, `type`: footnote_block_close): typingsSlinky.remarkable.libMod.FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteBlockCloseToken]
  }
  
  @scala.inline
  def FootnoteBlockOpenToken(level: Double, `type`: footnote_block_open): typingsSlinky.remarkable.libMod.FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteBlockOpenToken]
  }
  
  @scala.inline
  def FootnoteCloseToken(id: Double, level: Double, `type`: footnote_close): typingsSlinky.remarkable.libMod.FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteCloseToken]
  }
  
  @scala.inline
  def FootnoteGenericToken(id: Double, level: Double, `type`: String): typingsSlinky.remarkable.libMod.FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteGenericToken]
  }
  
  @scala.inline
  def FootnoteInlineToken(id: Double, level: Double, `type`: footnote_ref): typingsSlinky.remarkable.libMod.FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteInlineToken]
  }
  
  @scala.inline
  def FootnoteOpenToken(id: Double, level: Double, `type`: footnote_open): typingsSlinky.remarkable.libMod.FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteOpenToken]
  }
  
  @scala.inline
  def FootnoteReferenceCloseToken(id: Double, level: Double, `type`: footnote_reference_close): typingsSlinky.remarkable.libMod.FootnoteReferenceCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteReferenceCloseToken]
  }
  
  @scala.inline
  def FootnoteReferenceOpenToken(id: Double, label: String, level: Double, `type`: footnote_reference_open): typingsSlinky.remarkable.libMod.FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.FootnoteReferenceOpenToken]
  }
  
  @scala.inline
  def HardbreakToken(level: Double, `type`: hardbreak): typingsSlinky.remarkable.libMod.HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HardbreakToken]
  }
  
  @scala.inline
  def HeadingCloseToken(hLevel: HeadingValue, level: Double, `type`: heading_close): typingsSlinky.remarkable.libMod.HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HeadingCloseToken]
  }
  
  @scala.inline
  def HeadingOpenToken(hLevel: HeadingValue, level: Double, `type`: heading_open): typingsSlinky.remarkable.libMod.HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HeadingOpenToken]
  }
  
  @scala.inline
  def HeadingToken(hLevel: HeadingValue, level: Double, `type`: String): typingsSlinky.remarkable.libMod.HeadingToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HeadingToken]
  }
  
  @scala.inline
  def HrToken(level: Double, `type`: hr): typingsSlinky.remarkable.libMod.HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HrToken]
  }
  
  @scala.inline
  def HtmlBlockToken(block: `false`, content: String, level: Double, `type`: htmlblock): typingsSlinky.remarkable.libMod.HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HtmlBlockToken]
  }
  
  @scala.inline
  def HtmlTagToken(content: String, level: Double, `type`: htmltag): typingsSlinky.remarkable.libMod.HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.HtmlTagToken]
  }
  
  @scala.inline
  def ImageToken(alt: String, level: Double, src: String, title: String, `type`: image): typingsSlinky.remarkable.libMod.ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ImageToken]
  }
  
  @scala.inline
  def InsCloseToken(level: Double, `type`: ins_close): typingsSlinky.remarkable.libMod.InsCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.InsCloseToken]
  }
  
  @scala.inline
  def InsOpenToken(level: Double, `type`: ins_open): typingsSlinky.remarkable.libMod.InsOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.InsOpenToken]
  }
  
  @scala.inline
  def LinkCloseToken(level: Double, `type`: link_close): typingsSlinky.remarkable.libMod.LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.LinkCloseToken]
  }
  
  @scala.inline
  def LinkOpenToken(href: String, level: Double, `type`: link_open): typingsSlinky.remarkable.libMod.LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.LinkOpenToken]
  }
  
  @scala.inline
  def ListItemCloseToken(level: Double, `type`: list_item_close): typingsSlinky.remarkable.libMod.ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ListItemCloseToken]
  }
  
  @scala.inline
  def ListItemOpenToken(level: Double, `type`: list_item_open): typingsSlinky.remarkable.libMod.ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ListItemOpenToken]
  }
  
  @scala.inline
  def MarkCloseToken(level: Double, `type`: mark_close): typingsSlinky.remarkable.libMod.MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.MarkCloseToken]
  }
  
  @scala.inline
  def MarkOpenToken(level: Double, `type`: mark_open): typingsSlinky.remarkable.libMod.MarkOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.MarkOpenToken]
  }
  
  @scala.inline
  def OrderedListCloseToken(level: Double, `type`: ordered_list_close): typingsSlinky.remarkable.libMod.OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.OrderedListCloseToken]
  }
  
  @scala.inline
  def OrderedListOpenToken(level: Double, order: Double, `type`: ordered_list_open): typingsSlinky.remarkable.libMod.OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.OrderedListOpenToken]
  }
  
  @scala.inline
  def ParagraphCloseToken(level: Double, tight: Boolean, `type`: paragraph_close): typingsSlinky.remarkable.libMod.ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ParagraphCloseToken]
  }
  
  @scala.inline
  def ParagraphOpenToken(level: Double, tight: Boolean, `type`: paragraph_open): typingsSlinky.remarkable.libMod.ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ParagraphOpenToken]
  }
  
  @scala.inline
  def ParagraphToken(level: Double, tight: Boolean, `type`: String): typingsSlinky.remarkable.libMod.ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.ParagraphToken]
  }
  
  @scala.inline
  def SoftbreakToken(level: Double, `type`: softbreak): typingsSlinky.remarkable.libMod.SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.SoftbreakToken]
  }
  
  @scala.inline
  def StrongCloseToken(level: Double, `type`: strong_close): typingsSlinky.remarkable.libMod.StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.StrongCloseToken]
  }
  
  @scala.inline
  def StrongOpenToken(level: Double, `type`: strong_open): typingsSlinky.remarkable.libMod.StrongOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.StrongOpenToken]
  }
  
  @scala.inline
  def SubToken(content: String, level: Double, `type`: sub): typingsSlinky.remarkable.libMod.SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.SubToken]
  }
  
  @scala.inline
  def SupToken(content: String, level: Double, `type`: sup): typingsSlinky.remarkable.libMod.SupToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.SupToken]
  }
  
  @scala.inline
  def TBodyCloseToken(level: Double, `type`: tbody_close): typingsSlinky.remarkable.libMod.TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TBodyCloseToken]
  }
  
  @scala.inline
  def TBodyOpenToken(level: Double, `type`: tbody_open): typingsSlinky.remarkable.libMod.TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TBodyOpenToken]
  }
  
  @scala.inline
  def TDCloseToken(level: Double, `type`: td_close): typingsSlinky.remarkable.libMod.TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TDCloseToken]
  }
  
  @scala.inline
  def TDOpenToken(level: Double, `type`: td_open): typingsSlinky.remarkable.libMod.TDOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TDOpenToken]
  }
  
  @scala.inline
  def THCloseToken(level: Double, `type`: th_close): typingsSlinky.remarkable.libMod.THCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.THCloseToken]
  }
  
  @scala.inline
  def THOpenToken(level: Double, `type`: th_open): typingsSlinky.remarkable.libMod.THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.THOpenToken]
  }
  
  @scala.inline
  def THeadCloseToken(level: Double, `type`: thead_close): typingsSlinky.remarkable.libMod.THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.THeadCloseToken]
  }
  
  @scala.inline
  def THeadOpenToken(level: Double, `type`: thead_open): typingsSlinky.remarkable.libMod.THeadOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.THeadOpenToken]
  }
  
  @scala.inline
  def TRCloseToken(level: Double, `type`: tr_close): typingsSlinky.remarkable.libMod.TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TRCloseToken]
  }
  
  @scala.inline
  def TROpenToken(level: Double, `type`: tr_open): typingsSlinky.remarkable.libMod.TROpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TROpenToken]
  }
  
  @scala.inline
  def TableCloseToken(level: Double, `type`: table_close): typingsSlinky.remarkable.libMod.TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TableCloseToken]
  }
  
  @scala.inline
  def TableOpenToken(level: Double, `type`: table_open): typingsSlinky.remarkable.libMod.TableOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TableOpenToken]
  }
  
  @scala.inline
  def TagToken(level: Double, `type`: String): typingsSlinky.remarkable.libMod.TagToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TagToken]
  }
  
  @scala.inline
  def TextToken(level: Double, `type`: text): typingsSlinky.remarkable.libMod.TextToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.remarkable.libMod.TextToken]
  }
}
