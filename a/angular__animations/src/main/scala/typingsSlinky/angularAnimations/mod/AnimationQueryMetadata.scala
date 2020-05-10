package typingsSlinky.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationQueryMetadata extends AnimationMetadata {
  /**
    * One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  /**
    * A query options object.
    */
  var options: AnimationQueryOptions | Null = js.native
  /**
    *  The CSS selector for this query.
    */
  var selector: String = js.native
}

object AnimationQueryMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    selector: String,
    `type`: AnimationMetadataType
  ): AnimationQueryMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationQueryMetadata]
  }
  @scala.inline
  implicit class AnimationQueryMetadataOps[Self <: AnimationQueryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnimationQueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
  }
  
}

