package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distNodesMod.MetaElementKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typingsSlinky.grammarkdown.distNodesMod.Token[AtToken]) = this()
}

