package typingsSlinky.pixiJs.global.PIXI

import typingsSlinky.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper for data so that it can be used and uploaded by WebGL
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Buffer")
@js.native
class Buffer protected ()
  extends typingsSlinky.pixiJs.PIXI.Buffer {
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.ArrayBufferView) = this()
  def this(data: SharedArrayBuffer) = this()
  def this(data: js.typedarray.ArrayBufferView, _static: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean) = this()
  def this(data: js.typedarray.ArrayBufferView, _static: js.UndefOr[scala.Nothing], index: Boolean) = this()
  def this(data: js.typedarray.ArrayBufferView, _static: Boolean, index: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: js.UndefOr[scala.Nothing], index: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: js.UndefOr[scala.Nothing], index: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean, index: Boolean) = this()
}

/* static members */
@JSGlobal("PIXI.Buffer")
@js.native
object Buffer extends js.Object {
  def from(data: js.Array[Double]): typingsSlinky.pixiJs.PIXI.Buffer = js.native
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    *
    * @static
    * @param {ArrayBufferView | number[]} data - the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @return {PIXI.Buffer} A new Buffer based on the data provided.
    */
  def from(data: js.typedarray.ArrayBufferView): typingsSlinky.pixiJs.PIXI.Buffer = js.native
}

