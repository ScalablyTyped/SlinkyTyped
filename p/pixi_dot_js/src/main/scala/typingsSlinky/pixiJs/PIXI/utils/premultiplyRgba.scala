package typingsSlinky.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.premultiplyRgba")
@js.native
object premultiplyRgba extends js.Object {
  def apply(rgb: js.Array[Double], alpha: Double): js.typedarray.Float32Array = js.native
  def apply(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def apply(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array, premultiply: Boolean): js.typedarray.Float32Array = js.native
  /**
    * combines rgb and alpha to out array
    *
    * @memberof PIXI.utils
    * @function premultiplyRgba
    * @param {Float32Array|number[]} rgb input rgb
    * @param {number} alpha alpha param
    * @param {Float32Array} [out] output
    * @param {boolean} [premultiply=true] do premultiply it
    * @returns {Float32Array} vec4 rgba
    */
  def apply(rgb: js.typedarray.Float32Array, alpha: Double): js.typedarray.Float32Array = js.native
  def apply(rgb: js.typedarray.Float32Array, alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def apply(
    rgb: js.typedarray.Float32Array,
    alpha: Double,
    out: js.typedarray.Float32Array,
    premultiply: Boolean
  ): js.typedarray.Float32Array = js.native
}

