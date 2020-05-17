package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geometry used to batch standard PIXI content (e.g. Mesh, Sprite, Graphics objects).
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BatchGeometry extends js.Object {
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  var _buffer: Buffer = js.native
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  var _indexBuffer: Buffer = js.native
}

object BatchGeometry {
  @scala.inline
  def apply(_buffer: Buffer, _indexBuffer: Buffer): BatchGeometry = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGeometry]
  }
  @scala.inline
  implicit class BatchGeometryOps[Self <: BatchGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_buffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indexBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

