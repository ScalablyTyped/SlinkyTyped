package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.SelectorContext[T] {
  def this(
    selector: typingsSlinky.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typingsSlinky.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

