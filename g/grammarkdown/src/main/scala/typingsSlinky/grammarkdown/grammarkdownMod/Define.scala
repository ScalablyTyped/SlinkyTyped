package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.BooleanKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Define")
@js.native
class Define protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.Define {
  def this(
    atToken: typingsSlinky.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typingsSlinky.grammarkdown.distNodesMod.Identifier
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typingsSlinky.grammarkdown.distNodesMod.Identifier,
    valueToken: typingsSlinky.grammarkdown.distNodesMod.Token[BooleanKind]
  ) = this()
}

