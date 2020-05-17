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
}
