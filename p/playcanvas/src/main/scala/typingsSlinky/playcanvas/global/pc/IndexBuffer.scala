package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  * // The buffer is marked as static, hinting that the buffer will never be modified
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param graphicsDevice - The graphics device used to manage this index buffer.
  * @param format - The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param numIndices - The number of indices to be stored in the index buffer.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
  */
@JSGlobal("pc.IndexBuffer")
@js.native
class IndexBuffer protected ()
  extends typingsSlinky.playcanvas.pc.IndexBuffer {
  def this(graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice, format: Double, numIndices: Double) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: js.UndefOr[scala.Nothing],
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: Double,
    numIndices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
}

