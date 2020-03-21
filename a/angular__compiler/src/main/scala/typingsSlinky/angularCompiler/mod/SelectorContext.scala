package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.SelectorContext[T] {
  def this(
    selector: typingsSlinky.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typingsSlinky.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

