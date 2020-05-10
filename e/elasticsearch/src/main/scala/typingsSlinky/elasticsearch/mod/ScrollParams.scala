package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollParams extends GenericParams {
  var scroll: TimeSpan = js.native
  var scrollId: String = js.native
}

object ScrollParams {
  @scala.inline
  def apply(scroll: TimeSpan, scrollId: String): ScrollParams = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollParams]
  }
  @scala.inline
  implicit class ScrollParamsOps[Self <: ScrollParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScroll(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

