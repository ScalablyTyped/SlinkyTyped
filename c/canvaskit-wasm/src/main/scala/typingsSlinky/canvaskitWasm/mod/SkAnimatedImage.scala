package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkAnimatedImage extends EmbindObject[SkAnimatedImage] {
  
  /**
    * Decodes the next frame. Returns -1 when the animation is on the last frame.
    */
  def decodeNextFrame(): Double = js.native
  
  /**
    * Return the total number of frames in the animation.
    */
  def getFrameCount(): Double = js.native
  
  /**
    * Return the repetition count for this animation.
    */
  def getRepetitionCount(): Double = js.native
  
  /**
    * Returns the possibly scaled height of the image.
    */
  def height(): Double = js.native
  
  /**
    * Returns a still image of the current frame or null if there is no current frame.
    */
  def makeImageAtCurrentFrame(): SkImage | Null = js.native
  
  /**
    * Reset the animation to the beginning.
    */
  def reset(): Unit = js.native
  
  /**
    * Returns the possibly scaled width of the image.
    */
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
    makeImageAtCurrentFrame: () => SkImage | Null,
    reset: () => Unit,
    width: () => Double
  ): SkAnimatedImage = {
    val __obj = js.Dynamic.literal(decodeNextFrame = js.Any.fromFunction0(decodeNextFrame), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getFrameCount = js.Any.fromFunction0(getFrameCount), getRepetitionCount = js.Any.fromFunction0(getRepetitionCount), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), makeImageAtCurrentFrame = js.Any.fromFunction0(makeImageAtCurrentFrame), reset = js.Any.fromFunction0(reset), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SkAnimatedImage]
  }
  
  @scala.inline
  implicit class SkAnimatedImageOps[Self <: SkAnimatedImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecodeNextFrame(value: () => Double): Self = this.set("decodeNextFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrameCount(value: () => Double): Self = this.set("getFrameCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRepetitionCount(value: () => Double): Self = this.set("getRepetitionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeImageAtCurrentFrame(value: () => SkImage | Null): Self = this.set("makeImageAtCurrentFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
}
