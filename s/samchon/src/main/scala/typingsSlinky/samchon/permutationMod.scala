package typingsSlinky.samchon

import typingsSlinky.samchon.icasegeneratorMod.ICaseGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/library/case_generators/Permutation", JSImport.Namespace)
@js.native
object permutationMod extends js.Object {
  @js.native
  class Permutation protected () extends ICaseGenerator {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: Double, r: Double) = this()
    /**
      * @hidden
      */
    var n_ : js.Any = js.native
    /**
      * @hidden
      */
    var r_ : js.Any = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * Get N, number of candidates.
      */
    def n(): Double = js.native
    /**
      * Get R, number of elements for each case.
      */
    def r(): Double = js.native
  }
  
}

