package typingsSlinky.ionicUtilsStream.mod

import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamBufferOptions extends WritableOptions {
  var allocSize: js.UndefOr[Double] = js.native
  var growSize: js.UndefOr[Double] = js.native
}

object WritableStreamBufferOptions {
  @scala.inline
  def apply(): WritableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableStreamBufferOptions]
  }
  @scala.inline
  implicit class WritableStreamBufferOptionsOps[Self <: WritableStreamBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growSize")(js.undefined)
        ret
    }
  }
  
}

