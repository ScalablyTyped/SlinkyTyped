package typingsSlinky.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnClickSegment extends js.Object {
  var onClickSegment: js.UndefOr[js.Function] = js.native
  var onMouseoutSegment: js.UndefOr[js.Function] = js.native
  var onMouseoverSegment: js.UndefOr[js.Function] = js.native
  var onload: js.UndefOr[js.Function] = js.native
}

object AnonOnClickSegment {
  @scala.inline
  def apply(): AnonOnClickSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnClickSegment]
  }
  @scala.inline
  implicit class AnonOnClickSegmentOps[Self <: AnonOnClickSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClickSegment(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseoutSegment(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoutSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoutSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseoverSegment(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoverSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseoverSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoverSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
  }
  
}

