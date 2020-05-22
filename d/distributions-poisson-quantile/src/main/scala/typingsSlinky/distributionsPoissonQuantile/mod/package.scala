package typingsSlinky.distributionsPoissonQuantile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = js.Array[scala.Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  type MatrixCallback = js.Function4[
    /* d */ scala.Double, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    /* idx */ scala.Double, 
    scala.Double
  ]
}
