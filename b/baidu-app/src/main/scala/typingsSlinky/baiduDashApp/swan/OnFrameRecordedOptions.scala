package typingsSlinky.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFrameRecordedOptions extends js.Object {
  /**  录音分片结果数据 */
  var frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean
}

object OnFrameRecordedOptions {
  @scala.inline
  def apply(frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
}

