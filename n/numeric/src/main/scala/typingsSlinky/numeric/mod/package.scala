package typingsSlinky.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CCSComparisonResult = js.Tuple3[
    typingsSlinky.numeric.mod.Vector, 
    typingsSlinky.numeric.mod.Vector, 
    typingsSlinky.numeric.mod.VectorBoolean
  ]
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[scala.Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[scala.Double]]
  type Matrix = js.Array[js.Array[scala.Double]]
  type MultidimensionalArray[T] = js.Array[
    js.Array[
      (js.Array[
        (js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    js.Array[
                      (js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]) | T
                    ]
                  ]) | T
                ]) | T
              ]) | T
            ]) | T
          ]) | T
        ]) | T
      ]) | T
    ]
  ]
  type MultidimensionalMatrix = typingsSlinky.numeric.mod.MultidimensionalArray[scala.Double]
  type Scalar = scala.Double
  type ShapeFunction = js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Boolean]
  type SparseMatrix = js.Tuple3[
    typingsSlinky.numeric.mod.Vector, 
    typingsSlinky.numeric.mod.Vector, 
    typingsSlinky.numeric.mod.Vector
  ]
  type Vector = js.Array[scala.Double]
  type VectorBoolean = js.Array[scala.Boolean]
}
