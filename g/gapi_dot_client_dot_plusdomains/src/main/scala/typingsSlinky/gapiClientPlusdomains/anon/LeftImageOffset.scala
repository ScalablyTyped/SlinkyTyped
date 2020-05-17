package typingsSlinky.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftImageOffset extends js.Object {
  /** The difference between the left position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var leftImageOffset: js.UndefOr[Double] = js.native
  /** The difference between the top position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var topImageOffset: js.UndefOr[Double] = js.native
}

object LeftImageOffset {
  @scala.inline
  def apply(): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftImageOffset]
  }
  @scala.inline
  implicit class LeftImageOffsetOps[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftImageOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftImageOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTopImageOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topImageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topImageOffset")(js.undefined)
        ret
    }
  }
  
}

