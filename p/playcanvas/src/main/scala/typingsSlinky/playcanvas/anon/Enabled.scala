package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var ind: js.UndefOr[Double] = js.native
  var preloading: js.UndefOr[Boolean] = js.native
}

object Enabled {
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ind")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloading")(js.undefined)
        ret
    }
  }
  
}

