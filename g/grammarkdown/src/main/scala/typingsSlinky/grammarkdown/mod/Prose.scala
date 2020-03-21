package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.ProseFragment
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Prose {
  def this(greaterThanToken: typingsSlinky.grammarkdown.nodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typingsSlinky.grammarkdown.nodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}

