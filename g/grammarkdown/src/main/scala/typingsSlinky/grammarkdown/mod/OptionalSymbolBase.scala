package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.OptionalSymbolKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typingsSlinky.grammarkdown.nodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typingsSlinky.grammarkdown.nodesMod.Token[QuestionToken]) = this()
}
