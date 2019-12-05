package typingsSlinky.jestDashDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff", JSImport.Namespace)
@js.native
object jestDashDiffMod extends js.Object {
  var getStringDiff: js.Function3[
    /* expected */ String, 
    /* received */ String, 
    /* options */ js.UndefOr[typingsSlinky.jestDashDiff.buildTypesMod.DiffOptions], 
    Anon_AnnotatedDiff | Anon_A | Null
  ] = js.native
  def apply(a: js.Any, b: js.Any): String | Null = js.native
  def apply(a: js.Any, b: js.Any, options: typingsSlinky.jestDashDiff.buildTypesMod.DiffOptions): String | Null = js.native
  type DiffOptions = typingsSlinky.jestDashDiff.buildTypesMod.DiffOptions
}

