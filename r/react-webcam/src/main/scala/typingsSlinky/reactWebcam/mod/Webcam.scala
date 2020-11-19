package typingsSlinky.reactWebcam.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webcam
  extends Component[WebcamProps, WebcamState, js.Any] {
  
  var canvas: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MWebcam(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWebcam(nextProps: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWebcam(): Unit = js.native
  
  var ctx: js.Any = js.native
  
  def getCanvas(): HTMLCanvasElement | Null = js.native
  def getCanvas(screenshotDimensions: ScreenshotDimensions): HTMLCanvasElement | Null = js.native
  
  def getScreenshot(): String | Null = js.native
  def getScreenshot(screenshotDimensions: ScreenshotDimensions): String | Null = js.native
  
  var handleUserMedia: js.Any = js.native
  
  var requestUserMedia: js.Any = js.native
  
  var stopAndCleanup: js.Any = js.native
  
  var stream: MediaStream | Null = js.native
  
  var video: HTMLVideoElement | Null = js.native
}
