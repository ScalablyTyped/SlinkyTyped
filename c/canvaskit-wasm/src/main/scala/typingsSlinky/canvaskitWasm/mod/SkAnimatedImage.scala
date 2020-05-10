package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkAnimatedImage extends SkObject[SkAnimatedImage] {
  def decodeNextFrame(): Double = js.native
  def getFrameCount(): Double = js.native
  def getRepetitionCount(): Double = js.native
  def height(): Double = js.native
  def width(): Double = js.native
}

object SkAnimatedImage {
  @scala.inline
  def apply(
    decodeNextFrame: () => Double,
    delete: () => Unit,
    deleteAfter: () => Unit,
    getFrameCount: () => Double,
    getRepetitionCount: () => Double,
    height: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    width: () => Double
  ): SkAnimatedImage = {
    val __obj = js.Dynamic.literal(decodeNextFrame = js.Any.fromFunction0(decodeNextFrame), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getFrameCount = js.Any.fromFunction0(getFrameCount), getRepetitionCount = js.Any.fromFunction0(getRepetitionCount), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SkAnimatedImage]
  }
  @scala.inline
  implicit class SkAnimatedImageOps[Self <: SkAnimatedImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodeNextFrame(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeNextFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFrameCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRepetitionCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepetitionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

