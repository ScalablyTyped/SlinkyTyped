package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the batcher to draw batches.
  * Each one of these contains all information required to draw a bound geometry.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BatchDrawCall extends js.Object {
  /**
    * data for uniforms or custom webgl state
    * @member {object} PIXI.BatchDrawCall#data
    */
  var data: js.Any = js.native
}

object BatchDrawCall {
  @scala.inline
  def apply(data: js.Any): BatchDrawCall = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDrawCall]
  }
  @scala.inline
  implicit class BatchDrawCallOps[Self <: BatchDrawCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

