package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.anon.A
import typingsSlinky.jestDiff.anon.AnnotatedDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var getStringDiff: js.Function3[
    /* expected */ String, 
    /* received */ String, 
    /* options */ js.UndefOr[typingsSlinky.jestDiff.typesMod.DiffOptions], 
    AnnotatedDiff | A | Null
  ] = js.native
  def apply(a: js.Any, b: js.Any): String | Null = js.native
  def apply(a: js.Any, b: js.Any, options: typingsSlinky.jestDiff.typesMod.DiffOptions): String | Null = js.native
  type DiffOptions = typingsSlinky.jestDiff.typesMod.DiffOptions
}

