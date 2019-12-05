package typingsSlinky.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.distNodesMod.Node[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def apply[T](
    node: typingsSlinky.grammarkdown.distNodesMod.Node[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.distNodesMod.Node[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
}

