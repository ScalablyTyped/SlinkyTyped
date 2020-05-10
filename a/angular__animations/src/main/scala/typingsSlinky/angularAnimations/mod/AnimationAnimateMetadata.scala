package typingsSlinky.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationAnimateMetadata extends AnimationMetadata {
  /**
    * A set of styles used in the step.
    */
  var styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata | Null = js.native
  /**
    * The timing data for the step.
    */
  var timings: String | Double | AnimateTimings = js.native
}

object AnimationAnimateMetadata {
  @scala.inline
  def apply(timings: String | Double | AnimateTimings, `type`: AnimationMetadataType): AnimationAnimateMetadata = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateMetadata]
  }
  @scala.inline
  implicit class AnimationAnimateMetadataOps[Self <: AnimationAnimateMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimings(value: String | Double | AnimateTimings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(null)
        ret
    }
  }
  
}

