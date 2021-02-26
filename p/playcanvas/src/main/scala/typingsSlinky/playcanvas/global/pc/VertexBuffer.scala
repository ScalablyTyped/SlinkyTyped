package typingsSlinky.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new vertex buffer object.
  * @param graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param format - The vertex format of this vertex buffer.
  * @param numVertices - The number of vertices that this vertex buffer will hold.
  * @param [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param [initialData] - Initial data.
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
    usage: js.UndefOr[scala.Nothing],
    initialData: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice,
    format: typingsSlinky.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: js.typedarray.ArrayBuffer
  ) = this()
}
