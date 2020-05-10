package typingsSlinky.rmcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShowNext extends js.Object {
  var showNext: Boolean = js.native
  var showPrev: Boolean = js.native
  var transform: String = js.native
}

object AnonShowNext {
  @scala.inline
  def apply(showNext: Boolean, showPrev: Boolean, transform: String): AnonShowNext = {
    val __obj = js.Dynamic.literal(showNext = showNext.asInstanceOf[js.Any], showPrev = showPrev.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowNext]
  }
  @scala.inline
  implicit class AnonShowNextOps[Self <: AnonShowNext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPrev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

