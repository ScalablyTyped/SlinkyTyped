package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Capture extends js.Object {
  
  def captureAudio(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit]
  ): Unit = js.native
  def captureAudio(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit],
    options: CaptureAudioOptions
  ): Unit = js.native
  
  def captureImage(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit]
  ): Unit = js.native
  def captureImage(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit],
    options: CaptureImageOptions
  ): Unit = js.native
  
  def captureVideo(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit]
  ): Unit = js.native
  def captureVideo(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], Unit],
    captureError: js.Function1[/* error */ CaptureError, Unit],
    options: CaptureImageOptions
  ): Unit = js.native
}
