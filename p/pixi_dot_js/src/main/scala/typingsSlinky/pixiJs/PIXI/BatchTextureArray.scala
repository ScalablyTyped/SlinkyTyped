package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the batcher to build texture batches.
  * Holds list of textures and their respective locations.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BatchTextureArray extends js.Object {
  /**
    * number of filled elements
    * @member {number} PIXI.BatchTextureArray#count
    */
  var count: Double = js.native
  /**
    * inside textures array
    * @member {PIXI.BaseTexture[]} PIXI.BatchTextureArray#elements
    */
  var elements: js.Array[BaseTexture] = js.native
  /**
    * Respective locations for textures
    * @member {number[]} PIXI.BatchTextureArray#ids
    */
  var ids: js.Array[Double] = js.native
}

object BatchTextureArray {
  @scala.inline
  def apply(count: Double, elements: js.Array[BaseTexture], ids: js.Array[Double]): BatchTextureArray = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTextureArray]
  }
  @scala.inline
  implicit class BatchTextureArrayOps[Self <: BatchTextureArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElements(value: js.Array[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

