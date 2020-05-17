package typingsSlinky.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.remarkable.libMod.BlockContentToken
  - typingsSlinky.remarkable.libMod.ContentToken
  - typingsSlinky.remarkable.libMod.TagToken
  - typingsSlinky.remarkable.libMod.BlockquoteToken
  - typingsSlinky.remarkable.libMod.BlockquoteOpenToken
  - typingsSlinky.remarkable.libMod.BlockquoteCloseToken
  - typingsSlinky.remarkable.libMod.CodeToken
  - typingsSlinky.remarkable.libMod.DlOpenToken
  - typingsSlinky.remarkable.libMod.DlCloseToken
  - typingsSlinky.remarkable.libMod.DtOpenToken
  - typingsSlinky.remarkable.libMod.DtCloseToken
  - typingsSlinky.remarkable.libMod.DdOpenToken
  - typingsSlinky.remarkable.libMod.DdCloseToken
  - typingsSlinky.remarkable.libMod.FenceToken
  - typingsSlinky.remarkable.libMod.FootnoteGenericToken
  - typingsSlinky.remarkable.libMod.FootnoteReferenceToken
  - typingsSlinky.remarkable.libMod.FootnoteReferenceOpenToken
  - typingsSlinky.remarkable.libMod.FootnoteReferenceCloseToken
  - typingsSlinky.remarkable.libMod.HeadingToken
  - typingsSlinky.remarkable.libMod.HeadingOpenToken
  - typingsSlinky.remarkable.libMod.HeadingCloseToken
  - typingsSlinky.remarkable.libMod.HrToken
  - typingsSlinky.remarkable.libMod.HtmlBlockToken
  - typingsSlinky.remarkable.libMod.LHeadingOpenToken
  - typingsSlinky.remarkable.libMod.LHeadingCloseToken
  - typingsSlinky.remarkable.libMod.OrderedListToken
  - typingsSlinky.remarkable.libMod.OrderedListOpenToken
  - typingsSlinky.remarkable.libMod.OrderedListCloseToken
  - typingsSlinky.remarkable.libMod.BulletListToken
  - typingsSlinky.remarkable.libMod.BulletListOpenToken
  - typingsSlinky.remarkable.libMod.BulletListCloseToken
  - typingsSlinky.remarkable.libMod.ListItemToken
  - typingsSlinky.remarkable.libMod.ListItemOpenToken
  - typingsSlinky.remarkable.libMod.ListItemCloseToken
  - typingsSlinky.remarkable.libMod.ParagraphToken
  - typingsSlinky.remarkable.libMod.ParagraphOpenToken
  - typingsSlinky.remarkable.libMod.ParagraphCloseToken
  - typingsSlinky.remarkable.libMod.TextToken
  - typingsSlinky.remarkable.libMod.StrongToken
  - typingsSlinky.remarkable.libMod.StrongOpenToken
  - typingsSlinky.remarkable.libMod.StrongCloseToken
  - typingsSlinky.remarkable.libMod.TableToken
  - typingsSlinky.remarkable.libMod.TableOpenToken
  - typingsSlinky.remarkable.libMod.TableCloseToken
  - typingsSlinky.remarkable.libMod.THeadToken
  - typingsSlinky.remarkable.libMod.THeadOpenToken
  - typingsSlinky.remarkable.libMod.THeadCloseToken
  - typingsSlinky.remarkable.libMod.TBodyToken
  - typingsSlinky.remarkable.libMod.TBodyOpenToken
  - typingsSlinky.remarkable.libMod.TBodyCloseToken
  - typingsSlinky.remarkable.libMod.TRToken
  - typingsSlinky.remarkable.libMod.TROpenToken
  - typingsSlinky.remarkable.libMod.TRCloseToken
  - typingsSlinky.remarkable.libMod.THToken
  - typingsSlinky.remarkable.libMod.THOpenToken
  - typingsSlinky.remarkable.libMod.THCloseToken
  - typingsSlinky.remarkable.libMod.TDToken
  - typingsSlinky.remarkable.libMod.TDOpenToken
  - typingsSlinky.remarkable.libMod.TDCloseToken
  - typingsSlinky.remarkable.libMod.LinkToken
  - typingsSlinky.remarkable.libMod.LinkOpenToken
  - typingsSlinky.remarkable.libMod.LinkCloseToken
  - typingsSlinky.remarkable.libMod.DelToken
  - typingsSlinky.remarkable.libMod.DelOpenToken
  - typingsSlinky.remarkable.libMod.DelCloseToken
  - typingsSlinky.remarkable.libMod.EmToken
  - typingsSlinky.remarkable.libMod.EmOpenToken
  - typingsSlinky.remarkable.libMod.EmCloseToken
  - typingsSlinky.remarkable.libMod.HardbreakToken
  - typingsSlinky.remarkable.libMod.SoftbreakToken
  - typingsSlinky.remarkable.libMod.FootnoteInlineToken
  - typingsSlinky.remarkable.libMod.HtmlTagToken
  - typingsSlinky.remarkable.libMod.InsToken
  - typingsSlinky.remarkable.libMod.InsOpenToken
  - typingsSlinky.remarkable.libMod.InsCloseToken
  - typingsSlinky.remarkable.libMod.ImageToken
  - typingsSlinky.remarkable.libMod.MarkToken
  - typingsSlinky.remarkable.libMod.MarkOpenToken
  - typingsSlinky.remarkable.libMod.MarkCloseToken
  - typingsSlinky.remarkable.libMod.SubToken
  - typingsSlinky.remarkable.libMod.SupToken
  - typingsSlinky.remarkable.libMod.AbbrToken
  - typingsSlinky.remarkable.libMod.AbbrOpenToken
  - typingsSlinky.remarkable.libMod.AbbrCloseToken
  - typingsSlinky.remarkable.libMod.FootnoteToken
  - typingsSlinky.remarkable.libMod.FootnoteOpenToken
  - typingsSlinky.remarkable.libMod.FootnoteCloseToken
  - typingsSlinky.remarkable.libMod.FootnoteBlockToken
  - typingsSlinky.remarkable.libMod.FootnoteBlockOpenToken
  - typingsSlinky.remarkable.libMod.FootnoteBlockCloseToken
  - typingsSlinky.remarkable.libMod.FootnoteAnchorToken
