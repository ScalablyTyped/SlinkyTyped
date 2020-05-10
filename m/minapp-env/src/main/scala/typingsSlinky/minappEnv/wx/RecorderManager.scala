package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderManager extends js.Object {
  /** [RecorderManager.onError(function callback)](RecorderManager.onError.md)
    *
    * 监听录音错误事件 */
  def onError(/** 录音错误事件的回调函数 */
  callback: RecorderManagerOnErrorCallback): Unit = js.native
  /** [RecorderManager.onFrameRecorded(function callback)](RecorderManager.onFrameRecorded.md)
    *
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。 */
  def onFrameRecorded(/** 已录制完指定帧大小的文件事件的回调函数 */
  callback: OnFrameRecordedCallback): Unit = js.native
  /** [RecorderManager.onInterruptionBegin(function callback)](RecorderManager.onInterruptionBegin.md)
    *
    * 监听录音因为受到系统占用而被中断开始事件。以下场景会触发此事件：微信语音聊天、微信视频聊天。此事件触发后，录音会被暂停。pause 事件在此事件后触发
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionBegin(/** 录音因为受到系统占用而被中断开始事件的回调函数 */
  callback: OnInterruptionBeginCallback): Unit = js.native
  /** [RecorderManager.onInterruptionEnd(function callback)](RecorderManager.onInterruptionEnd.md)
    *
    * 监听录音中断结束事件。在收到 interruptionBegin 事件之后，小程序内所有录音会暂停，收到此事件之后才可再次录音成功。
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionEnd(/** 录音中断结束事件的回调函数 */
  callback: OnInterruptionEndCallback): Unit = js.native
  /** [RecorderManager.onPause(function callback)](RecorderManager.onPause.md)
    *
    * 监听录音暂停事件 */
  def onPause(/** 录音暂停事件的回调函数 */
  callback: RecorderManagerOnPauseCallback): Unit = js.native
  /** [RecorderManager.onResume(function callback)](RecorderManager.onResume.md)
    *
    * 监听录音继续事件 */
  def onResume(/** 录音继续事件的回调函数 */
  callback: OnResumeCallback): Unit = js.native
  /** [RecorderManager.onStart(function callback)](RecorderManager.onStart.md)
    *
    * 监听录音开始事件 */
  def onStart(/** 录音开始事件的回调函数 */
  callback: OnStartCallback): Unit = js.native
  /** [RecorderManager.onStop(function callback)](RecorderManager.onStop.md)
    *
    * 监听录音结束事件 */
  def onStop(/** 录音结束事件的回调函数 */
  callback: RecorderManagerOnStopCallback): Unit = js.native
  /** [RecorderManager.pause()](RecorderManager.pause.md)
    *
    * 暂停录音 */
  def pause(): Unit = js.native
  /** [RecorderManager.resume()](RecorderManager.resume.md)
    *
    * 继续录音 */
  def resume(): Unit = js.native
  /** [RecorderManager.start(Object object)](RecorderManager.start.md)
    *
    * 开始录音
    *
    * **采样率与编码码率限制**
    *
    *
    *  每种采样率有对应的编码码率范围有效值，设置不合法的采样率或编码码率会导致录音失败，具体对应关系如下表。
    *
    * | 采样率 | 编码码率       |
    * | ------ | -------------- |
    * | 8000   | 16000 ~ 48000  |
    * | 11025  | 16000 ~ 48000  |
    * | 12000  | 24000 ~ 64000  |
    * | 16000  | 24000 ~ 96000  |
    * | 22050  | 32000 ~ 128000 |
    * | 24000  | 32000 ~ 128000 |
    * | 32000  | 48000 ~ 192000 |
    * | 44100  | 64000 ~ 320000 |
    * | 48000  | 64000 ~ 320000 | */
  def start(option: RecorderManagerStartOption): Unit = js.native
  /** [RecorderManager.stop()](RecorderManager.stop.md)
    *
    * 停止录音 */
  def stop(): Unit = js.native
}

object RecorderManager {
  @scala.inline
  def apply(
    onError: RecorderManagerOnErrorCallback => Unit,
    onFrameRecorded: OnFrameRecordedCallback => Unit,
    onInterruptionBegin: OnInterruptionBeginCallback => Unit,
    onInterruptionEnd: OnInterruptionEndCallback => Unit,
    onPause: RecorderManagerOnPauseCallback => Unit,
    onResume: OnResumeCallback => Unit,
    onStart: OnStartCallback => Unit,
    onStop: RecorderManagerOnStopCallback => Unit,
    pause: () => Unit,
    resume: () => Unit,
    start: RecorderManagerStartOption => Unit,
    stop: () => Unit
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onFrameRecorded = js.Any.fromFunction1(onFrameRecorded), onInterruptionBegin = js.Any.fromFunction1(onInterruptionBegin), onInterruptionEnd = js.Any.fromFunction1(onInterruptionEnd), onPause = js.Any.fromFunction1(onPause), onResume = js.Any.fromFunction1(onResume), onStart = js.Any.fromFunction1(onStart), onStop = js.Any.fromFunction1(onStop), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RecorderManager]
  }
  @scala.inline
  implicit class RecorderManagerOps[Self <: RecorderManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: RecorderManagerOnErrorCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFrameRecorded(value: OnFrameRecordedCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFrameRecorded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnInterruptionBegin(value: OnInterruptionBeginCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnInterruptionEnd(value: OnInterruptionEndCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPause(value: RecorderManagerOnPauseCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResume(value: OnResumeCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStart(value: OnStartCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStop(value: RecorderManagerOnStopCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: RecorderManagerStartOption => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

