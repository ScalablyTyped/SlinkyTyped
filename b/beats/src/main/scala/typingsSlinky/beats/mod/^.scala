package typingsSlinky.beats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("beats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = js.native
  def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = js.native
}

