package typingsSlinky.remarkable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  // ---------------
  // Specific Core Tokens
  // ---------------
  type AbbrToken = typingsSlinky.remarkable.libMod.TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type BlockParsingRule = js.Function4[
    /* state */ typingsSlinky.remarkable.libMod.StateBlock, 
    /* startLine */ scala.Double, 
    /* endLine */ scala.Double, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  // ---------------
  // Specific Block Tokens
  // ---------------
  type BlockquoteToken = typingsSlinky.remarkable.libMod.TagToken
  type BulletListToken = typingsSlinky.remarkable.libMod.TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type CoreParsingRule = js.Function1[/* state */ typingsSlinky.remarkable.libMod.StateInline, scala.Boolean]
  type DelToken = typingsSlinky.remarkable.libMod.TagToken
  type EmToken = typingsSlinky.remarkable.libMod.TagToken
  type Env = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FootnoteBlockToken = typingsSlinky.remarkable.libMod.TagToken
  type FootnoteReferenceToken = typingsSlinky.remarkable.libMod.FootnoteGenericToken
  type FootnoteToken = typingsSlinky.remarkable.libMod.FootnoteGenericToken
  type GetBreak = typingsSlinky.remarkable.libMod.Rule[
    typingsSlinky.remarkable.libMod.ContentToken, 
    typingsSlinky.remarkable.remarkableStrings._empty | typingsSlinky.remarkable.remarkableStrings.Linefeed
  ]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type InlineParsingRule = js.Function2[
    /* state */ typingsSlinky.remarkable.libMod.StateInline, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  type InsToken = typingsSlinky.remarkable.libMod.TagToken
  type LHeadingCloseToken = typingsSlinky.remarkable.libMod.HeadingCloseToken
  type LHeadingOpenToken = typingsSlinky.remarkable.libMod.HeadingOpenToken
  // ---------------
  // Specific Block Tokens
  // ---------------
  type LinkToken = typingsSlinky.remarkable.libMod.TagToken
  type ListItemToken = typingsSlinky.remarkable.libMod.TagToken
  type MarkToken = typingsSlinky.remarkable.libMod.TagToken
  type OrderedListToken = typingsSlinky.remarkable.libMod.TagToken
  type Plugin = js.Function2[
    /* md */ typingsSlinky.remarkable.libMod.Remarkable, 
    /* options */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Rule[T /* <: typingsSlinky.remarkable.libMod.TagToken */, R /* <: java.lang.String */] = js.Function5[
    /* tokens */ js.Array[T], 
    /* idx */ scala.Double, 
    /* options */ js.UndefOr[typingsSlinky.remarkable.libMod.Options], 
    /* env */ js.UndefOr[typingsSlinky.remarkable.libMod.Env], 
    /* instance */ js.UndefOr[typingsSlinky.remarkable.libMod.Remarkable], 
    R
  ]
  type StrongToken = typingsSlinky.remarkable.libMod.TagToken
  type TBodyToken = typingsSlinky.remarkable.libMod.TagToken
  type TDToken = typingsSlinky.remarkable.libMod.TagToken
  type THToken = typingsSlinky.remarkable.libMod.TagToken
  type THeadToken = typingsSlinky.remarkable.libMod.TagToken
  type TRToken = typingsSlinky.remarkable.libMod.TagToken
  type TableToken = typingsSlinky.remarkable.libMod.TagToken
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
  type Token = typingsSlinky.remarkable.libMod._Token | typingsSlinky.remarkable.libMod.BlockquoteToken | typingsSlinky.remarkable.libMod.FootnoteReferenceToken | typingsSlinky.remarkable.libMod.LHeadingOpenToken | typingsSlinky.remarkable.libMod.LHeadingCloseToken | typingsSlinky.remarkable.libMod.OrderedListToken | typingsSlinky.remarkable.libMod.BulletListToken | typingsSlinky.remarkable.libMod.ListItemToken | typingsSlinky.remarkable.libMod.StrongToken | typingsSlinky.remarkable.libMod.TableToken | typingsSlinky.remarkable.libMod.THeadToken | typingsSlinky.remarkable.libMod.TBodyToken | typingsSlinky.remarkable.libMod.TRToken | typingsSlinky.remarkable.libMod.THToken | typingsSlinky.remarkable.libMod.TDToken | typingsSlinky.remarkable.libMod.LinkToken | typingsSlinky.remarkable.libMod.DelToken | typingsSlinky.remarkable.libMod.EmToken | typingsSlinky.remarkable.libMod.InsToken | typingsSlinky.remarkable.libMod.MarkToken | typingsSlinky.remarkable.libMod.AbbrToken | typingsSlinky.remarkable.libMod.FootnoteToken | typingsSlinky.remarkable.libMod.FootnoteBlockToken
}
