package typingsSlinky.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Masonry extends js.Object {
  var columnWidth: js.UndefOr[Double | String] = js.native
  var fitWidth: js.UndefOr[Boolean] = js.native
  var gutter: js.UndefOr[Double | String] = js.native
}

object Masonry {
  @scala.inline
  def apply(): Masonry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Masonry]
  }
  @scala.inline
  implicit class MasonryOps[Self <: Masonry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFitWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
  }
  
}

