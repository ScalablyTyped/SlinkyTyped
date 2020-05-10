package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkPictureRecorder extends SkObject[SkPictureRecorder] {
  def beginRecording(rect: SkRect): SkCanvas = js.native
  def finishRecordingAsPicture(): SkPicture = js.native
}

object SkPictureRecorder {
  @scala.inline
  def apply(
    beginRecording: SkRect => SkCanvas,
    delete: () => Unit,
    deleteAfter: () => Unit,
    finishRecordingAsPicture: () => SkPicture,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkPictureRecorder = {
    val __obj = js.Dynamic.literal(beginRecording = js.Any.fromFunction1(beginRecording), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), finishRecordingAsPicture = js.Any.fromFunction0(finishRecordingAsPicture), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[SkPictureRecorder]
  }
  @scala.inline
  implicit class SkPictureRecorderOps[Self <: SkPictureRecorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginRecording(value: SkRect => SkCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginRecording")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinishRecordingAsPicture(value: () => SkPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishRecordingAsPicture")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

