package typingsSlinky.highchartsNg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.native
  var currentMin: js.UndefOr[Double] = js.native
  var title: js.UndefOr[AnonText] = js.native
}

object AnonCurrentMax {
  @scala.inline
  def apply(): AnonCurrentMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrentMax]
  }
  @scala.inline
  implicit class AnonCurrentMaxOps[Self <: AnonCurrentMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMax")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: AnonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

