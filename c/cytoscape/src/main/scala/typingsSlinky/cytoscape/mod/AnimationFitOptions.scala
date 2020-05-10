package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/animation
  *
  */
@js.native
trait AnimationFitOptions extends js.Object {
  var eles: CollectionArgument | Selector = js.native
   // to which the viewport will be fitted.
  var padding: Double = js.native
}

object AnimationFitOptions {
  @scala.inline
  def apply(eles: CollectionArgument | Selector, padding: Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFitOptions]
  }
  @scala.inline
  implicit class AnimationFitOptionsOps[Self <: AnimationFitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEles(value: CollectionArgument | Selector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

