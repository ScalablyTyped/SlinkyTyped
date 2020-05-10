package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  var `full-color`: js.UndefOr[Double] = js.native
  var monochrome: js.UndefOr[Double] = js.native
}

object Pages {
  @scala.inline
  def apply(): Pages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pages]
  }
  @scala.inline
  implicit class PagesOps[Self <: Pages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFull-color`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFull-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
  }
  
}

