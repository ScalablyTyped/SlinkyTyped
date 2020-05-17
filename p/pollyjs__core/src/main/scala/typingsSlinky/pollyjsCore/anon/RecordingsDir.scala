package typingsSlinky.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingsDir extends js.Object {
  var recordingsDir: js.UndefOr[String] = js.native
}

object RecordingsDir {
  @scala.inline
  def apply(): RecordingsDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingsDir]
  }
  @scala.inline
  implicit class RecordingsDirOps[Self <: RecordingsDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordingsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingsDir")(js.undefined)
        ret
    }
  }
  
}

