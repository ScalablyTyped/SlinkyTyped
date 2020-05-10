package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  isScrolling  :boolean} & react-virtualized.react-virtualized.SizeInfo */
@js.native
trait isScrollingbooleanSizeInf extends js.Object {
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var width: Double = js.native
}

object isScrollingbooleanSizeInf {
  @scala.inline
  def apply(height: Double, isScrolling: Boolean, width: Double): isScrollingbooleanSizeInf = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[isScrollingbooleanSizeInf]
  }
  @scala.inline
  implicit class isScrollingbooleanSizeInfOps[Self <: isScrollingbooleanSizeInf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

