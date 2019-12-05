package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.LexicalSymbol
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.OneOfSymbol {
  def this(oneKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}

