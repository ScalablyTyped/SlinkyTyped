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
@js.native
trait Buffer extends js.Object {
  /**
    * The data in the buffer, as a typed array
    *
    * @member {ArrayBuffer| SharedArrayBuffer | ArrayBufferView} PIXI.Buffer#data
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
    * @param {ArrayBuffer|SharedArrayBuffer|ArrayBufferView} [data] - the data to update in the buffer.
    */
  def update(): Unit = js.native
  def update(data: js.typedarray.ArrayBuffer): Unit = js.native
  def update(data: js.typedarray.ArrayBufferView): Unit = js.native
  def update(data: SharedArrayBuffer): Unit = js.native
}

