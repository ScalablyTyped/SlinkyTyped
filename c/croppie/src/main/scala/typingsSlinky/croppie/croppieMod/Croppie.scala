package typingsSlinky.croppie.croppieMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.croppie.Anon_Base64
import typingsSlinky.croppie.Anon_Blob
import typingsSlinky.croppie.Anon_Html
import typingsSlinky.croppie.Anon_Orientation
import typingsSlinky.croppie.Anon_Rawcanvas
import typingsSlinky.croppie.croppieNumbers.`-180`
import typingsSlinky.croppie.croppieNumbers.`-270`
import typingsSlinky.croppie.croppieNumbers.`-90`
import typingsSlinky.croppie.croppieNumbers.`180`
import typingsSlinky.croppie.croppieNumbers.`270`
import typingsSlinky.croppie.croppieNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Croppie extends js.Object {
  def bind(options: Anon_Orientation): js.Promise[Unit] = js.native
  def destroy(): Unit = js.native
  def get(): CropData = js.native
  def result(): js.Promise[HTMLCanvasElement] = js.native
  def result(
    options: (ResultOptions with (Anon_Base64 | Anon_Blob | Anon_Html | Anon_Rawcanvas)) | ResultOptions
  ): js.Promise[String] = js.native
  @JSName("rotate")
  def rotate_180(degrees: `-180`): Unit = js.native
  @JSName("rotate")
  def rotate_180(degrees: `180`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `-270`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `270`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `-90`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `90`): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
}