*/
trait Token extends js.Object

object Token {
  @scala.inline
  implicit def apply(
    value: AbbrToken | BlockquoteToken | BulletListToken | DelToken | EmToken | FootnoteBlockToken | FootnoteGenericToken | FootnoteReferenceToken | FootnoteToken | HeadingCloseToken | HeadingOpenToken | InsToken | LHeadingCloseToken | LHeadingOpenToken | LinkToken | ListItemToken | MarkToken | OrderedListToken | StrongToken | TBodyToken | TDToken | THToken | THeadToken | TRToken | TableToken | TagToken
  ): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: AbbrCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: AbbrOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BlockContentToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BlockquoteCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BlockquoteOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BulletListCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BulletListOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: CodeToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ContentToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DdCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DdOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DelCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DelOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DlCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DlOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DtCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: DtOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: EmCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: EmOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FenceToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteAnchorToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteBlockCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteBlockOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteInlineToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteReferenceCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: FootnoteReferenceOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HardbreakToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HeadingToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HrToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HtmlBlockToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HtmlTagToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ImageToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: InsCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: InsOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: LinkCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: LinkOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListItemCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListItemOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: MarkCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: MarkOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: OrderedListCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: OrderedListOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ParagraphCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ParagraphOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ParagraphToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: SoftbreakToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: StrongCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: StrongOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: SubToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: SupToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TBodyCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TBodyOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TDCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TDOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: THCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: THOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: THeadCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: THeadOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TRCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TROpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TableCloseToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TableOpenToken): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: TextToken): Token = value.asInstanceOf[Token]
}

