package typingsSlinky.ol.styleImageMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/Image", JSImport.Default)
@js.native
class default protected () extends ImageStyle {
  def this(options: Options) = this()
  /* CompleteClass */
  override def getAnchor(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  /* CompleteClass */
  override def getHitDetectionImageSize(): Size = js.native
  /* CompleteClass */
  override def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  /* CompleteClass */
  override def getImageSize(): Size = js.native
  /* CompleteClass */
  override def getImageState(): ImageState = js.native
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  /* CompleteClass */
  override def getOrigin(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getRotateWithView(): Boolean = js.native
  /* CompleteClass */
  override def getRotation(): Double = js.native
  /* CompleteClass */
  override def getScale(): Double = js.native
  /* CompleteClass */
  override def getSize(): Size = js.native
  /* CompleteClass */
  override def getSnapToPixel(): Boolean = js.native
  /* CompleteClass */
  override def listenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p0 */ typingsSlinky.ol.eventsEventMod.default, Unit],
    thisArg: T
  ): js.UndefOr[EventsKey] = js.native
  /* CompleteClass */
  override def load(): Unit = js.native
  /* CompleteClass */
  override def setOpacity(opacity: Double): Unit = js.native
  /* CompleteClass */
  override def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  /* CompleteClass */
  override def setRotation(rotation: Double): Unit = js.native
  /* CompleteClass */
  override def setScale(scale: Double): Unit = js.native
  /* CompleteClass */
  override def setSnapToPixel(snapToPixel: Boolean): Unit = js.native
  /* CompleteClass */
  override def unlistenImageChange[T](
    listener: js.ThisFunction1[/* this */ T, /* p0 */ typingsSlinky.ol.eventsEventMod.default, Unit],
    thisArg: T
  ): Unit = js.native
}

