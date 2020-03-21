package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Simple Mesh class mimics Mesh in PixiJS v4, providing easy-to-use constructor arguments.
  * For more robust customization, use {@link PIXI.Mesh}.
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  */
@JSImport("pixi.js", "SimpleMesh")
@js.native
class SimpleMesh ()
  extends typingsSlinky.pixiJs.PIXI.SimpleMesh {
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, vertices: scala.scalajs.js.typedarray.Float32Array) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array,
    indices: scala.scalajs.js.typedarray.Uint16Array
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array,
    indices: scala.scalajs.js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
}

