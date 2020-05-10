package typingsSlinky.qrcode.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", "toCanvas")
@js.native
object toCanvas extends js.Object {
  def apply(canvasElement: HTMLCanvasElement, text: String): js.Promise[_] = js.native
  def apply(canvasElement: HTMLCanvasElement, text: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(canvas: js.Any, text: String): js.Promise[_] = js.native
  def apply(canvas: js.Any, text: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def apply(canvas: js.Any, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    canvas: js.Any,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(canvas: js.Any, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def apply(canvas: js.Any, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def apply(canvas: js.Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    canvas: js.Any,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(text: String): js.Promise[_] = js.native
  def apply(text: String, callback: js.Function2[/* error */ js.Error, /* canvas */ HTMLCanvasElement, Unit]): Unit = js.native
  def apply(text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ js.Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def apply(text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def apply(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ js.Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def apply(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def apply(
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ js.Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
}

