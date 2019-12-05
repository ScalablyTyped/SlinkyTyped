package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.OptionalSymbolKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typingsSlinky.grammarkdown.distNodesMod.Token[QuestionToken]) = this()
}

