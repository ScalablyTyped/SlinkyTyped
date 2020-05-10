package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContext extends js.Object {
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): Unit = js.native
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): Unit = js.native
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): Unit = js.native
}

object CameraContext {
  @scala.inline
  def apply(
    startRecord: StartRecordOptions => Unit,
    stopRecord: StopRecordOptions => Unit,
    takePhoto: TakePhotoOptions => Unit
  ): CameraContext = {
    val __obj = js.Dynamic.literal(startRecord = js.Any.fromFunction1(startRecord), stopRecord = js.Any.fromFunction1(stopRecord), takePhoto = js.Any.fromFunction1(takePhoto))
    __obj.asInstanceOf[CameraContext]
  }
  @scala.inline
  implicit class CameraContextOps[Self <: CameraContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartRecord(value: StartRecordOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopRecord(value: StopRecordOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTakePhoto(value: TakePhotoOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takePhoto")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

