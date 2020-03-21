package typingsSlinky.pixiJs.PIXI

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
@JSGlobal("PIXI.SimpleMesh")
@js.native
class SimpleMesh () extends Mesh {
  def this(texture: Texture) = this()
  def this(texture: Texture, vertices: scala.scalajs.js.typedarray.Float32Array) = this()
  def this(
    texture: Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array
  ) = this()
  def this(
    texture: Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array,
    indices: scala.scalajs.js.typedarray.Uint16Array
  ) = this()
  def this(
    texture: Texture,
    vertices: scala.scalajs.js.typedarray.Float32Array,
    uvs: scala.scalajs.js.typedarray.Float32Array,
    indices: scala.scalajs.js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
  /**
    * upload vertices buffer each frame
    * @member {boolean} PIXI.SimpleMesh#autoUpdate
    */
  var autoUpdate: Boolean = js.native
  /**
    * Collection of vertices data.
    * @member {Float32Array}
    */
  var vertices: scala.scalajs.js.typedarray.Float32Array = js.native
}

