package typingsSlinky.pumpify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PumpifyFactoryOptions extends js.Object {
  var autoDestroy: Boolean = js.native
  var destroy: Boolean = js.native
  var highWaterMark: Double = js.native
  var objectMode: Boolean = js.native
}

object PumpifyFactoryOptions {
  @scala.inline
  def apply(autoDestroy: Boolean, destroy: Boolean, highWaterMark: Double, objectMode: Boolean): PumpifyFactoryOptions = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PumpifyFactoryOptions]
  }
  @scala.inline
  implicit class PumpifyFactoryOptionsOps[Self <: PumpifyFactoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

