package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ImportKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Import")
@js.native
class Import protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Import {
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typingsSlinky.grammarkdown.nodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typingsSlinky.grammarkdown.nodesMod.Token[ImportKeyword],
    path: typingsSlinky.grammarkdown.nodesMod.StringLiteral
  ) = this()
}
