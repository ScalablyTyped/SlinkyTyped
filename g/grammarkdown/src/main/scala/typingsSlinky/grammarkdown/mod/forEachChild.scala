package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](
    node: js.UndefOr[
      typingsSlinky.grammarkdown.nodesMod.Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind]
    ],
    cbNode: js.Function1[
      /* node */ typingsSlinky.grammarkdown.nodesMod.Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
}

