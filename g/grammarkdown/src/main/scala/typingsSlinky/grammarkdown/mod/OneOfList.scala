package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends typingsSlinky.grammarkdown.nodesMod.OneOfList {
  def this(
    oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[typingsSlinky.grammarkdown.nodesMod.Token[OfKeyword]],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typingsSlinky.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[typingsSlinky.grammarkdown.nodesMod.Token[OfKeyword]],
    indented: Boolean,
    terminals: js.Array[typingsSlinky.grammarkdown.nodesMod.Terminal]
  ) = this()
}

