package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}

