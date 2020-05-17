package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.VertexBuffer
  * @classdesc A vertex buffer is the mechanism via which the application specifies vertex
  * data to the graphics hardware.
  * @description Creates a new vertex buffer object.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param {pc.VertexFormat} format - The vertex format of this vertex buffer.
  * @param {number} numVertices - The number of vertices that this vertex buffer will hold.
  * @param {number} [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] - Initial data.
  */
@JSGlobal("pc.VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typingsSlinky.playcanvas.pc.VertexBuffer {
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: typingsSlinky.playcanvas.pc.VertexFormat,
    numVertices: Double
  ) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: typingsSlinky.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: typingsSlinky.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
}

