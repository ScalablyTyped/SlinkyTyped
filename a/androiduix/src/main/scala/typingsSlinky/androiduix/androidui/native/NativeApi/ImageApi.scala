package typingsSlinky.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageApi extends js.Object {
  def createImage(imageId: Double): Unit = js.native
  def getPixels(imageId: Double, callbackIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def loadImage(imageId: Double, src: String): Unit = js.native
  def recycleImage(imageId: Double): Unit = js.native
}

object ImageApi {
  @scala.inline
  def apply(
    createImage: Double => Unit,
    getPixels: (Double, Double, Double, Double, Double, Double) => Unit,
    loadImage: (Double, String) => Unit,
    recycleImage: Double => Unit
  ): ImageApi = {
    val __obj = js.Dynamic.literal(createImage = js.Any.fromFunction1(createImage), getPixels = js.Any.fromFunction6(getPixels), loadImage = js.Any.fromFunction2(loadImage), recycleImage = js.Any.fromFunction1(recycleImage))
    __obj.asInstanceOf[ImageApi]
  }
  @scala.inline
  implicit class ImageApiOps[Self <: ImageApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPixels(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPixels")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withLoadImage(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadImage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRecycleImage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycleImage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

