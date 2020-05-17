package typingsSlinky.phaser.Phaser.Animations

import typingsSlinky.phaser.Phaser.Textures.Frame
import typingsSlinky.phaser.Phaser.Types.Animations.JSONAnimationFrame
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single frame in an Animation sequence.
  * 
  * An AnimationFrame consists of a reference to the Texture it uses for rendering, references to other
  * frames in the animation, and index data. It also has the ability to modify the animation timing.
  * 
  * AnimationFrames are generated automatically by the Animation class.
  */
@js.native
trait AnimationFrame extends js.Object {
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    * The value is added onto the msPerFrame set by the animation.
    */
  var duration: Double = js.native
  /**
    * A reference to the Texture Frame this AnimationFrame uses for rendering.
    */
  var frame: Frame = js.native
  /**
    * The index of this AnimationFrame within the Animation sequence.
    */
  var index: integer = js.native
  /**
    * Is this the first frame in an animation sequence?
    */
  val isFirst: Boolean = js.native
  /**
    * Is this the last frame in an animation sequence?
    */
  val isLast: Boolean = js.native
  /**
    * A reference to the AnimationFrame that comes after this one in the animation, if any.
    */
  val nextFrame: AnimationFrame = js.native
  /**
    * A reference to the AnimationFrame that comes before this one in the animation, if any.
    */
  val prevFrame: AnimationFrame = js.native
  /**
    * What % through the animation does this frame come?
    * This value is generated when the animation is created and cached here.
    */
  val progress: Double = js.native
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var textureFrame: String | integer = js.native
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var textureKey: String = js.native
  /**
    * Destroys this object by removing references to external resources and callbacks.
    */
  def destroy(): Unit = js.native
  /**
    * Generates a JavaScript object suitable for converting to JSON.
    */
  def toJSON(): JSONAnimationFrame = js.native
}

object AnimationFrame {
  @scala.inline
  def apply(
    destroy: () => Unit,
    duration: Double,
    frame: Frame,
    index: integer,
    isFirst: Boolean,
    isLast: Boolean,
    nextFrame: AnimationFrame,
    prevFrame: AnimationFrame,
    progress: Double,
    textureFrame: String | integer,
    textureKey: String,
    toJSON: () => JSONAnimationFrame
  ): AnimationFrame = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], nextFrame = nextFrame.asInstanceOf[js.Any], prevFrame = prevFrame.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], textureFrame = textureFrame.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AnimationFrame]
  }
  @scala.inline
  implicit class AnimationFrameOps[Self <: AnimationFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextFrame(value: AnimationFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevFrame(value: AnimationFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureFrame(value: String | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => JSONAnimationFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

