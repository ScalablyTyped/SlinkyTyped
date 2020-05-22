package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Mesh")
@js.native
class Mesh protected ()
  extends typingsSlinky.phaser.spine.webgl.Mesh {
  def this(
    context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext,
    attributes: js.Array[typingsSlinky.phaser.spine.webgl.VertexAttribute],
    maxVertices: Double,
    maxIndices: Double
  ) = this()
  def this(
    context: WebGLRenderingContext,
    attributes: js.Array[typingsSlinky.phaser.spine.webgl.VertexAttribute],
    maxVertices: Double,
    maxIndices: Double
  ) = this()
  /* CompleteClass */
  override var attributes: js.Any = js.native
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var dirtyIndices: js.Any = js.native
  /* CompleteClass */
  override var dirtyVertices: js.Any = js.native
  /* CompleteClass */
  override var elementsPerVertex: js.Any = js.native
  /* CompleteClass */
  override var indices: js.Any = js.native
  /* CompleteClass */
  override var indicesBuffer: js.Any = js.native
  /* CompleteClass */
  override var indicesLength: js.Any = js.native
  /* CompleteClass */
  override var update: js.Any = js.native
  /* CompleteClass */
  override var vertices: js.Any = js.native
  /* CompleteClass */
  override var verticesBuffer: js.Any = js.native
  /* CompleteClass */
  override var verticesLength: js.Any = js.native
  /* CompleteClass */
  override def bind(shader: typingsSlinky.phaser.spine.webgl.Shader): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def draw(shader: typingsSlinky.phaser.spine.webgl.Shader, primitiveType: Double): Unit = js.native
  /* CompleteClass */
  override def drawWithOffset(
    shader: typingsSlinky.phaser.spine.webgl.Shader,
    primitiveType: Double,
    offset: Double,
    count: Double
  ): Unit = js.native
  /* CompleteClass */
  override def getAttributes(): js.Array[typingsSlinky.phaser.spine.webgl.VertexAttribute] = js.native
  /* CompleteClass */
  override def getIndices(): js.typedarray.Uint16Array = js.native
  /* CompleteClass */
  override def getVertexSizeInFloats(): Double = js.native
  /* CompleteClass */
  override def getVertices(): js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override def maxIndices(): Double = js.native
  /* CompleteClass */
  override def maxVertices(): Double = js.native
  /* CompleteClass */
  override def numIndices(): Double = js.native
  /* CompleteClass */
  override def numVertices(): Double = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def setIndices(indices: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def setIndicesLength(length: Double): Unit = js.native
  /* CompleteClass */
  override def setVertices(vertices: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def setVerticesLength(length: Double): Unit = js.native
  /* CompleteClass */
  override def unbind(shader: typingsSlinky.phaser.spine.webgl.Shader): Unit = js.native
}

