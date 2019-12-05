package typingsSlinky.grammarkdown.distNodesMod

import typingsSlinky.grammarkdown.distTokensMod.BooleanKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.Define] {
  def this(atToken: Token[AtToken], defineKeyword: Token[DefineKeyword], key: Identifier) = this()
  def this(
    atToken: Token[AtToken],
    defineKeyword: Token[DefineKeyword],
    key: Identifier,
    valueToken: Token[BooleanKind]
  ) = this()
  val defineKeyword: Token[DefineKeyword] = js.native
  val key: Identifier = js.native
  val valueToken: js.UndefOr[Token[BooleanKind]] = js.native
}

