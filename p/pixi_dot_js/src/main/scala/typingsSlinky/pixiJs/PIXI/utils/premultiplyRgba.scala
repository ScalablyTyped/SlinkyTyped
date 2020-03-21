package typingsSlinky.pixiJs.PIXI.utils

import typingsSlinky.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.premultiplyRgba")
@js.native
object premultiplyRgba extends js.Object {
  def apply(rgb: js.Array[Double], alpha: Double): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(rgb: js.Array[Double], alpha: Double, out: scala.scalajs.js.typedarray.Float32Array): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(
    rgb: js.Array[Double],
    alpha: Double,
    out: scala.scalajs.js.typedarray.Float32Array,
    premultiply: Boolean
  ): scala.scalajs.js.typedarray.Float32Array = js.native
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
  def apply(rgb: Float32Array, alpha: Double): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(rgb: Float32Array, alpha: Double, out: scala.scalajs.js.typedarray.Float32Array): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(
    rgb: Float32Array,
    alpha: Double,
    out: scala.scalajs.js.typedarray.Float32Array,
    premultiply: Boolean
  ): scala.scalajs.js.typedarray.Float32Array = js.native
}

