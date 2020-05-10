package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobEventInit extends EventInit {
  var data: Blob = js.native
  var timecode: js.UndefOr[Double] = js.native
}

object BlobEventInit {
  @scala.inline
  def apply(data: Blob): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
  @scala.inline
  implicit class BlobEventInitOps[Self <: BlobEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimecode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecode")(js.undefined)
        ret
    }
  }
  
}

