package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.LexicalSymbol
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends typingsSlinky.grammarkdown.nodesMod.OneOfSymbol {
  def this(oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}

