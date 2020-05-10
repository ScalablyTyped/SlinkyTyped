package typingsSlinky.ionicUtilsStream.mod

import typingsSlinky.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBufferOptions extends ReadableOptions {
  var allocSize: js.UndefOr[Double] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var growSize: js.UndefOr[Double] = js.native
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
  @scala.inline
  implicit class ReadableStreamBufferOptionsOps[Self <: ReadableStreamBufferOptions] (val x: Self) extends AnyVal {
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
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
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

