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
}

