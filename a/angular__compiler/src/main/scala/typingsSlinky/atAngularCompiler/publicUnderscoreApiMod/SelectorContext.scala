package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.SelectorContext[T] {
  def this(
    selector: typingsSlinky.atAngularCompiler.srcSelectorMod.CssSelector,
    cbContext: T,
    listContext: typingsSlinky.atAngularCompiler.srcSelectorMod.SelectorListContext
  ) = this()
}

