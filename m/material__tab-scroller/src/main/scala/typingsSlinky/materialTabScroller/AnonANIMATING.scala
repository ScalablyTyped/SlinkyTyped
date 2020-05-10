package typingsSlinky.materialTabScroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonANIMATING extends js.Object {
  var ANIMATING: String = js.native
  var SCROLL_AREA_SCROLL: String = js.native
  var SCROLL_TEST: String = js.native
}

object AnonANIMATING {
  @scala.inline
  def apply(ANIMATING: String, SCROLL_AREA_SCROLL: String, SCROLL_TEST: String): AnonANIMATING = {
    val __obj = js.Dynamic.literal(ANIMATING = ANIMATING.asInstanceOf[js.Any], SCROLL_AREA_SCROLL = SCROLL_AREA_SCROLL.asInstanceOf[js.Any], SCROLL_TEST = SCROLL_TEST.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonANIMATING]
  }
  @scala.inline
  implicit class AnonANIMATINGOps[Self <: AnonANIMATING] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANIMATING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCROLL_AREA_SCROLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_AREA_SCROLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCROLL_TEST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_TEST")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

