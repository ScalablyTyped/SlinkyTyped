package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected ()
  extends typingsSlinky.grammarkdown.nodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}

