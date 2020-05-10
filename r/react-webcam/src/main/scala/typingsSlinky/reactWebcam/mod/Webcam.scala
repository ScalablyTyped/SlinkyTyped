package typingsSlinky.reactWebcam.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends Component[WebcamProps with HTMLAttributes[HTMLVideoElement], WebcamState, js.Any] {
  var canvas: HTMLCanvasElement = js.native
  var ctx: CanvasRenderingContext2D | Null = js.native
  var stream: MediaStream = js.native
  var video: HTMLVideoElement | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MWebcam(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWebcam(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWebcam(): Unit = js.native
  def getCanvas(): HTMLCanvasElement | Null = js.native
  def getScreenshot(): String | Null = js.native
  def handleUserMedia(err: js.Any): Unit = js.native
  def handleUserMedia(err: js.Any, stream: MediaStream): Unit = js.native
  def requestUserMedia(): Unit = js.native
}

