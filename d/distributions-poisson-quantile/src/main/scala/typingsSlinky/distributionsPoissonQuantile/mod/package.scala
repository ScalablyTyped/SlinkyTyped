package typingsSlinky.distributionsPoissonQuantile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = js.Array[scala.Double] | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  type MatrixCallback = js.Function4[
    /* d */ scala.Double, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    /* idx */ scala.Double, 
    scala.Double
  ]
}
