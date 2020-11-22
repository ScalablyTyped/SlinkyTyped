package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Import] {
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword]) = this()
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword], path: StringLiteral) = this()
  
  val importKeyword: Token[ImportKeyword] = js.native
  
  val path: js.UndefOr[StringLiteral] = js.native
}
