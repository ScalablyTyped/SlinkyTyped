package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.ProseFragment
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.Prose {
  def this(greaterThanToken: typingsSlinky.grammarkdown.distNodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typingsSlinky.grammarkdown.distNodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}

