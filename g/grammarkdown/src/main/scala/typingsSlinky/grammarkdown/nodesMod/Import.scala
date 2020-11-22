package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Import]
     with MetaElement {
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword]) = this()
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword], path: StringLiteral) = this()
  
  val importKeyword: Token[ImportKeyword] = js.native
  
  val path: js.UndefOr[StringLiteral] = js.native
}
