package typingsSlinky.ranjs.mod

import typingsSlinky.ranjs.mod._ts.Commons
import typingsSlinky.ranjs.mod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "ts")
@js.native
object ts extends js.Object {
  @js.native
  class AC () extends Commons {
    def this(dimension: Double) = this()
    def this(dimension: Double, range: Double) = this()
    def this(dimension: Double, range: Double, maxSize: Double) = this()
    def compute(): js.Array[js.Array[Double]] = js.native
  }
  
  @js.native
  class Cov () extends Commons {
    def this(dimension: Double) = this()
    def compute(): Matrix = js.native
  }
  
}

