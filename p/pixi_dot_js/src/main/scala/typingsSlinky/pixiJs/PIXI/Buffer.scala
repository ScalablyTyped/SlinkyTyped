package typingsSlinky.pixiJs.PIXI

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
class Buffer protected () extends js.Object {
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.ArrayBufferView) = this()
  def this(data: SharedArrayBuffer) = this()
  def this(data: js.typedarray.ArrayBufferView, _static: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean) = this()
  def this(data: js.typedarray.ArrayBufferView, _static: Boolean, index: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean, index: Boolean) = this()
  /**
    * The data in the buffer, as a typed array
    *
    * @member {ArrayBuffer| SharedArrayBuffer|ArrayBufferView} PIXI.Buffer#data
    */
  var data: js.typedarray.ArrayBuffer | SharedArrayBuffer | js.typedarray.ArrayBufferView = js.native
  /**
    * Destroys the buffer
    */
  def destroy(): Unit = js.native
  /**
    * disposes WebGL resources that are connected to this geometry
    */
  def dispose(): Unit = js.native
  /**
    * flags this buffer as requiring an upload to the GPU
    * @param {ArrayBuffer|SharedArrayBuffer|ArrayBufferView} [data] the data to update in the buffer.
    */
  def update(): Unit = js.native
  def update(data: js.typedarray.ArrayBuffer): Unit = js.native
  def update(data: js.typedarray.ArrayBufferView): Unit = js.native
  def update(data: SharedArrayBuffer): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Buffer")
@js.native
object Buffer extends js.Object {
  def from(data: js.Array[Double]): Buffer = js.native
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    *
    * @static
    * @param {ArrayBufferView | number[]} data the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @return {PIXI.Buffer} A new Buffer based on the data provided.
    */
  def from(data: js.typedarray.ArrayBufferView): Buffer = js.native
}

