package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Import")
@js.native
class Import protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.Import {
  def this(
    atToken: typingsSlinky.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typingsSlinky.grammarkdown.distNodesMod.Token[ImportKeyword],
    path: typingsSlinky.grammarkdown.distNodesMod.StringLiteral
  ) = this()
}

