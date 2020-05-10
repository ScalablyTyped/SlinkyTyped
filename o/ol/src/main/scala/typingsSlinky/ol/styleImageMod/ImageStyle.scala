package typingsSlinky.ol.styleImageMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageStyle extends js.Object {
  def getAnchor(): js.Array[Double] = js.native
  def getDisplacement(): js.Array[Double] = js.native
  def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  def getHitDetectionImageSize(): Size = js.native
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  def getImageSize(): Size = js.native
  def getImageState(): ImageState = js.native
  def getOpacity(): Double = js.native
  def getOrigin(): js.Array[Double] = js.native
  def getRotateWithView(): Boolean = js.native
  def getRotation(): Double = js.native
  def getScale(): Double = js.native
  def getSize(): Size = js.native
  def listenImageChange[T](listener: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit]): Unit = js.native
  def load(): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def unlistenImageChange[T](listener: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit]): Unit = js.native
}

object ImageStyle {
  @scala.inline
  def apply(
    getAnchor: () => js.Array[Double],
    getDisplacement: () => js.Array[Double],
    getHitDetectionImage: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement,
    getHitDetectionImageSize: () => Size,
    getImage: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement,
    getImageSize: () => Size,
    getImageState: () => ImageState,
    getOpacity: () => Double,
    getOrigin: () => js.Array[Double],
    getRotateWithView: () => Boolean,
    getRotation: () => Double,
    getScale: () => Double,
    getSize: () => Size,
    listenImageChange: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit] => Unit,
    load: () => Unit,
    setOpacity: Double => Unit,
    setRotateWithView: Boolean => Unit,
    setRotation: Double => Unit,
    setScale: Double => Unit,
    unlistenImageChange: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit] => Unit
  ): ImageStyle = {
    val __obj = js.Dynamic.literal(getAnchor = js.Any.fromFunction0(getAnchor), getDisplacement = js.Any.fromFunction0(getDisplacement), getHitDetectionImage = js.Any.fromFunction1(getHitDetectionImage), getHitDetectionImageSize = js.Any.fromFunction0(getHitDetectionImageSize), getImage = js.Any.fromFunction1(getImage), getImageSize = js.Any.fromFunction0(getImageSize), getImageState = js.Any.fromFunction0(getImageState), getOpacity = js.Any.fromFunction0(getOpacity), getOrigin = js.Any.fromFunction0(getOrigin), getRotateWithView = js.Any.fromFunction0(getRotateWithView), getRotation = js.Any.fromFunction0(getRotation), getScale = js.Any.fromFunction0(getScale), getSize = js.Any.fromFunction0(getSize), listenImageChange = js.Any.fromFunction1(listenImageChange), load = js.Any.fromFunction0(load), setOpacity = js.Any.fromFunction1(setOpacity), setRotateWithView = js.Any.fromFunction1(setRotateWithView), setRotation = js.Any.fromFunction1(setRotation), setScale = js.Any.fromFunction1(setScale), unlistenImageChange = js.Any.fromFunction1(unlistenImageChange))
    __obj.asInstanceOf[ImageStyle]
  }
  @scala.inline
  implicit class ImageStyleOps[Self <: ImageStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnchor(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplacement(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplacement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHitDetectionImage(value: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHitDetectionImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHitDetectionImageSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHitDetectionImageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImage(value: Double => HTMLCanvasElement | HTMLVideoElement | HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImageSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImageState(value: () => ImageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrigin(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRotateWithView(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotateWithView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRotation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScale(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListenImageChange(value: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenImageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRotateWithView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotateWithView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRotation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScale(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlistenImageChange(value: js.Function1[/* p0 */ typingsSlinky.ol.eventMod.default, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistenImageChange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

