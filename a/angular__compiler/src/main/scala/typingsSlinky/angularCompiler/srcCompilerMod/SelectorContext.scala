package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsSlinky.angularCompiler.selectorMod.SelectorContext[T] {
  def this(
    selector: typingsSlinky.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typingsSlinky.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

