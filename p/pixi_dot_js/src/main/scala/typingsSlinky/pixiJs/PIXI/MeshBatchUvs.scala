package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class controls cache for UV mapping from Texture normal space to BaseTexture normal space.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait MeshBatchUvs extends js.Object {
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  val data: js.typedarray.Float32Array = js.native
  /**
    * Buffer with normalized UV's
    * @member {PIXI.Buffer} PIXI.MeshBatchUvs#uvBuffer
    */
  var uvBuffer: Buffer = js.native
  /**
    * Material UV matrix
    * @member {PIXI.TextureMatrix} PIXI.MeshBatchUvs#uvMatrix
    */
  var uvMatrix: TextureMatrix = js.native
  /**
    * updates
    *
    * @param {boolean} forceUpdate - force the update
    */
  def update(forceUpdate: Boolean): Unit = js.native
}

object MeshBatchUvs {
  @scala.inline
  def apply(
    data: js.typedarray.Float32Array,
    update: Boolean => Unit,
    uvBuffer: Buffer,
    uvMatrix: TextureMatrix
  ): MeshBatchUvs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), uvBuffer = uvBuffer.asInstanceOf[js.Any], uvMatrix = uvMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshBatchUvs]
  }
  @scala.inline
  implicit class MeshBatchUvsOps[Self <: MeshBatchUvs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUvBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUvMatrix(value: TextureMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvMatrix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

