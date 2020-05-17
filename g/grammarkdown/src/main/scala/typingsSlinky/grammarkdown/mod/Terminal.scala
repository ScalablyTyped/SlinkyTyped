package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Terminal")
@js.native
class Terminal ()
  extends typingsSlinky.grammarkdown.nodesMod.Terminal {
  def this(text: String) = this()
  def this(text: String, questionToken: typingsSlinky.grammarkdown.nodesMod.Token[QuestionToken]) = this()
}

