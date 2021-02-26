package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.OptionalSymbolKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected () extends PrimarySymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: Token[QuestionToken]) = this()
  
  val questionToken: js.UndefOr[Token[QuestionToken]] = js.native
}
