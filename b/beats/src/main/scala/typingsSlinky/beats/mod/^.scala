package typingsSlinky.beats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("beats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    scala.scalajs.js.typedarray.Float32Array
  ] = js.native
  def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    scala.scalajs.js.typedarray.Float32Array
  ] = js.native
}

