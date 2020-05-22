package typingsSlinky.esfxInternalHashcode.mod

import typingsSlinky.esfxInternalHashcode.anon.BigIntSeed
import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/internal-hashcode", "hashUnknown")
@js.native
object hashUnknown extends js.Object {
  def apply(x: js.Any): Double = js.native
  def getState(): BigIntSeed = js.native
  @JSName("setState")
  def setState_getState(
    state: Partial[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: (x : unknown): number & @esfx/internal-hashcode.anon.TypeofhashUnknown['getState'] */ js.Any
      ]
    ]
  ): Unit = js.native
}

