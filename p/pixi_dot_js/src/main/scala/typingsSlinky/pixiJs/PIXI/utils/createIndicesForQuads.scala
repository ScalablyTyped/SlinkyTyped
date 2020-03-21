package typingsSlinky.pixiJs.PIXI.utils

import typingsSlinky.std.Uint16Array
import typingsSlinky.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.createIndicesForQuads")
@js.native
object createIndicesForQuads extends js.Object {
  /**
    * Generic Mask Stack data structure
    *
    * @memberof PIXI.utils
    * @function createIndicesForQuads
    * @param {number} size - Number of quads
    * @param {Uint16Array|Uint32Array} [outBuffer] - Buffer for output, length has to be `6 * size`
    * @return {Uint16Array|Uint32Array} - Resulting index buffer
    */
  def apply(size: Double): scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
  def apply(size: Double, outBuffer: Uint16Array): scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
  def apply(size: Double, outBuffer: Uint32Array): scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
}

