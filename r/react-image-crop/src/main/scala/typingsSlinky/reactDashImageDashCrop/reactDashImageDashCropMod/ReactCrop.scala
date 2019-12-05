package typingsSlinky.reactDashImageDashCrop.reactDashImageDashCropMod

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashImageDashCrop.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCrop
  extends Component[ReactCropProps, js.Object, js.Any] {
  def createCropSelection(): TagMod[Any] = js.native
  def crossOverCheck(): Unit = js.native
  def dragCrop(): Crop = js.native
  def getCropStyle(): CSSProperties = js.native
  def getNewSize(): Anon_Height = js.native
  def makeNewCrop(): Crop = js.native
  def onComponentKeyDown(e: MouseEvent): Unit = js.native
  def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
  def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
  def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
  def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
  def onImageLoad(image: HTMLImageElement): Unit = js.native
  def resizeCrop(): Crop = js.native
  def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  def straightenYPath(clientX: Double): Double = js.native
}

