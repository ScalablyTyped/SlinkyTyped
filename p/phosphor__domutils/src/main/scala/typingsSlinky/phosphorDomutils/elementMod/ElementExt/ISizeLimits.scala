package typingsSlinky.phosphorDomutils.elementMod.ElementExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the min and max size data for an element.
  */
@js.native
trait ISizeLimits extends js.Object {
  /**
    * The maximum height, in pixels.
    */
  var maxHeight: Double = js.native
  /**
    * The maximum width, in pixels.
    */
  var maxWidth: Double = js.native
  /**
    * The minimum height, in pixels.
    */
  var minHeight: Double = js.native
  /**
    * The minimum width, in pixels.
    */
  var minWidth: Double = js.native
}

object ISizeLimits {
  @scala.inline
  def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): ISizeLimits = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizeLimits]
  }
  @scala.inline
  implicit class ISizeLimitsOps[Self <: ISizeLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

