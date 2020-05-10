package typingsSlinky.archiver.mod

import typingsSlinky.archiver.AnonProcessed
import typingsSlinky.archiver.AnonProcessedBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressData extends js.Object {
  var entries: AnonProcessed = js.native
  var fs: AnonProcessedBytes = js.native
}

object ProgressData {
  @scala.inline
  def apply(entries: AnonProcessed, fs: AnonProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
  @scala.inline
  implicit class ProgressDataOps[Self <: ProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: AnonProcessed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFs(value: AnonProcessedBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

