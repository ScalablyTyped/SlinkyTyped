package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "R3TargetBinder")
@js.native
class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.R3TargetBinder[DirectiveT] {
  def this(directiveMatcher: typingsSlinky.angularCompiler.selectorMod.SelectorMatcher[DirectiveT]) = this()
}

