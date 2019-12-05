package typingsSlinky.grammarkdown.distNodesMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.Import] {
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword]) = this()
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword], path: StringLiteral) = this()
  val importKeyword: Token[ImportKeyword] = js.native
  val path: js.UndefOr[StringLiteral] = js.native
}

