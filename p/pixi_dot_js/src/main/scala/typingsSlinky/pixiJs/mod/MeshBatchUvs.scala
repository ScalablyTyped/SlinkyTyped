package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class controls cache for UV mapping from Texture normal space to BaseTexture normal space.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "MeshBatchUvs")
@js.native
class MeshBatchUvs protected ()
  extends typingsSlinky.pixiJs.PIXI.MeshBatchUvs {
  def this(uvBuffer: typingsSlinky.pixiJs.PIXI.Buffer, uvMatrix: typingsSlinky.pixiJs.PIXI.TextureMatrix) = this()
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  /* CompleteClass */
  override val data: js.typedarray.Float32Array = js.native
  /**
    * Buffer with normalized UV's
    * @member {PIXI.Buffer} PIXI.MeshBatchUvs#uvBuffer
    */
  /* CompleteClass */
  override var uvBuffer: typingsSlinky.pixiJs.PIXI.Buffer = js.native
  /**
    * Material UV matrix
    * @member {PIXI.TextureMatrix} PIXI.MeshBatchUvs#uvMatrix
    */
  /* CompleteClass */
  override var uvMatrix: typingsSlinky.pixiJs.PIXI.TextureMatrix = js.native
  /**
    * updates
    *
    * @param {boolean} forceUpdate - force the update
    */
  /* CompleteClass */
  override def update(forceUpdate: Boolean): Unit = js.native
}

