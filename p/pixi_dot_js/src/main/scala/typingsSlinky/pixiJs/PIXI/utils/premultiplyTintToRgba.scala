package typingsSlinky.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.premultiplyTintToRgba")
@js.native
object premultiplyTintToRgba extends js.Object {
  /**
    * converts integer tint and float alpha to vec4 form, premultiplies by default
    *
    * @memberof PIXI.utils
    * @function premultiplyTintToRgba
    * @param {number} tint input tint
    * @param {number} alpha alpha param
    * @param {Float32Array} [out] output
    * @param {boolean} [premultiply=true] do premultiply it
    * @returns {Float32Array} vec4 rgba
    */
  def apply(tint: Double, alpha: Double): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(tint: Double, alpha: Double, out: scala.scalajs.js.typedarray.Float32Array): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(tint: Double, alpha: Double, out: scala.scalajs.js.typedarray.Float32Array, premultiply: Boolean): scala.scalajs.js.typedarray.Float32Array = js.native
}

